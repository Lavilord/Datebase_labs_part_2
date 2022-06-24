package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.CityDTO;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class CityMapper implements AbstractMapper<City, CityDTO> {
    @Override
    public CityDTO map(City city){
        return CityDTO.builder()
                .id(city.getId())
                .name(city.getName())
                .countryId(city.getCountry().getId())
                .build();
    }
}
