package com.kurvecli.dadJoke.commands;

import com.kurvecli.dadJoke.client.DadJokeClient;
import com.kurvecli.dadJoke.model.DadJokesResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    public DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }

    @ShellMethod(key = "random", value = "I will return a random dad joke")
    public String getRandomDadJokes(){
        DadJokesResponse random = dadJokeClient.random();
        return random.joke();
    }

}
