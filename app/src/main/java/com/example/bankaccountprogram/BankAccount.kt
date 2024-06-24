package com.example.bankaccountprogram

private  val transactionHistory = mutableListOf<String>()


class BankAccount(
    var accountHolder: String,
    var balance: Double){

    fun deposit(amount: Double){
        balance += amount
       // balance = balance + amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double){
       if(amount<= balance){
           //we can withdraw
           balance -= amount
           transactionHistory.add("$accountHolder withdrew $$amount")
       }else{
           // we cant
           println("You don't have  funds to withdraw $amount")
       }
    }

    fun displayTrancastionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory)
            println(transaction)
    }
}