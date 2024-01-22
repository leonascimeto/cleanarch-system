package tech.leondev.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.leondev.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import tech.leondev.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import tech.leondev.cleanarch.dataprovider.InsertCustomerImpl;
import tech.leondev.cleanarch.dataprovider.SendCpfForValidationImpl;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
