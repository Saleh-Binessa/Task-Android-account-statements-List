package com.example.bankaccounts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankaccounts.Composable.AccountCard
import com.example.bankaccounts.Data.AccountsData
import com.example.bankaccounts.Repo.AccountRepo
import com.example.bankaccounts.ui.theme.BankAccountsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val transactionData = AccountRepo.dummyAccountsList
        setContent {
            BankAccountsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AccountList(transactionData)
                }
            }
        }
    }
}

@Composable
fun AccountList(transactionData: List<AccountsData>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier){
        items(transactionData)
        {
            AccountCard(
                name = it.name,
                TransactionType = it.TransactionType,
                updatedBalance = it.updatedBalance,
                signPara = it.signPara,
                amount =  it.amount,
                currency =  it.currency,
                balance = it.balance
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BankAccountsTheme {
        AccountList(transactionData = AccountRepo.dummyAccountsList)
    }
}