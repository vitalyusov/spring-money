package vit.money;

/**
 *
 * @author vit
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    
    @RequestMapping("/account")
    public Account getAcount() {
        return new Account(1, "Vit's money", "");
    }
}
