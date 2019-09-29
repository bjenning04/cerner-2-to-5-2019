// cerner_2^5_2019
// Simple HTTP server that performs operations on MongoDB
var http = require('http');
var mongodb = require('mongodb');
var url = require('url');

var mongoUrl = 'mongodb://localhost:27017/';

http.createServer(function(req, res) {
    mongodb.MongoClient.connect(mongoUrl, function(err, db) {
        if(err) throw err;

        var dbo = db.db('mydb');
        var q = url.parse(req.url, true);
        if(q.pathname === '/add') {
            dbo.collection('query').insertOne(q.query, function(err, result) {
                if(err) throw err;
                res.write('Inserted: ' + result);
                res.end();
            });
        } else if(q.pathname === '/delete') {
            dbo.collection('query').deleteOne({ _id: new mongodb.ObjectID(q.query.id) }, function(err, result) {
                if(err) throw err;
                res.write('Deleted: ' + result);
                res.end();
            });
        } else {
            dbo.collection('query').find().limit(10).toArray(function(err, result) {
                if(err) throw err;
                res.write(JSON.stringify(result, null, 4));
                res.end();
            });
        }
        db.close();
    });
}).listen(8080);