package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.CountryDTO;
import ua.lviv.iot.domain.Country;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class CountryMapper implements AbstractMapper<Country, CountryDTO> {
    @Override
    public CountryDTO map(Country country){
        return CountryDTO.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }
}
