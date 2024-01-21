package tech.leondev.cleanarch.core.dataprovider;

import tech.leondev.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(String zipCode);
}
