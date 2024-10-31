package com.vansh.hanumanchalisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vansh.hanumanchalisa.feature_Hanuman.BajrangBaan
import com.vansh.hanumanchalisa.feature_Hanuman.HanumanAsthak
import com.vansh.hanumanchalisa.feature_Hanuman.HanumanBahuk
import com.vansh.hanumanchalisa.feature_Hanuman.HanumanChalisa
import com.vansh.hanumanchalisa.feature_Hanuman.HanumanSundarkand
import com.vansh.hanumanchalisa.ui.theme.HanumanChalisaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HanumanChalisaTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Screens.NavScreen
                    ){
                        composable<Screens.NavScreen>{
                            MainScreen(navController = navController, modifier = Modifier,innerPadding)
                        }
                        composable<Screens.HanumanChalisha> {
                            HanumanChalisa(modifier = Modifier,innerPadding)
                        }
                        composable<Screens.BajrangBaan> {
                            BajrangBaan(modifier = Modifier,innerPadding)
                        }
                        composable<Screens.HanumanAsthak> {
                            HanumanAsthak(modifier = Modifier,innerPadding)
                        }
                        composable<Screens.HanumanBahuk> {
                            HanumanBahuk(modifier = Modifier,innerPadding)
                        }
                        composable<Screens.HanumanSundarkand> {
                            HanumanSundarkand(modifier = Modifier,innerPadding)
                        }
                    }
                }
            }
        }
    }
}
