package ie.atu.NotificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NotificationService {
    public static void main(String[] args) {
        SpringApplication.run(NotificationService.class, args);
    }
}
