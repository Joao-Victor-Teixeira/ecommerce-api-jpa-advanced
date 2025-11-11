package com.joaodev.ecommerce.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.joaodev.ecommerce.entities.enums.ClientType;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String cpf_cnpj;
    private Integer clientType;

    private List<Adress> addresses = new ArrayList<>();

    private Set<String> telephones = new HashSet<>();

    public Client(){
    }

    public Client(Long id, String name, String email, String cpf_cnpj, ClientType clientType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
        setClientType(clientType);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        if (clientType != null) {
            this.clientType = clientType.getCode();
        }
    }
    
}
