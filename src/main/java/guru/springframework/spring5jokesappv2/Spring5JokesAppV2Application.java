package guru.springframework.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import guru.springframework.spring5jokesappv2.controller.JokeGeneratorController;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);

		JokeGeneratorController jokeGeneratorController = (JokeGeneratorController) ctx.getBean("jokeGeneratorController");
		System.out.println("You having a laugh mate: " + jokeGeneratorController.tellMeAJoke());

	}

}
