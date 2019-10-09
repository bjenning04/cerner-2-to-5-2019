# cerner_2^5_2019
# Simple HTTP server that performs operations on MongoDB written in CoffeeScript
http = require "http"
mongodb = require "mongodb"
url = require "url"

mongoUrl = "mongodb://localhost:27017/"

http.createServer((req, res) ->
    mongodb.MongoClient.connect(mongoUrl, (err, db) ->
        throw err if err?

        collection = db.db("mydb").collection("query")
        q = url.parse(req.url, true)
        switch q.pathname
            when "/add"
                collection.insertOne(q.query, (err, result) ->
                    throw err if err?
                    res.write("Inserted: #{result}")
                    res.end()
                )
            when "/delete"
                collection.deleteOne({ _id: new mongodb.ObjectID(q.query.id) }, (err, result) ->
                    throw err if err?
                    res.write("Deleted: #{result}")
                    res.end()
                )
            else
                collection.find().limit(10).toArray((err, result) ->
                    throw err if err?
                    res.write(JSON.stringify(result, null, 4))
                    res.end()
                )
        db.close()
    )
).listen(8080)