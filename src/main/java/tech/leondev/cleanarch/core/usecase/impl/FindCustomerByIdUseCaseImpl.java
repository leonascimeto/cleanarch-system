package tech.leondev.cleanarch.core.usecase.impl;

import tech.leondev.cleanarch.core.dataprovider.FindCustomerById;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(
            FindCustomerById findCustomerById
    ) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
