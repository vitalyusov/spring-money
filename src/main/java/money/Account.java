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
    private int balance;

    protected Account(){}

    public Account(long id, String name, String description, int balance) {
        //this.id = id;
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
        return "Account{id="+ id + ", name=" + name + ", description=" + description + ", balance= "+ balance+"}";
    }

    public int getBalance() {
        return balance;
    }
    
    
    
}
