package br.com.erpsystem.mscliente.repository;

import br.com.erpsystem.mscliente.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    Optional<Customer> findCustomerByCpf(String cpf);
}