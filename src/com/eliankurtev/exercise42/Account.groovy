package com.eliankurtev.exercise42

import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal amount){
        balance+=amount
    }
    BigDecimal withdraw(BigDecimal amount){
        balance-=amount
    }
    BigDecimal plus(Account account){
        this.balance+account.balance
    }
}
