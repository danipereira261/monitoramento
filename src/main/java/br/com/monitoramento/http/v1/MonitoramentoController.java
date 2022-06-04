package br.com.monitoramento.http.v1;

import br.com.monitoramento.http.domain.MonitoramentoDTO;
import br.com.monitoramento.service.MonitoramentoService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/monitoramento")
@Api(tags = "Monitoramento", produces = APPLICATION_JSON_VALUE)
public class MonitoramentoController {

    @Autowired
    private MonitoramentoService monitoramentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody MonitoramentoDTO monitoramentoDTO) {
        monitoramentoService.save(monitoramentoDTO);
    }
}
