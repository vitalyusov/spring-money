package money;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author vit
 */
@Entity
public class Transaction {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    
    @ManyToOne
    private Account account;
    private int sumDt;
    private int sumCt;

    public Transaction(long id,Date transactionDate, Account account, int sumDt, int sumCt) {
        //Account rebalancedAcc = 
        this.id = id;
        this.transactionDate = transactionDate;
        this.account = account;
        this.sumDt = sumDt;
        this.sumCt = sumCt;
        
    }
    
    public Account run(){
        
        return new Account(account.getId(), account.getName(), account.getDescription(), account.getBalance() + sumDt - sumCt);
    }
}
