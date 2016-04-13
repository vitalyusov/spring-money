package money;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vit
 */

//@Entity
public class User {
    
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String name;
    private List<Account> accounts;
    
    
    protected User(){};
    
    public User(String name, List<Account> accs) {
        this.name = name;
        this.accounts = accs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    
}
