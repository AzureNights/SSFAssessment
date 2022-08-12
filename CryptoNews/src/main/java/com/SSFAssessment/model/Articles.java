package com.SSFAssessment.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class Articles {
    private static final Logger logger = LoggerFactory.getLogger(Articles.class);

    private String id;
    private String published_on;
    private String title;
    private String url;
    private String imageurl;
    private String body;
    private String tags;
    private String categories;

    //public List <Details> details = new ArrayList();
    static List <String> getArticlesList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublished_on() {
        return published_on;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }


    public static Articles create(String jsonlist) throws IOException{
        Articles a = new Articles();
        try(InputStream is = new ByteArrayInputStream(jsonlist.getBytes())) {
            JsonReader r = Json.createReader(is);
            JsonObject o = r.readObject();
            //logger.info(o.toString());

            // logger.info(articlelist.getString(1));

           /*
           JsonArray articlelist = o.getJsonArray("id");
           List<Articles> list = new ArrayList()<>();

           for (int i=0; i<articlelist.size(); i++){
            JsonObject jsonList = Articles.getString(id);

            getArticlesList.addAll(Articles.create(jsonlist)));

           }

           */

            //for(int i=1; i>=1; i++){
              //  JsonObject o = r.
            //}
            



            //cont with instantiating new object 
            /* 
            a.id = o.getString(id);
            a.published_on = o.getString(published_on);
            a.title = o.getString(title);
            a.url = o.getString(url);
            a.imageurl = o.getString(imageurl);
            a.body = o.getString(body);
            a.tags = o.getString(tags);
            a.categories = o.getString(categories);
        


            //getArticlesList.add(a);


            for (int i=1; i>=1; i++){
                getArticlesList.add(a.id);
                getArticlesList.add(published_on);
                getArticlesList.add(a.title);
                getArticlesList.add(a.url);
                getArticlesList.add(a.imageurl);
                getArticlesList.add(a.body);
                getArticlesList.add(a.tags);
                getArticlesList.add(a.categories);
            }

            */

        }

        
        return a;

        
    }




   

    

    

    
}
