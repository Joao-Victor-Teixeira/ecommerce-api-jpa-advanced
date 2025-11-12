package com.joaodev.ecommerce.entities;

import com.joaodev.ecommerce.entities.enums.PaymentStatus;

import jakarta.persistence.Entity;

@Entity
public class CardPayment extends Payment {
    private static final long serialVersionUID = 1L;

    private Integer installments;

    public CardPayment(){
    }

    public CardPayment(Long id, PaymentStatus status, Order order, Integer installments) {
        super(id, status, order);
        this.installments = installments;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

  
    
}
