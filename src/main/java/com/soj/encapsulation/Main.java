package com.soj.encapsulation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){

        Account account=new Account();
        account.setAccNo(23455600L);
        account.setName("Vishal Singh");
        account.setEmail("vishalsingh@google.com");
        account.setAmount(50000f);

        logger.debug("Account_No :{} ",account.getAccNo());
        logger.debug("Name :  {}",account.getName());
        logger.debug("Email : {}",account.getEmail());
        logger.debug("Amount :{} ",account.getAmount());

    }
}
