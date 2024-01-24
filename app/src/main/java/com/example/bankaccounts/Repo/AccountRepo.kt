package com.example.bankaccounts.Repo

import com.example.bankaccounts.Data.AccountsData
import com.example.bankaccounts.Data.TransactionType

class AccountRepo{


    companion object {
        val mainAmount: Double = 200.0
        val savingAmount: Double = 300.0
        var mainBalance: Double = 10000.0
        var savingBalance: Double = 5000.0

           var dummyAccountsList = listOf(
               AccountsData( "Saving", savingBalance, TransactionType.DEPOSIT, "+", savingAmount, "KWD",savingBalance + savingAmount),
               AccountsData( "Main", mainBalance, TransactionType.WITHDRAWAL, "-", mainAmount, "KWD",mainBalance - mainAmount),
               AccountsData( "Saving", savingBalance, TransactionType.WITHDRAWAL, "-", savingAmount, "KWD",savingBalance - savingAmount),
               AccountsData( "Main", mainBalance, TransactionType.DEPOSIT, "+", mainAmount, "KWD",mainBalance + mainAmount)
           )
        }
    }

