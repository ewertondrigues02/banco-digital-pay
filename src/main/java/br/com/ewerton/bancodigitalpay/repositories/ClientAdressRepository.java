package br.com.ewerton.bancodigitalpay.repositories;

import br.com.ewerton.bancodigitalpay.entities.ClientAdress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientAdressRepository extends JpaRepository<ClientAdress, Long> {
}
