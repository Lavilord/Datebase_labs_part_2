package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.CountryDTO;
import ua.lviv.iot.domain.Country;
import ua.lviv.iot.mapper.implementation.CountryMapper;
import ua.lviv.iot.service.implementation.CountryService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/country")
@RestController
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @GetMapping
    public ResponseEntity<List<CountryDTO>> getAll() {
        List<CountryDTO> dtoList = countryService.getAll().stream().map(countryMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CountryDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(countryMapper.map(countryService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<CountryDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(countryMapper.map(countryService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CountryDTO> create(@RequestBody Country entity) {
        return new ResponseEntity<>(countryMapper.map(countryService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CountryDTO> update(@PathVariable Integer id, @RequestBody Country country) {
        return new ResponseEntity<>(countryMapper.map(countryService.update(id, country)), HttpStatus.OK);
    }
}
