package lanch;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
        System.out.println("Приложение запущено.");
//        SpringApplication.exit(ApplicationLauncher.class, args);
    }
}
