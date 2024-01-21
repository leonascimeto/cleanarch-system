package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.FindAddressByZipCode;
import tech.leondev.cleanarch.core.domain.Address;
import tech.leondev.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import tech.leondev.cleanarch.dataprovider.client.mapper.AddressResponseMapper;

@RequiredArgsConstructor
@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
