package in.brainupgrade.customerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.brainupgrade.customerservice.model.CustomerEntity;


@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

}
