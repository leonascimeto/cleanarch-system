package tech.leondev.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.leondev.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import tech.leondev.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import tech.leondev.cleanarch.dataprovider.DeleteCustomerByIdImpl;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
