package br.com.monitoramento.http.build;

import br.com.monitoramento.database.entity.EnderecoEntity;
import br.com.monitoramento.http.domain.EnderecoDTO;
import org.springframework.stereotype.Service;

@Service
public class BuildEndereco {

    public EnderecoEntity convertEnderecoToEntity(EnderecoDTO dto) {
        return EnderecoEntity
                .builder()
                .cep(dto.getCep())
                .rua(dto.getRua())
                .bairro(dto.getBairro())
                .municipio(dto.getMunicipio())
                .estado(dto.getEstado())
                .uf(dto.getUf())
                .numeroLogradouro(dto.getNumeroLogradouro())
                .regiao(dto.getRegiao())
                .build();
    }

    public EnderecoDTO convertEnderecoToDTO(EnderecoEntity entity) {
        return EnderecoDTO
                .builder()
                .cep(entity.getCep())
                .rua(entity.getRua())
                .bairro(entity.getBairro())
                .municipio(entity.getMunicipio())
                .estado(entity.getEstado())
                .uf(entity.getUf())
                .numeroLogradouro(entity.getNumeroLogradouro())
                .regiao(entity.getRegiao())
                .build();
    }
}
