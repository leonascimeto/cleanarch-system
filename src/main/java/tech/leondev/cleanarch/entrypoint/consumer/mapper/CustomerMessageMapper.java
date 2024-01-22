package tech.leondev.cleanarch.entrypoint.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.entrypoint.consumer.message.CustomerMessage;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
