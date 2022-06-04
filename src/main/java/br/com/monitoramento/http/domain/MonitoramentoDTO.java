package br.com.monitoramento.http.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonitoramentoDTO {

    private PessoaDTO pessoa;
    private EnderecoDTO endereco;
    private DoencaDTO doenca;
}
