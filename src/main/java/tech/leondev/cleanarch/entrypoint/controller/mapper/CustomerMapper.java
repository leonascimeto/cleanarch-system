package tech.leondev.cleanarch.entrypoint.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tech.leondev.cleanarch.core.domain.Customer;
import tech.leondev.cleanarch.entrypoint.controller.request.CustomerRequest;
import tech.leondev.cleanarch.entrypoint.controller.response.CustomerResponse;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "idCustomer", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
