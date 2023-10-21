package ie.atu.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController {

    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails) {
        String confirm = String.format("Received details for %s with email %s",
        userDetails.getName(), userDetails.getEmail());
        return confirm;
    }
}




