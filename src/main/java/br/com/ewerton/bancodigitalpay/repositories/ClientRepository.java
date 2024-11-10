package br.com.ewerton.bancodigitalpay.repositories;

import br.com.ewerton.bancodigitalpay.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
