package com.example.pengelolahalaman

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment

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

    Column (modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween){
        Column(modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium))) {
            pilihanRasa.forEach = Modifier.selectable(
                selected = rasaYgDipilih == item,
                onClick = { rasaYgDipilih = item onSelectionChanged(item)
                }
            ),
            verticalAlignment = Alignment.CenterVertically){

                RadioButton(selected = rasaYgDipilih == item, onClick = { rasaYgDipilih == item onSelectionChanged(item) }
                )
                Text(item)
            }
        }
    }
}