package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.DTO.ItemDTO;
import ua.lviv.iot.domain.Item;
import ua.lviv.iot.mapper.implementation.ItemMapper;
import ua.lviv.iot.service.implementation.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping(value = "/item")
@RestController
@AllArgsConstructor
public class ItemController {
    private final ItemService itemService;
    private final ItemMapper itemMapper;

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAll() {
        List<ItemDTO> dtoList = itemService.getAll().stream().map(itemMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ItemDTO> get(@PathVariable Integer id) {
        return new ResponseEntity<>(itemMapper.map(itemService.get(id)), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ItemDTO> delete(@PathVariable Integer id) {
        return new ResponseEntity<>(itemMapper.map(itemService.delete(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ItemDTO> create(@RequestBody Item entity) {
        return new ResponseEntity<>(itemMapper.map(itemService.create(entity)), HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ItemDTO> update(@PathVariable Integer id, @RequestBody Item item) {
        return new ResponseEntity<>(itemMapper.map(itemService.update(id, item)), HttpStatus.OK);
    }
}
