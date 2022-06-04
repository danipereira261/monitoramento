package br.com.monitoramento.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sexo {
    MASCULINO("M"),
    FEIMININO("F");

    private String descricao;
}
