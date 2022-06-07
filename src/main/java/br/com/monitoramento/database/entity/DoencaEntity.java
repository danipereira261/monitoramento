package br.com.monitoramento.database.entity;

import br.com.monitoramento.enums.Doenca;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_DOENCA")
public class DoencaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "doenca")
    @Enumerated(EnumType.STRING)
    private Doenca doenca;

    @Column(name = "DT_DOENCA")
    private LocalDate dataDoenca;
}
