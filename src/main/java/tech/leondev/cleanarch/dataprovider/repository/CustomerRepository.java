package tech.leondev.cleanarch.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.leondev.cleanarch.dataprovider.repository.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
