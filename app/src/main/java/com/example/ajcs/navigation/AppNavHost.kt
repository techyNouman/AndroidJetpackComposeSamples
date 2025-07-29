package com.example.ajcs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ajcs.ui.layouts.LayoutsScreen
import com.example.ajcs.ui.main.MainScreen
import com.example.ajcs.ui.text.TextScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) { MainScreen(navController) }
        composable(Screen.Layouts.route) { LayoutsScreen(navController) }
//        composable(Screen.Button.route) { ButtonScreen(navController) }
        composable(Screen.Text.route) { TextScreen(navController) }
//        composable(Screen.TextField.route) { TextFieldScreen(navController) }
//        composable(Screen.Images.route) { ImagesScreen(navController) }
//        composable(Screen.Card.route) { CardScreen(navController) }
//        composable(Screen.Checkbox.route) { CheckboxScreen(navController) }
//        composable(Screen.Chip.route) { ChipScreen(navController) }
//        composable(Screen.RadioButton.route) { RadioButtonScreen(navController) }
//        composable(Screen.SearchBar.route) { SearchBarScreen(navController) }
//        composable(Screen.Slider.route) { SliderScreen(navController) }
//        composable(Screen.Switch.route) { SwitchScreen(navController) }
//        composable(Screen.Snackbar.route) { SnackbarScreen(navController) }
//        composable(Screen.Fab.route) { FabScreen(navController) }
//        composable(Screen.Lists.route) { ListsScreen(navController) }
//        composable(Screen.Grids.route) { GridsScreen(navController) }
//        composable(Screen.PullToRefresh.route) { PullToRefreshScreen(navController) }
//        composable(Screen.ProgressIndicators.route) { ProgressIndicatorsScreen(navController) }
//        composable(Screen.Dialog.route) { DialogScreen(navController) }
//        composable(Screen.DatePickers.route) { DatePickersScreen(navController) }
//        composable(Screen.TimePickers.route) { TimePickersScreen(navController) }
//        composable(Screen.Menus.route) { MenusScreen(navController) }
//        composable(Screen.NavigationDrawer.route) { NavigationDrawerScreen(navController) }
//        composable(Screen.TopAppBars.route) { TopAppBarsScreen(navController) }
//        composable(Screen.BottomAppBar.route) { BottomAppBarScreen(navController) }
//        composable(Screen.BottomSheets.route) { BottomSheetsScreen(navController) }
//        composable(Screen.Tooltip.route) { TooltipScreen(navController) }
//        composable(Screen.GoogleMap.route) { GoogleMapScreen(navController) }
    }
}