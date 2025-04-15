package com.bondi.haraka_mall.ui.theme.screens.service

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.R
import com.bondi.haraka_mall.navigation.ROUT_HOME
import com.bondi.haraka_mall.ui.theme.neworange
import com.bondi.haraka_mall.ui.theme.newwhite
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen( navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Service") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Blue
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Build, contentDescription = "Profile") },
                    label = { Text("settings") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        //all contents
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .paint(painter = painterResource(R.drawable.backgroundhome), contentScale = ContentScale.FillBounds)

            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(20.dp))
                //SearchBar
                var search by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = search,
                    onValueChange = {search = it},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector =Icons.Default.Search, contentDescription = "")},
                    placeholder = { Text(text = "search...")}
                )
                //End of SearchBar
                Spacer(modifier = Modifier.height(10.dp))

                Image(
                    painter = painterResource(R.drawable.furniture8),
                    contentDescription = "home",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    contentScale = ContentScale.FillWidth,

                    )
                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Services Available ",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    color = neworange



                    )
                //Start of Row

                Row (){
                    Image(
                        painter = painterResource(R.drawable.furniture8),
                        contentDescription = "home",
                        modifier = Modifier
                            .width(200.dp)
                            .height(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth,
                    )

                    Spacer(modifier = Modifier.width(10.dp))


                    Column {
                        Text(
                            text = "Leather sofa seat",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,



                            )


                        Text(text = "Comfy seat",
                            fontSize = 20.sp,
                        )


                        Text(text = "Ksh 200000",
                            fontSize = 20.sp,
                            textDecoration = TextDecoration.LineThrough
                        )
                        Text(text = "16000",
                            fontSize = 20.sp,
                        )

                        Row {
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newwhite)
                        }
                        Button(onClick = {},
                            colors = ButtonDefaults.buttonColors(Color.Blue),

                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 20.dp),
                        ) {Text(text = "Contact us") }



                    }
                }
                //End of Row












            }
        }
    )

    //End of scaffold


}
@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(rememberNavController())


}