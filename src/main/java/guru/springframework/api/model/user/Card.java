package guru.springframework.api.model.user;

import lombok.Data;

@Data
public class Card {
    String type;
    String number;
    String iban;
    String swift;
    ExpirationDate expiration_date;
}