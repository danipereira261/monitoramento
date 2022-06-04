package br.com.monitoramento.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sexo {
    MASCULINO("M"),
    FEMININO("F");

    private String descricao;
}
