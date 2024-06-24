package com.example.bankaccountprogram

fun main(){

    val meBankAccount = BankAccount("Mevlüt Sever", 1012.12)

    meBankAccount.deposit(200.0)
    meBankAccount.withdraw(800.00)
    meBankAccount.deposit(3000.00)
    meBankAccount.withdraw(3333.15)
    meBankAccount.withdraw(3333.15)
    meBankAccount.deposit(3000.00)

    meBankAccount.displayTrancastionHistory()
    println("${meBankAccount.accountHolder}'s " +
            "balance is ${meBankAccount.balance}")



}