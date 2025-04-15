package com.bondi.haraka_mall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.data.UserDatabase
import com.bondi.haraka_mall.navigation.ROUT_HOME
import com.bondi.haraka_mall.navigation.ROUT_SPLASH
import com.bondi.haraka_mall.repository.UserRepository
import com.bondi.haraka_mall.ui.theme.screens.about.AboutScreen
import com.bondi.haraka_mall.ui.theme.screens.assign.AssignScreen
import com.bondi.haraka_mall.ui.theme.screens.auth.LoginScreen
import com.bondi.haraka_mall.ui.theme.screens.auth.RegisterScreen
import com.bondi.haraka_mall.ui.theme.screens.contact.ContactScreen
import com.bondi.haraka_mall.ui.theme.screens.dashboard.DashBoardScreen
import com.bondi.haraka_mall.ui.theme.screens.form1.Form1Screen
import com.bondi.haraka_mall.ui.theme.screens.home.HomeScreen
import com.bondi.haraka_mall.ui.theme.screens.intent.IntentScreen
import com.bondi.haraka_mall.ui.theme.screens.item.ItemScreen
import com.bondi.haraka_mall.ui.theme.screens.service.ServiceScreen
import com.bondi.haraka_mall.ui.theme.screens.splash.SplashScreen
import com.bondi.haraka_mall.ui.theme.screens.start.StartScreen
import com.bondi.haraka_mall.viewmodel.AuthViewModel
import com.bondi.harakamall.ui.screens.form.FormScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context= LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_START) {
            StartScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashBoardScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        composable(ROUT_FORM1) {
            Form1Screen(navController)
        }
        composable(ROUT_ASSIGNMENT) {
            AssignScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }







    }
}