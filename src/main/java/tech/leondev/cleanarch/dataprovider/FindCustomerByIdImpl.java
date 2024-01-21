package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.FindCustomerById;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.dataprovider.repository.CustomerRepository;
import tech.leondev.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }
}
