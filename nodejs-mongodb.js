// Generated by CoffeeScript 2.4.1
(function() {
  // cerner_2^5_2019
  // Simple HTTP server that performs operations on MongoDB written in CoffeeScript
  var http, mongoUrl, mongodb, url;

  http = require("http");

  mongodb = require("mongodb");

  url = require("url");

  mongoUrl = "mongodb://localhost:27017/";

  http.createServer(function(req, res) {
    return mongodb.MongoClient.connect(mongoUrl, function(err, db) {
      var collection, q;
      if (err != null) {
        throw err;
      }
      collection = db.db("mydb").collection("query");
      q = url.parse(req.url, true);
      switch (q.pathname) {
        case "/add":
          collection.insertOne(q.query, function(err, result) {
            if (err != null) {
              throw err;
            }
            res.write(`Inserted: ${result}`);
            return res.end();
          });
          break;
        case "/delete":
          collection.deleteOne({
            _id: new mongodb.ObjectID(q.query.id)
          }, function(err, result) {
            if (err != null) {
              throw err;
            }
            res.write(`Deleted: ${result}`);
            return res.end();
          });
          break;
        default:
          collection.find().limit(10).toArray(function(err, result) {
            if (err != null) {
              throw err;
            }
            res.write(JSON.stringify(result, null, 4));
            return res.end();
          });
      }
      return db.close();
    });
  }).listen(8080);

}).call(this);
