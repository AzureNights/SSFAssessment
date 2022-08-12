package com.SSFAssessment.service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class NewsService {
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);

    private static String URL = "https://min-api.cryptocompare.com/data/v2/news";

    @Value("${check");
    //private string apiKey;


    public Optional<News> getArticles(){
        String apikey = System.getenv("CRYPTO_API_KEY");
        String cryptoUrl = UriComponentsBuilder.fromUriString(URL)
            .queryParam("id", values)

    }


    /*
     * @return
     */
    List <String> getArticles(String){
        List <String> articleList = new ArrayList<>();
        for (int i=1; i>=0; i++){
            articlesList.add();
            
        }

    }


    public List<News> getArticles (String article) {
        Optio
    }
    



    
}
