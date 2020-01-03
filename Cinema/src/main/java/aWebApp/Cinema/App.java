package aWebApp.Cinema;

import java.sql.Date;
import java.sql.Time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Graphic;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {

		Graphic manual = new Graphic();
		SpringApplication.run(App.class, args);

	}
}
