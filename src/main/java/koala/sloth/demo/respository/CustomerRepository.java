package koala.sloth.demo.respository;

import koala.sloth.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Modifying
    @Transactional
    @Query("delete from Customer c where c.ID=?1")
    void deleteCustomerById(Integer ID);


}
