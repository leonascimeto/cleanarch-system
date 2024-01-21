package tech.leondev.cleanarch.core.usecase;

import tech.leondev.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
