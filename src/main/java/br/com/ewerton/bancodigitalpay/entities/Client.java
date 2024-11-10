package br.com.ewerton.bancodigitalpay.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @NotBlank
    @Column(name = "client_name")
    private String clientName;

    @NotBlank
    @Column(name = "client_cpf")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
    private String clientCPF;

    @Email
    @NotBlank
    @Column(name = "client_email")
    private String clientEmail;

    @NotBlank
    @Column(name = "client_adress")
    private String clientAddress;

    @NotBlank
    @Column(name = "client_key_pix", nullable = false, unique = true)
    private String clientKeyPix;

    @NotBlank
    @Column(name = "client_phone_number", nullable = false, unique = true)
    private String clientPhoneNumber;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private ClientCount clientCount;

    @NotBlank
    private Date clientDateBirth;

    @NotBlank
    private String clientPassword;

    public Client() {
    }

    public Client(Long idClient, String clientName, String clientCPF, String clientEmail, String clientAddress, String clientKeyPix, String clientPhoneNumber, ClientCount clientCount, Date clientDateBirth, String clientPassword) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.clientCPF = clientCPF;
        this.clientEmail = clientEmail;
        this.clientAddress = clientAddress;
        this.clientKeyPix = clientKeyPix;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientCount = clientCount;
        this.clientDateBirth = clientDateBirth;
        this.clientPassword = clientPassword;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public @NotBlank String getClientName() {
        return clientName;
    }

    public void setClientName(@NotBlank String clientName) {
        this.clientName = clientName;
    }

    public @NotBlank @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") String getClientCPF() {
        return clientCPF;
    }

    public void setClientCPF(@NotBlank @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}") String clientCPF) {
        this.clientCPF = clientCPF;
    }

    public @Email @NotBlank String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(@Email @NotBlank String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public @NotBlank String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(@NotBlank String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public @NotBlank String getClientKeyPix() {
        return clientKeyPix;
    }

    public void setClientKeyPix(@NotBlank String clientKeyPix) {
        this.clientKeyPix = clientKeyPix;
    }

    public @NotBlank String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(@NotBlank String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public ClientCount getClientCount() {
        return clientCount;
    }

    public void setClientCount(ClientCount clientCount) {
        this.clientCount = clientCount;
    }

    public @NotBlank Date getClientDateBirth() {
        return clientDateBirth;
    }

    public void setClientDateBirth(@NotBlank Date clientDateBirth) {
        this.clientDateBirth = clientDateBirth;
    }

    public @NotBlank String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(@NotBlank String clientPassword) {
        this.clientPassword = clientPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getIdClient(), client.getIdClient()) && Objects.equals(getClientName(), client.getClientName()) && Objects.equals(getClientCPF(), client.getClientCPF()) && Objects.equals(getClientEmail(), client.getClientEmail()) && Objects.equals(getClientAddress(), client.getClientAddress()) && Objects.equals(getClientKeyPix(), client.getClientKeyPix()) && Objects.equals(getClientPhoneNumber(), client.getClientPhoneNumber()) && Objects.equals(getClientCount(), client.getClientCount()) && Objects.equals(getClientDateBirth(), client.getClientDateBirth()) && Objects.equals(getClientPassword(), client.getClientPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdClient(), getClientName(), getClientCPF(), getClientEmail(), getClientAddress(), getClientKeyPix(), getClientPhoneNumber(), getClientCount(), getClientDateBirth(), getClientPassword());
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", clientName='" + clientName + '\'' +
                ", clientCPF='" + clientCPF + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", clientKeyPix='" + clientKeyPix + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", clientCount=" + clientCount +
                ", clientDateBirth=" + clientDateBirth +
                ", clientPassword='" + clientPassword + '\'' +
                '}';
    }
}
