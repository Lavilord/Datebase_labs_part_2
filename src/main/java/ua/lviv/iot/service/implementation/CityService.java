package ua.lviv.iot.service.implementation;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.City;
import ua.lviv.iot.repository.CityRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class CityService extends AbstractService<City> {
    private final CityRepository cityRepository;

    @Override
    public JpaRepository<City,Integer> getRepository(){return cityRepository;}
}
