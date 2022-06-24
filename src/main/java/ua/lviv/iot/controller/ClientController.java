package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.ClientDTO;
import ua.lviv.iot.domain.Client;
import ua.lviv.iot.mapper.implementation.ClientMapper;
import ua.lviv.iot.service.implementation.ClientService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/client")
@RestController
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAll() {
        List<ClientDTO> dtoList = clientService.getAll().stream().map(clientMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(clientMapper.map(clientService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ClientDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(clientMapper.map(clientService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ClientDTO> create(@RequestBody Client entity) {
        return new ResponseEntity<>(clientMapper.map(clientService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable Integer id, @RequestBody Client client) {
        return new ResponseEntity<>(clientMapper.map(clientService.update(id, client)), HttpStatus.OK);
    }
}
