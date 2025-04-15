package com.bondi.harakamall.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.R
import com.bondi.haraka_mall.navigation.ROUT_ITEM
import com.bondi.haraka_mall.ui.theme.neworange

@Composable
fun FormScreen( navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(R.drawable.backgroundhome), contentScale = ContentScale.FillBounds)

        , horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.furniture3),
            contentDescription = "",
            modifier = Modifier.height(200.dp).width(200.dp)

            )

        Text(text = "CREATE AN ACCOUNT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold

            )
        Spacer(modifier = Modifier.height(20.dp))

        //Variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var Confirm_password by remember { mutableStateOf("") }



        //Fullname

        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",tint= Color.Blue)},
            label = { Text(text = "Fullname: ", fontWeight = FontWeight.ExtraBold,fontSize = 20.sp,)

                    },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = neworange,
                focusedLabelColor = Color.Blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )




        //end of fullname
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = username   ,
            onValueChange = {username=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "",tint= Color.Blue)},
            label = { Text(text = "Username: " ,fontWeight = FontWeight.ExtraBold,fontSize = 20.sp,) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = neworange,
                focusedLabelColor = Color.Blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

//email

        OutlinedTextField(
            value = email   ,
            onValueChange = {email=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "",tint= Color.Blue)},
            label = { Text(text = "Email: ", fontWeight = FontWeight.ExtraBold,fontSize = 20.sp,) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = neworange,
                focusedLabelColor = Color.Blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )



        //end of fullname
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",tint= Color.Blue)},
            label = { Text(text = "Password: ", fontWeight = FontWeight.ExtraBold,fontSize = 20.sp,) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = neworange,
                focusedLabelColor = Color.Blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )



        //end of confirm password
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = Confirm_password,
            onValueChange = {Confirm_password=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",tint= Color.Blue)},
            label = { Text(text = "Confirm_Password: ", fontWeight = FontWeight.ExtraBold,fontSize = 20.sp,) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Gray,
                unfocusedBorderColor = neworange,
                focusedLabelColor = Color.Blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()
        )



        //end of confirm password
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {navController.navigate(ROUT_ITEM)},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),


            )
        { Text(text = "Create account", fontWeight = FontWeight.Bold,fontSize = 15.sp,) }






    }


}
@Preview(showBackground = true)
@Composable
fun FormascreenPreview(){
    FormScreen(rememberNavController())


}