package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Sexo;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "10/10/1985")
    private LocalDate dataNascimento;
    @ApiModelProperty(example = "1000")
    private BigDecimal rendaFamiliar;
    private String cpf;
}
