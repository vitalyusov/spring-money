package money;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vit
 */
public interface AccountRepository extends CrudRepository<Account, Long>{
    List<Account> findByName(String name);
    
}
