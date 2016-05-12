package money;

import java.util.Date;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vit
 */
public class TransactionTest {
    private Account acc;
    private static final int TEST_AMOUNT_DT =  10;
    public TransactionTest() {
    }
    
    @Before
    public void setUp() {
        acc = new Account(1, "x", "y",  0);
    }

    @org.junit.Test
    public void testTransactionRuns() {
        
        Transaction trn = new Transaction(1, new Date() , acc, TEST_AMOUNT_DT, 0);
        Account accMod = trn.run();
        assertEquals("Account is not the same", true,  acc.getId() == accMod.getId());
        assertTrue("Incorrect account modification", accMod.getBalance() == TEST_AMOUNT_DT);
    }
    
}
