package com.vansh.hanumanchalisa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(0.dp)
) {
    Box(
        modifier = modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.img_1), // replace with your image resource
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // or ContentScale.FillBounds
        )

        // Overlaying Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "HANUMAN BHAJANS",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue // Change text color for better visibility on background
            )
            Spacer(modifier = Modifier.height(20.dp))
            NavButton(
                navController = navController,
                destination = Screens.HanumanChalisha,
                text = "Hanuman Chalisha"
            )
            Spacer(modifier = Modifier.height(15.dp))
            NavButton(
                navController = navController,
                destination = Screens.BajrangBaan,
                text = "Bajrang Baan"
            )
            Spacer(modifier = Modifier.height(15.dp))
            NavButton(
                navController = navController,
                destination = Screens.HanumanAsthak,
                text = "Hanuman Asthak"
            )
            Spacer(modifier = Modifier.height(15.dp))
            NavButton(
                navController = navController,
                destination = Screens.HanumanBahuk,
                text = "Hanuman Bahuk"
            )
            Spacer(modifier = Modifier.height(15.dp))
            NavButton(
                navController = navController,
                destination = Screens.HanumanSundarkand,
                text = "Hanuman Sundarkand"
            )
        }
    }
}



@Composable
fun NavButton(
    navController: NavController,
    destination: Screens,
    text:String
){
    Button(onClick = {
        navController.navigate(destination)
    }) {
        Text(text = text)
    }
}


