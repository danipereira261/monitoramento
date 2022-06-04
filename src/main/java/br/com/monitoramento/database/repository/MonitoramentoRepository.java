package br.com.monitoramento.database.repository;

import br.com.monitoramento.database.entity.MonitoramentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitoramentoRepository extends JpaRepository<MonitoramentoEntity, Long> {
}
