package tech.leondev.cleanarch.core.usecase;

import tech.leondev.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    Customer find(final String id);
}
