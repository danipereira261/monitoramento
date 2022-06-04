package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Regiao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private long cep;
    private String rua;
    private String bairro;
    private String municipio;
    private String estado;
    private String uf;
    private long numeroLogradouro;
    private Regiao regiao;
}
