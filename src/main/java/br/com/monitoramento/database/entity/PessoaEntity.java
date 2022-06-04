package br.com.monitoramento.database.entity;

import br.com.monitoramento.enums.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "SEXO")
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate dataNascimento;

    @Column(name = "RENDA_FAMILIAR")
    private BigDecimal rendaFamiliar;
}
