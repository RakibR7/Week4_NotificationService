package ie.atu.NotificationService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notification")
    public String confirm(@RequestBody UserDetails userDetails) {
        String message = String.format("Received details for %s registration %s",
        userDetails.getName(), userDetails.getEmail());
        return message;
    }
}




