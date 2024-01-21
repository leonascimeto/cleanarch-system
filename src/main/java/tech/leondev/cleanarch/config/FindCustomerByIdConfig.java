package tech.leondev.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.leondev.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import tech.leondev.cleanarch.dataprovider.FindCustomerByIdImpl;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
