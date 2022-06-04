package br.com.monitoramento.http.build;

import br.com.monitoramento.database.entity.DoencaEntity;
import br.com.monitoramento.http.domain.DoencaDTO;
import org.springframework.stereotype.Service;

@Service
public class BuildDoenca {

    public DoencaEntity convertDoencaToEntity(DoencaDTO dto) {
        return DoencaEntity
                .builder()
                .doenca(dto.getDoenca())
                .build();
    }

    public DoencaDTO convertDoencaToDTO(DoencaEntity entity) {
        return DoencaDTO
                .builder()
                .doenca(entity.getDoenca())
                .build();
    }
}
