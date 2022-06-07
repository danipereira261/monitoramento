package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Doenca;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoencaDTO {

    @Enumerated(EnumType.STRING)
    private Doenca doenca;
    @ApiModelProperty(example = "10/10/1985")
    private LocalDate dataDoenca;
}
