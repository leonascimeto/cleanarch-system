package tech.leondev.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.leondev.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import tech.leondev.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import tech.leondev.cleanarch.dataprovider.InsertCustomerImpl;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}
