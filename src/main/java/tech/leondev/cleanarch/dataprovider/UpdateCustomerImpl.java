package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.UpdateCustomer;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.dataprovider.repository.CustomerRepository;
import tech.leondev.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;

@RequiredArgsConstructor
@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    private final CustomerRepository customerRepository;

    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
