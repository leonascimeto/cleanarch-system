package tech.leondev.cleanarch.core.dataprovider;

import tech.leondev.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
