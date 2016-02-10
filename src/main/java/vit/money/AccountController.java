package vit.money;

/**
 *
 * @author vit
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    
    @Autowired
    AccountRepository repository;
    
    @RequestMapping("/accounts")
    public List<Account> getAcounts() {
        return (List<Account>) repository.findAll();
    }
}
