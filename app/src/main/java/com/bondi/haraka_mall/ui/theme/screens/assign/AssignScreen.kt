package com.bondi.haraka_mall.ui.theme.screens.assign
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.ui.theme.newgrey
import com.bondi.haraka_mall.ui.theme.neworange
import com.bondi.haraka_mall.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignmentScreen(navController: NavController) {
    val mContext = LocalContext.current

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(



        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = neworange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = {  },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },
                    label = {  },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = {  },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = {  },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = neworange,


                ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                //BOX
                Box() {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {


                        Card(modifier = Modifier
                            .width(400.dp)
                            .height(150.dp)


                            ,
                            colors = CardDefaults.cardColors(newwhite)
                        ) {
                            Column(modifier=Modifier.fillMaxHeight()) {

                                Column(modifier = Modifier
                                    .align(alignment = Alignment.CenterHorizontally)) {
                                    Text(
                                        text="Hi Samantha",
                                        fontWeight = FontWeight.ExtraBold,
                                        fontSize = 20.sp,
                                        textAlign = TextAlign.Center
                                    ) }

                                Spacer(modifier = Modifier.height(10.dp))
                                Column(modifier=Modifier.fillMaxHeight()) {

                                    Column(modifier = Modifier.align(alignment = Alignment.CenterHorizontally)) {
                                        Text(
                                            text="Here are your Projects",
                                            fontWeight = FontWeight.ExtraBold,
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center
                                        )
                                    } }



                            }
                            //END OF CARD

                        } }


                    //CARD
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {


                        Card(modifier = Modifier
                            .width(150.dp)
                            .height(150.dp)
                            .align(alignment=Alignment.End)
                            ,
                            shape = RoundedCornerShape(bottomStart = 500.dp ),
                            colors = CardDefaults.cardColors(neworange)
                        ) {


                        }
                        //END OF CARD

                    }



                }
                //END OF BOX
                Spacer(modifier = Modifier.height(20.dp))


                Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
                    //ROW


                    Column (
                        modifier= Modifier.width(200.dp)
                    ){

                        Image(
                            painter = painterResource(com.bondi.haraka_mall.R.drawable.backgroundhome),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(50.dp)),
                            contentScale = ContentScale.Inside
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(
                                text = "Men's T-shirt",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,

                                )

                            }
                        }
                    }
                    //END OF ROW

                    Spacer(modifier = Modifier.width(10.dp))
                    //ROW

                    Column (
                        modifier= Modifier.width(200.dp)

                    ){

                        Image(
                            painter = painterResource(com.bondi.haraka_mall.R.drawable.backgroundhome),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(50.dp)),
                            contentScale = ContentScale.FillWidth
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(
                                text = "Men's T-shirt",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,

                                )
                            Text(
                                text = "This is a casual wear that is suitable for men especially during Summer.",
                            )
                            Text(
                                text = "Ksh 2000",
                                textDecoration = TextDecoration.LineThrough

                            )
                            Row (){
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)

                            }
                            Button(
                                onClick ={},
                                colors = ButtonDefaults.buttonColors(neworange),

                                ) {
                                Text(text = "CALL US")
                            }
                        }
                    }
                    //END OF ROW


                    Spacer(modifier = Modifier.width(10.dp))
                    //ROW

                    Column (
                        modifier= Modifier.width(200.dp)

                    ){

                        Image(
                            painter = painterResource(com.bondi.haraka_mall.R.drawable.backgroundhome),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(50.dp)),
                            contentScale = ContentScale.FillWidth
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(
                                text = "Men's T-shirt",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,

                                )
                            Text(
                                text = "This is a casual wear that is suitable for men especially during Summer.",
                            )
                            Text(
                                text = "Ksh 2000",
                                textDecoration = TextDecoration.LineThrough

                            )
                            Row (){
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)

                            }
                            Button(
                                onClick ={},
                                colors = ButtonDefaults.buttonColors(neworange),

                                ) {
                                Text(text = "CALL US")
                            }
                        }
                    }
                    //END OF ROW
                    Spacer(modifier = Modifier.height(10.dp))



                }
                Column (modifier = Modifier.fillMaxWidth().background(newgrey)

                ){
                    Spacer(modifier = Modifier.height(40.dp))

                    Card(modifier = Modifier.fillMaxWidth()
                        .height(100.dp)

                        .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Row {
                            Column {
                                Image(
                                    painter = painterResource(com.bondi.haraka_mall.R.drawable.backgroundhome),
                                    contentDescription = "home",
                                )
                            }
                            Column {
                                Text(text="NDA Review for website project")
                                Text(text="Today= 10pm")
                            }
                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))




                    Card(modifier = Modifier.fillMaxWidth()
                        .height(100.dp)

                        .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Row {
                            Column {
                                Image(
                                    painter = painterResource(com.bondi.haraka_mall.R.drawable.backgroundhome),
                                    contentDescription = "home",
                                )
                            }
                            Column {
                                Text(text="Email Reply for Green Project")
                                Text(text="Today= 10pm")
                            }
                        }




                    }


                }












        }
    )

    //End of scaffold
















}
// Start of Preview composable
@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview() {
    AssignmentScreen(rememberNavController())
}
// End of Preview composable
