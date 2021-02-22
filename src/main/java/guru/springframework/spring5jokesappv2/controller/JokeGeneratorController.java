package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.JokeGeneratorService;
import org.springframework.stereotype.Controller;

@Controller
public class JokeGeneratorController {

    private final JokeGeneratorService jokeGeneratorService;

    public JokeGeneratorController(JokeGeneratorService jokeGeneratorService) {
        this.jokeGeneratorService = jokeGeneratorService;
    }

    public String tellMeAJoke() {
        return jokeGeneratorService.getJoke();
    }
}
