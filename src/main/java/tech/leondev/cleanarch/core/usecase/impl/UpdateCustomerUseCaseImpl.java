package tech.leondev.cleanarch.core.usecase.impl;

import tech.leondev.cleanarch.core.dataprovider.FindAddressByZipCode;
import tech.leondev.cleanarch.core.dataprovider.FindCustomerById;
import tech.leondev.cleanarch.core.dataprovider.UpdateCustomer;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.core.usecase.FindCustomerByIdUseCase;
import tech.leondev.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getIdCustomer());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
