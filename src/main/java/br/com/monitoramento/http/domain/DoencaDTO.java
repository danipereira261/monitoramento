package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Doenca;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoencaDTO {

    @Enumerated(EnumType.STRING)
    private Doenca doenca;
}
