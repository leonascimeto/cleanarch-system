package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.InsertCustomer;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.dataprovider.repository.CustomerRepository;
import tech.leondev.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;

@RequiredArgsConstructor
@Component
public class InsertCustomerImpl implements InsertCustomer {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
