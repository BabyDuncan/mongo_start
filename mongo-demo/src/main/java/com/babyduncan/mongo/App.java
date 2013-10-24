package com.babyduncan.mongo;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws UnknownHostException {

        Mongo mongo = new Mongo("192.168.0.105", 27017);
        DB db = mongo.getDB("kf");
        DBCollection collection = db.getCollection("xx");
        BasicDBObject obj = new BasicDBObject();
        obj.put("name", "ÕÔ¹úê»");
        DBCursor cursor = collection.find(obj);
        while (cursor.hasNext()) {
            System.out.println(cursor.next().toString());
        }
        cursor.close();
    }
}
