package tech.leondev.cleanarch.core.usecase;

import tech.leondev.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
