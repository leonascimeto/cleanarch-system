package tech.leondev.cleanarch.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.leondev.cleanarch.dataprovider.client.response.AddressResponse;

@FeignClient(
        name = "findAddressByZipCodeClient",
        url = "${leondev.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
