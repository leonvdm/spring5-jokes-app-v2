package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeGeneratorController {

    private final JokeService jokeService;

    public JokeGeneratorController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
