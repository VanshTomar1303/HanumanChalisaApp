package com.vansh.hanumanchalisa.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Buttons(
    onNext: () -> Unit,
    onPrev: () -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = { onPrev() }) {
            Text(text = "Prev")
        }
        Spacer(modifier = Modifier.width(26.dp))
        Button(onClick = { onNext() }) {
            Text(text = "Next")
        }
    }

}