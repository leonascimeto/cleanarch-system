package tech.leondev.cleanarch.dataprovider.client.mapper;

import org.mapstruct.Mapper;
import tech.leondev.cleanarch.core.domain.Address;
import tech.leondev.cleanarch.dataprovider.client.response.AddressResponse;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
