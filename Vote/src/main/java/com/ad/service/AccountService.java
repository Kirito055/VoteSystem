package com.ad.service;


import java.security.Principal;

public interface AccountService {



    void withdraw(String accountType, double amount, Principal principal);

}
