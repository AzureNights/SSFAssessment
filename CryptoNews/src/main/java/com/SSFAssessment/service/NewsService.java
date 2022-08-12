package com.SSFAssessment.service;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.SSFAssessment.model.Articles;

@Service
public class NewsService {
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);

    private static final String URL = "https://min-api.cryptocompare.com/data/v2/news";

   //@Value("${CRYPTO_API_KEY")
    //private String apiKey;

    //logger.info("why doesnt show");



    //add arraylist into the get Articles??
    public Optional <Articles> getArticles(){
    String apikey = System.getenv("CRYPTO_API_KEY");
    String cryptoUrl = UriComponentsBuilder.fromUriString(URL)
        .queryParam("lang", "EN")
        .queryParam("api_key", "apiKey")
        .toUriString();

    logger.info("Check URL" + cryptoUrl);

    RestTemplate template = new RestTemplate();
    ResponseEntity<String> resp = null;
    //should this be array 

    try{
        resp = template.getForEntity(cryptoUrl, String.class);
        Articles a = Articles.create(resp.getBody());
        return Optional.of(a);
    } catch (Exception e){
        logger.error(e.getMessage());
        e.printStackTrace();
    }

    return Optional.empty();

    }

}
    
    




    /*
     * @return
     
    List <String> getArticles(String){
        List <String> articleList = new ArrayList<>();
        for (int i=1; i>=0; i++){
            articlesList.add();
            
        }

    }


    public List<News> getArticles (String article) {
        Optio
    }
    

    */

    
