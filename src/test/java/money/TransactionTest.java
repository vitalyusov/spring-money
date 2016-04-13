package money;

import java.time.LocalDateTime;
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
    private static final Money TEST_AMOUNT_DT = Money.of(CurrencyUnit.USD, 10);
    public TransactionTest() {
    }
    
    @Before
    public void setUp() {
        acc = new Account(1, "x", "y", Money.of(CurrencyUnit.USD, 0));
    }

    @org.junit.Test
    public void testTransactionRuns() {
        
        Transaction trn = new Transaction(1, LocalDateTime.now(), acc, TEST_AMOUNT_DT, Money.of(CurrencyUnit.USD, 0));
        Account accMod = trn.run();
        assertEquals("Account is not the same", true,  acc.getId() == accMod.getId());
        assertTrue("Incorrect account modification", accMod.getBalance().isEqual(TEST_AMOUNT_DT));
    }
    
}
