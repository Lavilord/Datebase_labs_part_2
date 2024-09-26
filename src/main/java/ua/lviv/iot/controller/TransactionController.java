package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.TransactionDTO;
import ua.lviv.iot.domain.Transaction;
import ua.lviv.iot.mapper.implementation.TransactionMapper;
import ua.lviv.iot.service.implementation.TransactionService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/transaction")
@RestController
@AllArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getAll() {
        List<TransactionDTO> dtoList = transactionService.getAll().stream().map(transactionMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<TransactionDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(transactionMapper.map(transactionService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<TransactionDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(transactionMapper.map(transactionService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> create(@RequestBody Transaction entity) {
        return new ResponseEntity<>(transactionMapper.map(transactionService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<TransactionDTO> update(@PathVariable Integer id, @RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionMapper.map(transactionService.update(id, transaction)), HttpStatus.OK);
    }
}
