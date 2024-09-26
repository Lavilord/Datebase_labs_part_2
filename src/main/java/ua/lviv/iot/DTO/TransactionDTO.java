package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDTO {
    private Integer id;
    private Integer itemId;
    private Integer bankAccountId;
    private Float commission;
    private Float transferAmount;
}
