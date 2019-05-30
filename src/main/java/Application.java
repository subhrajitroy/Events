import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

    private static int counter = 0;

    @RequestMapping("/")
    String home() {
        counter++;
        return "You are visitor number " + counter;
    }

    @RequestMapping("/reset")
    String reset() {
        counter = 0;
        return "You are visitor number " + counter;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
