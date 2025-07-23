package com.clinica.SaaS_Clinica.domain.enums;

public enum Role {
    ADIM(1),
    ATENDENTE(2),
    PACIENTE(3),
    NUTRICIONISTA(4),
    ALUNO(5);

    private Integer code;

    private Role(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static Role valueOf(Integer code){
        for (Role x : Role.values()){
            if (x.code == code){
                return x;
            }
        }
        throw new IllegalArgumentException("Role not found!");
    }
}
