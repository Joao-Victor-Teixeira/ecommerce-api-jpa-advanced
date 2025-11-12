package com.joaodev.ecommerce.entities;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.joaodev.ecommerce.entities.enums.PaymentStatus;

import jakarta.persistence.Entity;

@Entity
public class PaymentBankSlip extends Payment {
    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant dueDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant paymentDate;

    public PaymentBankSlip(){
    }

    public PaymentBankSlip(Long id, PaymentStatus status, Order order, Instant dueDate, Instant paymentDate){
        super(id, status, order);
        this.paymentDate = paymentDate;
        this.dueDate = dueDate;
    }

    public Instant getDueDate() {
        return dueDate;
    }

    public void setDueDate(Instant dueDate) {
        this.dueDate = dueDate;
    }

    public Instant getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Instant paymentDate) {
        this.paymentDate = paymentDate;
    }

}
