package tech.leondev.cleanarch.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpg;
    @NotBlank
    private String zipCode;
}
