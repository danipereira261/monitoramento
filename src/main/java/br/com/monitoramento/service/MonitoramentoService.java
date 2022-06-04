package br.com.monitoramento.service;

import br.com.monitoramento.database.entity.DoencaEntity;
import br.com.monitoramento.database.entity.EnderecoEntity;
import br.com.monitoramento.database.entity.MonitoramentoEntity;
import br.com.monitoramento.database.entity.PessoaEntity;
import br.com.monitoramento.database.repository.MonitoramentoRepository;
import br.com.monitoramento.http.domain.MonitoramentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MonitoramentoService {

    @Autowired
    private MonitoramentoRepository monitoramentoRepository;

    public void save(MonitoramentoDTO monitoramentoDTO) {
        monitoramentoRepository.save(
                MonitoramentoEntity
                        .builder()
                        .dataRegistro(LocalDateTime.now())
                        .pessoa(
                                PessoaEntity
                                        .builder()
                                        .cpf(monitoramentoDTO.getPessoa().getCpf())
                                        .dataNascimento(monitoramentoDTO.getPessoa().getDataNascimento())
                                        .rendaFamiliar(monitoramentoDTO.getPessoa().getRendaFamiliar())
                                        .sexo(monitoramentoDTO.getPessoa().getSexo())
                                        .build()
                        )
                        .doenca(
                                DoencaEntity
                                        .builder()
                                        .doenca(monitoramentoDTO.getDoenca().getDoenca())
                                        .build()
                        )
                        .endereco(
                                EnderecoEntity
                                        .builder()
                                        .cep(monitoramentoDTO.getEndereco().getCep())
                                        .rua(monitoramentoDTO.getEndereco().getRua())
                                        .bairro(monitoramentoDTO.getEndereco().getBairro())
                                        .municipio(monitoramentoDTO.getEndereco().getMunicipio())
                                        .estado(monitoramentoDTO.getEndereco().getEstado())
                                        .uf(monitoramentoDTO.getEndereco().getUf())
                                        .numeroLogradouro(monitoramentoDTO.getEndereco().getNumeroLogradouro())
                                        .regiao(monitoramentoDTO.getEndereco().getRegiao())
                                        .build()
                        )
                        .build()
        );
    }
}
