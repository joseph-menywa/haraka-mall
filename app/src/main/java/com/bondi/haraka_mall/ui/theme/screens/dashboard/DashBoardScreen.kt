package com.bondi.haraka_mall.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.R
import com.bondi.haraka_mall.navigation.ROUT_ABOUT
import com.bondi.haraka_mall.navigation.ROUT_CONTACT
import com.bondi.haraka_mall.navigation.ROUT_HOME
import com.bondi.haraka_mall.navigation.ROUT_INTENT
import com.bondi.haraka_mall.ui.theme.newblue
import com.bondi.haraka_mall.ui.theme.neworange
import com.bondi.haraka_mall.ui.theme.red


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoardScreen( navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(neworange)

    ){
        //Box(start)
        Box(){
            //Card (start)
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newblue)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Menu, contentDescription = "") }
                    }
                )
            }
            //card(end)

            //Card (start)
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp),

            ){

                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "Welcome to HarakaMall",
                        fontSize = 30.sp,
                        color = red

                    )
                }

            }
            //card(end)


        }
        //Box (end)
        Spacer(modifier = Modifier.height(100.dp))


        //Row (start)
        Row (modifier = Modifier.padding(start = 20.dp)){
            //Card1(start)
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_HOME)}
                ,
        elevation = CardDefaults.cardElevation(10.dp)
                ){
                Column(modifier = Modifier
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                    ) {

                    Image(
                        painter = painterResource(R.drawable.home),
                        contentDescription = "home",
                        modifier = Modifier.height(100.dp)

                        )
                    Text(text = "Home",
                        fontSize = 15.sp

                        )
                }

            }

            //Card1(end)
            Spacer(modifier = Modifier
                .width(40.dp)
            )

            //Card2(start)
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ABOUT)}

                ,
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "about",
                        modifier = Modifier.height(100.dp)

                    )
                    Text(text = "About",
                        fontSize = 15.sp

                    )
                }

            }

            //Card2(end)

        }

        //Row (end)
        Spacer(modifier = Modifier.height(40.dp))


        //Row2 (start)
        Row (modifier = Modifier.padding(start = 20.dp)){
            //Card1(start)
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_CONTACT)}

                ,
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.contact1),
                        contentDescription = "contact",
                        modifier = Modifier.height(100.dp)

                    )
                    Text(text = "Contact",
                        fontSize = 15.sp

                    )
                }

            }

            //Card1(end)
            Spacer(modifier = Modifier.width(40.dp))

            //Card2(start)
            Card (modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_INTENT)}

                ,
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.tool6),
                        contentDescription = "items",
                        modifier = Modifier.height(100.dp)

                    )
                    Text(text = "Products",
                        fontSize = 15.sp

                    )
                }

            }

            //Card2(end)

        }

        //Row2 (end)








    }


}
@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())


}