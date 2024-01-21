package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.DeleteCustomerById;
import tech.leondev.cleanarch.dataprovider.repository.CustomerRepository;

@RequiredArgsConstructor
@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    private final CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
