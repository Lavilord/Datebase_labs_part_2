package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.CityDTO;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.mapper.implementation.CityMapper;
import ua.lviv.iot.service.implementation.CityService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/city")
@RestController
@AllArgsConstructor
public class CityController {
    private final CityService cityService;
    private final CityMapper cityMapper;

    @GetMapping
    public ResponseEntity<List<CityDTO>> getAll() {
        List<CityDTO> dtoList = cityService.getAll().stream().map(cityMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CityDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(cityMapper.map(cityService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<CityDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(cityMapper.map(cityService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CityDTO> create(@RequestBody City entity) {
        return new ResponseEntity<>(cityMapper.map(cityService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<CityDTO> update(@PathVariable Integer id, @RequestBody City city) {
        return new ResponseEntity<>(cityMapper.map(cityService.update(id, city)), HttpStatus.OK);
    }
}
