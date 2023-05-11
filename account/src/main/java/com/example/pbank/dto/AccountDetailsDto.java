package com.example.pbank.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountDetailsDto {
    Long id;
    Long accountNumber;
    Long passwordId;
    BigDecimal money;
    Boolean negativeBalance;
    Long profileId;
    Long bankDetailsId;
}
