// cerner_2^5_2019
// Simple HTTP server that performs operations on MongoDB written in TypeScript
import { createServer, IncomingMessage, ServerResponse } from 'http';
import { MongoClient, ObjectID } from 'mongodb';
var url = require('url');

var mongoUrl = 'mongodb://localhost:27017/';

createServer((req: IncomingMessage, res: ServerResponse): void => {
    MongoClient.connect(mongoUrl, (err: Error, db: MongoClient): void => {
        if(err) throw err;

        var dbo = db.db('mydb');
        var q = url.parse(req.url, true);
        if(q.pathname === '/add') {
            dbo.collection('query').insertOne(q.query, (err: Error, result: any): void => {
                if(err) throw err;
                res.write('Inserted: ' + result);
                res.end();
            });
        } else if(q.pathname === '/delete') {
            dbo.collection('query').deleteOne({ _id: new ObjectID(q.query.id) }, (err: Error, result: any): void => {
                if(err) throw err;
                res.write('Deleted: ' + result);
                res.end();
            });
        } else {
            dbo.collection('query').find().limit(10).toArray((err: Error, result: any): void => {
                if(err) throw err;
                res.write(JSON.stringify(result, null, 4));
                res.end();
            });
        }
        db.close();
    });
}).listen(8080);