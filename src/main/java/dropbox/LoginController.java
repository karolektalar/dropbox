package dropbox;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @RequestMapping("/login")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
