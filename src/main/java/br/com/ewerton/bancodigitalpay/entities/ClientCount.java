package br.com.ewerton.bancodigitalpay.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_client_count")
public class ClientCount implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long idCount;

    private Double balanceValue;

    @NotBlank
    private Integer numberCount;

    @NotBlank
    private Integer numberAgency;

    private Double currentBalance;

    @OneToOne
    @JoinColumn(name = "idCount")
    @PrimaryKeyJoinColumn
    private Client client;

    public ClientCount() {
    }

    public ClientCount(Long idClient, Double balanceValue, Integer numberCount, Integer numberAgency, Double currentBalance, Client client) {
        this.idCount = idClient;
        this.balanceValue = balanceValue;
        this.numberCount = numberCount;
        this.numberAgency = numberAgency;
        this.currentBalance = currentBalance;
        this.client = client;
    }

    public Long getIdCount() {
        return idCount;
    }

    public void setIdCount(Long idCount) {
        this.idCount = idCount;
    }

    public Double getBalanceValue() {
        return balanceValue;
    }

    public void setBalanceValue(Double balanceValue) {
        this.balanceValue = balanceValue;
    }

    public @NotBlank Integer getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(@NotBlank Integer numberCount) {
        this.numberCount = numberCount;
    }

    public @NotBlank Integer getNumberAgency() {
        return numberAgency;
    }

    public void setNumberAgency(@NotBlank Integer numberAgency) {
        this.numberAgency = numberAgency;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientCount that = (ClientCount) o;
        return Objects.equals(getIdCount(), that.getIdCount()) && Objects.equals(getBalanceValue(), that.getBalanceValue()) && Objects.equals(getNumberCount(), that.getNumberCount()) && Objects.equals(getNumberAgency(), that.getNumberAgency()) && Objects.equals(getCurrentBalance(), that.getCurrentBalance()) && Objects.equals(getClient(), that.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCount(), getBalanceValue(), getNumberCount(), getNumberAgency(), getCurrentBalance(), getClient());
    }

    @Override
    public String toString() {
        return "ClientCount{" +
                "idClient=" + idCount +
                ", balanceValue=" + balanceValue +
                ", numberCount=" + numberCount +
                ", numberAgency=" + numberAgency +
                ", currentBalance=" + currentBalance +
                ", client=" + client +
                '}';
    }
}
