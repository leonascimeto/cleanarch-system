package tech.leondev.cleanarch.entrypoint.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.leondev.cleanarch.core.usecase.InsertCustomerUseCase;
import tech.leondev.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import tech.leondev.cleanarch.entrypoint.controller.request.CustomerRequest;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final InsertCustomerUseCase insertCustomerUseCase;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
