package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Doenca;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(example = "01/01/2022")
    private LocalDate dataDoenca;
}
