package br.com.monitoramento.http.build;

import br.com.monitoramento.database.entity.PessoaEntity;
import br.com.monitoramento.http.domain.PessoaDTO;
import org.springframework.stereotype.Service;

@Service
public class BuildPessoa {

    public PessoaEntity convertPessoaToEntity(PessoaDTO dto) {
        return PessoaEntity
                .builder()
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .rendaFamiliar(dto.getRendaFamiliar())
                .sexo(dto.getSexo())
                .build();
    }

    public PessoaDTO convertPessoaToDTO(PessoaEntity entity) {
        return PessoaDTO
                .builder()
                .cpf(entity.getCpf())
                .dataNascimento(entity.getDataNascimento())
                .rendaFamiliar(entity.getRendaFamiliar())
                .sexo(entity.getSexo())
                .build();
    }
}
