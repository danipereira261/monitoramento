package br.com.monitoramento.database.entity;

import br.com.monitoramento.enums.Estado;
import br.com.monitoramento.enums.Regiao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_ENDERECO")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CEP")
    private long cep;

    @Column(name = "RUA")
    private String rua;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "MUNICIPIO")
    private String municipio;

    @Column(name = "ESTADO")
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "UF")
    private String uf;

    @Column(name = "NUMERO_LOGRADOURO")
    private long numeroLogradouro;

    @Column(name = "REGIAO")
    @Enumerated(EnumType.STRING)
    private Regiao regiao;
}
