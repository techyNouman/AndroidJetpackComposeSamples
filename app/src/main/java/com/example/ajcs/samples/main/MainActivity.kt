package com.example.ajcs.samples.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.ajcs.ui.theme.AndroidJetpackComposeSamplesTheme
import com.example.ajcs.utils.showToast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidJetpackComposeSamplesTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Jetpack Compose Samples")
                }
            )
        }
    )
    { innerPadding ->
        val sampleData = listOf(
            Sample(0, "Layouts"),
            Sample(1, "Text"),
            Sample(2, "Button"),
            Sample(3, "Text field"),
            Sample(4, "Images"),
            Sample(5, "Card"),
            Sample(6, "Checkbox"),
            Sample(7, "Chip"),
            Sample(8, "Radio button"),
            Sample(9, "Search bar"),
            Sample(10, "Slider"),
            Sample(11, "Switch"),
            Sample(12, "Snack bar"),
            Sample(13, "Floating action button"),
            Sample(14, "Lists"),
            Sample(15, "Grids"),
            Sample(16, "Pull to refresh"),
            Sample(17, "Progress indicators"),
            Sample(18, "Dialog"),
            Sample(19, "Date pickers"),
            Sample(20, "Time pickers"),
            Sample(21, "Menus"),
            Sample(22, "Navigation drawer"),
            Sample(23, "Top app bars"),
            Sample(24, "Bottom app bar"),
            Sample(25, "Bottom sheets"),
            Sample(26, "Tooltip"),
            Sample(27, "Google map"),
        )
        SampleList(
            sampleItems = sampleData,
            modifier = Modifier.padding(innerPadding),
            onItemClick = {
                when (it.id) {
                    0 -> {}
                    1 -> {}
                    2 -> {}
                    3 -> {}
                    4 -> {}
                    5 -> {}
                    6 -> {}
                    7 -> {}
                    8 -> {}
                    9 -> {}
                    10 -> {}
                    11 -> {}
                    12 -> {}
                    13 -> {}
                    14 -> {}
                    15 -> {}
                    16 -> {}
                    17 -> {}
                    18 -> {}
                    19 -> {}
                    20 -> {}
                    21 -> {}
                    22 -> {}
                    23 -> {}
                    24 -> {}
                    25 -> {}
                    26 -> {}
                    27 -> {}
                }
                showToast(context, it.name)
            })
    }
}

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
/*@Composable
fun VerticalScrollView(){

    val scrollState = rememberScrollState()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    )
    {
        Text(
            text = "Item 1",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 2",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 3",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 4",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 5",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 1",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 2",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 3",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 4",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 5",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 1",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 2",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 3",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 4",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
        Text(
            text = "Item 5",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )
    }

}*/
