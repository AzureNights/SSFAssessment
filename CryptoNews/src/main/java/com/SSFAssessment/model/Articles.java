package com.SSFAssessment.model;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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


    public static Articles create(List json) throws IOException{
        Articles a = new Articles();
        try(InputStream is = new ByteArrayInputStream(json.getBytes())) {
            JsonReader r = Json.createReader(is);
            JsonObject o = r.readObject();
            logger.info(o.toString());
            



            //cont with instantiating new object 
            
            a.id = a.getString(id);
            a.published_on = a.getString(published_on);
            a.title = a.getString(title);
            a.url = a.getString(url);
            a.imageurl = a.getString(imageurl);
            a.body = a.getString(body);
            a.tags = a.getString(tags);
            a.categories = a.getString(categories);
        


            getArticlesList.add(a);

        }
    }




   

    

    

    
}
