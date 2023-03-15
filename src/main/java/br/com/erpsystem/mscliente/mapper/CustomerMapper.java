package br.com.erpsystem.mscliente.mapper;

import br.com.erpsystem.mscliente.dto.CustomerDTO;
import br.com.erpsystem.mscliente.entity.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer clienteDtoToCliente(CustomerDTO customerDTO);
    CustomerDTO clienteToClienteDTO(Customer customer);
}