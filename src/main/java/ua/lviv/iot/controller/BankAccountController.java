package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.BankAccountDTO;
import ua.lviv.iot.domain.BankAccount;
import ua.lviv.iot.mapper.implementation.BankAccountMapper;
import ua.lviv.iot.service.implementation.BankAccountService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/bank-account")
@RestController
@AllArgsConstructor
public class BankAccountController {
    private final BankAccountService bankAccountService;
    private final BankAccountMapper bankAccountMapper;

    @GetMapping
    public ResponseEntity<List<BankAccountDTO>> getAll() {
        List<BankAccountDTO> dtoList = bankAccountService.getAll().stream().map(bankAccountMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BankAccountDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(bankAccountMapper.map(bankAccountService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<BankAccountDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(bankAccountMapper.map(bankAccountService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BankAccountDTO> create(@RequestBody BankAccount entity) {
        return new ResponseEntity<>(bankAccountMapper.map(bankAccountService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<BankAccountDTO> update(@PathVariable Integer id, @RequestBody BankAccount bankAccount) {
        return new ResponseEntity<>(bankAccountMapper.map(bankAccountService.update(id, bankAccount)), HttpStatus.OK);
    }
}
