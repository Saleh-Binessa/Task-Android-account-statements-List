package com.example.bankaccounts.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.bankaccounts.R
import java.lang.reflect.Type
import kotlin.math.sign

@Composable
fun AccountCard(name: String, TransactionType: Type, balance: Double, signPara: String, amount: Double, currency: String, updatedBalance: Double, modifier: Modifier = Modifier) {
    Card (modifier = modifier
        .fillMaxWidth()
        .padding(8.dp)){
            Text(text = stringResource(R.string.account, name))

        Row (verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = modifier
                .fillMaxSize()){
            Image(painter = painterResource(id = R.drawable.kfh), contentDescription = "", Modifier.width(45.dp))
            Text(text = "\n")
            Text(text = "${TransactionType.typeName}")
            Text(text = "${balance} ")
            Text(text = "${signPara} $amount $currency")

        }
            Text(text = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$updatedBalance $currency")

    }
}