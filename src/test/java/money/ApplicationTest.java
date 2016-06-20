
package money;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author vit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTest {
    
    
    Account acc1;
    Account acc2;
    
    @Autowired
    AccountRepository accRepository;
    
    
    public ApplicationTest() {
    }
    
    @Before
    public void setUp(){
        acc1 = new Account(1, "first acc", "main account", 0);
        acc2 = new Account(2, "second acc", "additional account", 0);
    }

    @Test
    public void testSavingAndGettingAccounts() {
        
        accRepository.save(acc1);
        accRepository.save(acc2);
        
        assertEquals("Returned count must be 2", 2, accRepository.count());
        assertNotNull("acc1 must exist in database", accRepository.findOne(acc1.getId()));
        assertNotNull("acc2 must exist in database", accRepository.findOne(acc2.getId()));
    }
    
}
