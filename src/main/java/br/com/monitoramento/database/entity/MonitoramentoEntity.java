package br.com.monitoramento.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_MONITORAMENTO")
public class MonitoramentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @OneToOne(cascade = CascadeType.ALL)
    private PessoaEntity pessoa;

    @JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID")
    @OneToOne(cascade = CascadeType.ALL)
    private EnderecoEntity endereco;

    @JoinColumn(name = "ID_DOENCA", referencedColumnName = "ID")
    @OneToOne(cascade = CascadeType.ALL)
    private DoencaEntity doenca;

    @Column(name = "DATE")
    private LocalDateTime dataRegistro;
}
