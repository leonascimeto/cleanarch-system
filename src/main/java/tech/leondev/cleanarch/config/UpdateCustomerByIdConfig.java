package tech.leondev.cleanarch.config;

import org.springframework.context.annotation.Configuration;
import tech.leondev.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import tech.leondev.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import tech.leondev.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import tech.leondev.cleanarch.dataprovider.UpdateCustomerImpl;

@Configuration
public class UpdateCustomerByIdConfig {

    public UpdateCustomerUseCaseImpl updateCustomerById(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
