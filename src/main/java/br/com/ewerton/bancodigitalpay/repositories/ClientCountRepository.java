package br.com.ewerton.bancodigitalpay.repositories;

import br.com.ewerton.bancodigitalpay.entities.ClientCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCountRepository extends JpaRepository<ClientCount, Long> {
}
