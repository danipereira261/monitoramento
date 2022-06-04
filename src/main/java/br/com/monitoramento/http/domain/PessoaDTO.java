package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Sexo sexo;
    private LocalDate dataNascimento;
    private BigDecimal rendaFamiliar;
}
