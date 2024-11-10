package br.com.ewerton.bancodigitalpay.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class ClientCountServices {


    private EntityManager entityManager;

    public String gerarNumeroContaUnico() {
        String numeroConta;

        do {
            numeroConta = String.format("%08d", new Random().nextInt(1000000000));
        } while (contaExiste(numeroConta));
        return numeroConta;
    }

    private boolean contaExiste(String numeroConta) {
        try {
            entityManager.createQuery("SELECT c FROM ClientCount c WHERE c.numberCount = :numeroConta").setParameter("numeroConta", numeroConta).getSingleResult();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }

}
