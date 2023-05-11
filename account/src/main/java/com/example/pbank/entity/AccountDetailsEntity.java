package com.example.pbank.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "account_details")
public class AccountDetailsEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "account_number")
    Long accountNumber;
    @Column(name = "password_id")
    Long passwordId;
    @Column(name = "money")
    BigDecimal money;
    @Column(name = "negative_balance")
    Boolean negativeBalance;
    @Column(name = "profile_id")
    Long profileId;
    @Column(name = "bank_details_id")
    Long bankDetailsId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final AccountDetailsEntity that = (AccountDetailsEntity) o;
        return negativeBalance == that.negativeBalance &&
                Objects.equals(id, that.id) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(passwordId, that.passwordId) &&
                Objects.equals(money, that.money) &&
                Objects.equals(profileId, that.profileId) &&
                Objects.equals(bankDetailsId, that.bankDetailsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, passwordId, money, negativeBalance, profileId, bankDetailsId);
    }
}
