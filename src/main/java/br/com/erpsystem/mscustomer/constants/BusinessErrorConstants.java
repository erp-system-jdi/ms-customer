package br.com.erpsystem.mscustomer.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BusinessErrorConstants {

    public static final String CUSTOMER_NOT_FOUND = "[Business Exception] Customer not Found!";

    public static final String DUPLICATED_CPF = "[Business Exception] This CPF already exists in the database!";
}
