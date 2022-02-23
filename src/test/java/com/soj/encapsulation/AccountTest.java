package com.soj.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
public Account account;
    @Test
    void testToGetTheAccNo() {
       account =new Account();
       account.setAccNo(23432243L);
        Assertions.assertEquals(23432243,account.getAccNo());
    }

    @Test
    void testToGetName() {
        account=new Account();
        account.setName("Minal Khan");
        Assertions.assertEquals("Minal Khan",account.getName());
    }

    @Test
    void testToGetEmail() {
        account=new Account();
        account.setEmail("minalkhan@yahoo.com");
        Assertions.assertEquals("minalkhan@yahoo.com",account.getEmail());
    }

    @Test
    void testToGetAmount() {
        account=new Account();
        account.setAmount(50000f);
        Assertions.assertEquals(50000,account.getAmount());
    }
}