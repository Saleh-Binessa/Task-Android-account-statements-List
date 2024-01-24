package com.example.bankaccounts.Data

import java.lang.reflect.Type

data class AccountsData(val name: String,val balance: Double, val TransactionType: Type, var signPara: String, var amount: Double, val currency: String, var updatedBalance: Double)

