package ua.lviv.iot.service.implementation;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Country;
import ua.lviv.iot.repository.CountryRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class CountryService extends AbstractService<Country> {
    private final CountryRepository countryRepository;

    @Override
    public JpaRepository<Country,Integer> getRepository(){return countryRepository;}
}

