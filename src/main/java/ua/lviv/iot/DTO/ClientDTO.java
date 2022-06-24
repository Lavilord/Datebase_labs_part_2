package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO {
    private Integer id;
    private String name;
    private String lastname;
    private String middleName;
    private String phoneNumber;
    private Integer age;
    private String passportNumber;
    private String zip;
    private Integer streetID;
}