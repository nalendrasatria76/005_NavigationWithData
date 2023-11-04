package com.example.pengelolahalaman

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun HalamanSatu(
    pilihanRasa: List<String>,
    onSelectionChanged: (String) -> Unit,
    onConfirmButtonClicked: (Int) -> Unit,
    onNextButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
)
{
    var rasaYgDipilih by rememberSaveable { mutableStateOf("")}
    var textJmlBeli by remember { mutableStateOf("")}

    Column ()
}