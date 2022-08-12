package com.SSFAssessment.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SSFAssessment.model.Articles;

@Controller
@RequestMapping (value = "/", method = RequestMethod.GET, headers = "Accept=text/html")

public class NewsController {

   @GetMapping
    //public String getArticles(@RequestParam(required = true) String articles){
    public String getArticles(Model model){
        ArrayList<Articles> getArticlesList = new ArrayList<>();
        return "index";
    }

  

    @PostMapping ("/")
    public String saveArticles(Model model){
    return "index";
    
  }    
    
}
