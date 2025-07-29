package com.example.ajcs.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SampleList(
    sampleItems: List<Sample>,
    modifier: Modifier = Modifier,
    onItemClick: (Sample) -> Unit
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
    ) {
        items(sampleItems) { item: Sample ->
            SampleItem(item) { onItemClick(item) }
        }
    }
}

@Composable
fun SampleItem(
    sample: Sample,
    onClick: () -> Unit
) {
    Text(
        text = sample.name,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp)
    )
    HorizontalDivider()
}