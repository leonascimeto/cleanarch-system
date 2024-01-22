package tech.leondev.cleanarch.entrypoint.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.usecase.UpdateCustomerUseCase;
import tech.leondev.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import tech.leondev.cleanarch.entrypoint.consumer.message.CustomerMessage;

@RequiredArgsConstructor
@Log4j2
@Component
public class ReceiveValidateCpfConsumer {

    private final UpdateCustomerUseCase updateCustomerUseCase;
    private final CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "leondev")
    public void receive(final CustomerMessage customerMessage) {
        log.info("Received message: {}", customerMessage);
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
