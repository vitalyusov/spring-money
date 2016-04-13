package money;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.joda.money.Money;



/**
 *
 * @author vit
 */
@Entity
public class Transaction {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    
    private LocalDateTime transactionDate;
    
    @ManyToOne
    private Account account;
    private Money sumDt;
    private Money sumCt;

    public Transaction(long id,LocalDateTime transactionDate, Account account, Money sumDt, Money sumCt) {
        //Account rebalancedAcc = 
        this.id = id;
        this.transactionDate = transactionDate;
        this.account = account;
        this.sumDt = sumDt;
        this.sumCt = sumCt;
        
    }
    
    public Account run(){
        
        return new Account(account.getId(), account.getName(), account.getDescription(), account.getBalance().plus(sumDt).minus(sumCt));
    }
}
