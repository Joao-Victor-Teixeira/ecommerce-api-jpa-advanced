package com.joaodev.ecommerce.entities.enums;

public enum ClientType {

    INDIVIDUAL(1, "Pessoa fisica"),
    CORPORATION(2, "Pessoa juridica");

    private int code;
    private String description;

    private ClientType(int code, String description){
        this.code = code;
        this.description = description;
    }

    public int getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }
    
    public static ClientType valueOf(int code){
        for (ClientType value : ClientType.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Código de Cliente inválido");
    }
}
