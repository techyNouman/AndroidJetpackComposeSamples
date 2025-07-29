package com.example.ajcs.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ajcs.navigation.AppNavHost
import com.example.ajcs.navigation.Screen
import com.example.ajcs.ui.components.Sample
import com.example.ajcs.ui.components.SampleList
import com.example.ajcs.ui.layouts.LayoutsScreen
import com.example.ajcs.ui.theme.AndroidJetpackComposeSamplesTheme

class MainActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidJetpackComposeSamplesTheme {
                AppNavHost()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController){
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
                    0 -> navController.navigate(Screen.Layouts.route)
                    1 -> navController.navigate(Screen.Text.route)
                    2 -> navController.navigate(Screen.Button.route)
                    3 -> navController.navigate(Screen.TextField.route)
                    4 -> navController.navigate(Screen.Images.route)
                    5 -> navController.navigate(Screen.Card.route)
                    6 -> navController.navigate(Screen.Checkbox.route)
                    7 -> navController.navigate(Screen.Chip.route)
                    8 -> navController.navigate(Screen.RadioButton.route)
                    9 -> navController.navigate(Screen.SearchBar.route)
                    10 -> navController.navigate(Screen.Slider.route)
                    11 -> navController.navigate(Screen.Switch.route)
                    12 -> navController.navigate(Screen.Snackbar.route)
                    13 -> navController.navigate(Screen.Fab.route)
                    14 -> navController.navigate(Screen.Lists.route)
                    15 -> navController.navigate(Screen.Grids.route)
                    16 -> navController.navigate(Screen.PullToRefresh.route)
                    17 -> navController.navigate(Screen.ProgressIndicators.route)
                    18 -> navController.navigate(Screen.Dialog.route)
                    19 -> navController.navigate(Screen.DatePickers.route)
                    20 -> navController.navigate(Screen.TimePickers.route)
                    21 -> navController.navigate(Screen.Menus.route)
                    22 -> navController.navigate(Screen.NavigationDrawer.route)
                    23 -> navController.navigate(Screen.TopAppBars.route)
                    24 -> navController.navigate(Screen.BottomAppBar.route)
                    25 -> navController.navigate(Screen.BottomSheets.route)
                    26 -> navController.navigate(Screen.Tooltip.route)
                    27 -> navController.navigate(Screen.GoogleMap.route)
                }
            })
    }
}

