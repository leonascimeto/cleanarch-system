package tech.leondev.cleanarch.dataprovider;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import tech.leondev.cleanarch.core.dataprovider.SendCpfForValidation;

@RequiredArgsConstructor
@Component
public class SendCpfForValidationImpl implements SendCpfForValidation {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
