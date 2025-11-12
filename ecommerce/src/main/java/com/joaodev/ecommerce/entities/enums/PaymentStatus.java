package com.joaodev.ecommerce.entities.enums;

public enum PaymentStatus {
    
    PENDING(1,"Pendente"),
    PAID(2,"Quitado"),
    CANCELED(3,"Cancelado");

    private int code;
    private String description;

    private PaymentStatus(int code, String description){
        this.code = code;
        this.description = description;
    }

    public int getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

    public static PaymentStatus toCode(Integer code){
        if (code == null) {
            return null;
        }
        for (PaymentStatus x : PaymentStatus.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("ID inválido " + code);
    }
}


