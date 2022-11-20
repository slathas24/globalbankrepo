package in.brainupgrade.customerservice.service;

import java.util.List;

import in.brainupgrade.customerservice.model.AuthenticationResponse;
import in.brainupgrade.customerservice.model.CustomerEntity;

public interface CustomerService {

	public CustomerEntity createCustomer(String token, CustomerEntity customer);

	public CustomerEntity getCustomerDetail(String tokrn, String id);

	public AuthenticationResponse hasEmployeePermission(String token);

	public boolean deleteCustomer(String id);

	public AuthenticationResponse hasCustomerPermission(String token);

	public AuthenticationResponse hasPermission(String token);

	public CustomerEntity saveCustomer(String token, CustomerEntity customer);

	public CustomerEntity updateCustomer(String token, CustomerEntity customer);

	public List<CustomerEntity> getCustomers(String token);

}
