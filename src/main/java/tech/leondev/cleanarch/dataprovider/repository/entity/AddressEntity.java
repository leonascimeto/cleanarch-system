package tech.leondev.cleanarch.dataprovider.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {
    private String street;

    private String city;

    private AddressEntity state;
}
