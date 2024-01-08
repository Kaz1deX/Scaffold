package com.example.topappbar

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.topappbar.ui.theme.MyGreen

@Composable
fun DrawerHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(MyGreen),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Menu",
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

@Composable
fun DrawerBody() {
    val list = listOf(
        "One",
        "Two",
        "Three",
        "Four",
        "Five"
    )
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(5) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {}
                    .padding(
                        start = 50.dp,
                        top = 20.dp,
                        end = 10.dp,
                        bottom = 20.dp
                    ),
                text = list[it]
            )
        }
    }
}