package br.com.monitoramento.http.domain;

import br.com.monitoramento.enums.Estado;
import br.com.monitoramento.enums.Regiao;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(example = "07171100")
    private long cep;
    @ApiModelProperty(example = "PALMES")
    private String rua;
    @ApiModelProperty(example = "JARDINS")
    private String bairro;
    @ApiModelProperty(example = "SAO PAULO")
    private String municipio;
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(example = "SAO_PAULO")
    private Estado estado;
    @ApiModelProperty(example = "SP")
    private String uf;
    private long numeroLogradouro;
    @Enumerated(EnumType.STRING)
    private Regiao regiao;
}
