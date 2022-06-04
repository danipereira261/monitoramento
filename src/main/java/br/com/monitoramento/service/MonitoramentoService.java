package br.com.monitoramento.service;

import br.com.monitoramento.database.entity.MonitoramentoEntity;
import br.com.monitoramento.database.repository.MonitoramentoRepository;
import br.com.monitoramento.http.build.BuildDoenca;
import br.com.monitoramento.http.build.BuildEndereco;
import br.com.monitoramento.http.build.BuildPessoa;
import br.com.monitoramento.http.domain.MonitoramentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitoramentoService {

    @Autowired
    private MonitoramentoRepository monitoramentoRepository;
    @Autowired
    private BuildPessoa buildPessoa;
    @Autowired
    private BuildEndereco buildEndereco;
    @Autowired
    private BuildDoenca buildDoenca;

    public void save(MonitoramentoDTO monitoramentoDTO) {
        monitoramentoRepository.save(
                MonitoramentoEntity
                        .builder()
                        .dataRegistro(LocalDateTime.now())
                        .pessoa(buildPessoa.convertPessoaToEntity(monitoramentoDTO.getPessoa()))
                        .doenca(buildDoenca.convertDoencaToEntity(monitoramentoDTO.getDoenca()))
                        .endereco(buildEndereco.convertEnderecoToEntity(monitoramentoDTO.getEndereco()))
                        .build()
        );
    }

    public List<MonitoramentoDTO> findAll() {
        List<MonitoramentoEntity> response = monitoramentoRepository.findAll();

        return response
                .stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private MonitoramentoDTO convert(MonitoramentoEntity monitoramentoEntity) {

        return MonitoramentoDTO
                .builder()
                .doenca(buildDoenca.convertDoencaToDTO(monitoramentoEntity.getDoenca()))
                .pessoa(buildPessoa.convertPessoaToDTO(monitoramentoEntity.getPessoa()))
                .endereco(buildEndereco.convertEnderecoToDTO(monitoramentoEntity.getEndereco()))
                .build();
    }
}
