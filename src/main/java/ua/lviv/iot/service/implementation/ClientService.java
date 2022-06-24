package ua.lviv.iot.service.implementation;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Client;
import ua.lviv.iot.repository.ClientRepository;
import ua.lviv.iot.service.AbstractService;

@AllArgsConstructor
@Service
public class ClientService extends AbstractService<Client> {
    private final ClientRepository clientRepository;

    @Override
    public JpaRepository<Client,Integer> getRepository(){return clientRepository;}
}

