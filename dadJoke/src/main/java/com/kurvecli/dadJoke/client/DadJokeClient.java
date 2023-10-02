package com.kurvecli.dadJoke.client;

import com.kurvecli.dadJoke.model.DadJokesResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {

//    GET https://icanhazdadjoke.com/

    @GetExchange("/")
    DadJokesResponse random();

}
