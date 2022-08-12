package com.SSFAssessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping (value = "/", method = RequestMethod.GET, headers = "Accept=text/html")

public class NewsController {

   @GetMapping
    //public String getArticles(@RequestParam(required = true) String articles){


    //}

    @PostMapping ("/articles")
    public String saveArticles(){
        return "saveArticle";
    }




    

    
    
}
