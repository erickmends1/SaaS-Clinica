package com.clinica.SaaS_Clinica.domain.enums;

public enum StatusConsultation {
    AGENDADA(1),
    REALIZADA(2),
    CANCELADA(3);

    private Integer code;

    private StatusConsultation(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }

    public static StatusConsultation valueOf(Integer code){
        for (StatusConsultation x : StatusConsultation.values()){
            if (x.getCode() == code){
                return x;
            }
        }
        throw new IllegalArgumentException("Status not found");
    }

}
