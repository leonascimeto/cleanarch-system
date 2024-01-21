package tech.leondev.cleanarch.dataprovider.repository.mapper;

import org.mapstruct.Mapper;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.dataprovider.repository.entity.CustomerEntity;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
