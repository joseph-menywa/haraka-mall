package com.bondi.haraka_mall.ui.theme.screens.intent


import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.haraka_mall.navigation.ROUT_DASHBOARD
import com.bondi.haraka_mall.navigation.ROUT_HOME
import com.bondi.haraka_mall.navigation.ROUT_ITEM
import com.bondi.haraka_mall.ui.theme.newblue




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        ){

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { Text("Intents") },
            colors = TopAppBarDefaults.largeTopAppBarColors(newblue),
            navigationIcon = {
                IconButton(onClick = {navController.navigate(ROUT_DASHBOARD)}) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            },
            actions = {
                IconButton(onClick = {navController.navigate(ROUT_ITEM)}) {

                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {navController.navigate(ROUT_HOME)}) {

                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }
        )




        //Intents

        //STK
        OutlinedButton(onClick ={
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),

                    border = BorderStroke(3.dp, Color.Black)) {
            Text(text = "PAY VIA MPESA")

        }

        Spacer(modifier = Modifier.height(20.dp))

        //EMAIL
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "EMAIL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SHARE
        Button(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SHARE")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //CALL
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0748641295".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "CALL")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SMS
        Button(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0748641295".toUri()
            smsIntent.putExtra("sms_body","Hello Joseph,how was your day?")
            mContext.startActivity(smsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SMS")
        }

        Spacer(modifier = Modifier.height(20.dp))

        //SETTINGS
        Button(onClick = {
            val settingsIntent=Intent(Settings.ACTION_SETTINGS)
            mContext.startActivity(settingsIntent)

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "SETTINGS")
        }


        Spacer(modifier = Modifier.height(20.dp))

        //CAMERA
        Button(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "CAMERA")
        }


        //CAMERA
        Button(onClick = {

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "MAP")
        }


    }


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())

}