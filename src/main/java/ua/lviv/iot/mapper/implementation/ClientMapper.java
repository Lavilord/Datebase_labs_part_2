package ua.lviv.iot.mapper.implementation;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.ClientDTO;
import ua.lviv.iot.domain.Client;
import ua.lviv.iot.mapper.AbstractMapper;

@Component
public class ClientMapper implements AbstractMapper<Client, ClientDTO> {
    @Override
    public ClientDTO map(Client client){
        return ClientDTO.builder()
                .id(client.getId())
                .age(client.getAge())
                .lastname(client.getLastname())
                .name(client.getName())
                .middleName(client.getMiddleName())
                .passportNumber(client.getPassportNumber())
                .phoneNumber(client.getPhoneNumber())
                .streetID(client.getStreet().getId())
                .zip(client.getZip())
                .build();
    }
}
