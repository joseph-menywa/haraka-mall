package com.bondi.haraka_mall.ui.theme.screens.form1

import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.navigation.ROUT_ITEM
import com.bondi.haraka_mall.ui.theme.darkblue
import com.bondi.haraka_mall.ui.theme.neworange
import com.bondi.haraka_mall.ui.theme.red


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form1Screen( navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()

        .background(darkblue)){

        //Box(start)
        Box(){
            //Card (start)
            Card (
                modifier = Modifier.fillMaxSize().height(300.dp),
                colors = CardDefaults.cardColors(darkblue)
            ){

            }
            //card(end)

            //Card (start)
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)

                    .align(alignment = Alignment.BottomCenter),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),


                ){

                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    Text(text = "The Most Worth Grocery App",
                        fontSize = 40.sp,
                        color = red,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center

                    )
                    Spacer(modifier = Modifier.height(15.dp))

                    //varfiables
                    var username by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }

                    OutlinedTextField(
                        value = username ,
                        onValueChange = {username=it},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .background(color = Color.Gray),
                        shape = RoundedCornerShape(50.dp),

                        placeholder = { Text(text = "Username " ,fontWeight = FontWeight.ExtraBold,fontSize = 20.sp, textAlign = TextAlign.Center) },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Gray,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Color.Blue
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

                    )
                    Spacer(modifier = Modifier.height(15.dp))


                    OutlinedTextField(
                        value = password,
                        onValueChange = {password=it},
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp).background(color = Color.Gray),
                        placeholder = { Text(text = "Username " ,fontWeight = FontWeight.ExtraBold,fontSize = 20.sp, textAlign = TextAlign.Center) },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Gray,
                            unfocusedBorderColor = Color.Gray,
                            focusedLabelColor = Color.Blue
                        ),
                        shape = RoundedCornerShape(50.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(modifier = Modifier.height(15.dp))

                    Button(
                        onClick = {navController.navigate(ROUT_ITEM)},
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp),


                        )
                    { Text(text = "Create account", fontWeight = FontWeight.Bold,fontSize = 15.sp,) }

                    Spacer(modifier = Modifier.height(15.dp))

                    Row(){
                        Text(text = "Already have an Account? ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,)
                        Text(text = "LogIn ",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = neworange
                        )
                    }



                }

            }
            //card(end)


        }
        //Box (end)











    }


}
@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())


}