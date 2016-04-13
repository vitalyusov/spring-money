package money;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.joda.money.Money;

/**
 *
 * @author vit
 */

@Entity
public class Account {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private Money balance;

    protected Account(){}

    public Account(long id, String name, String description, Money balance) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.balance = balance;
    }
    
    

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Account{" + "name=" + name + ", description=" + description + '}';
    }

    public Money getBalance() {
        return balance;
    }
    
    
    
}
