package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen()

                }
            }
        }
    }
}

@Composable
fun Screen() {
    Column (

    ){
        /*ScreenTop()*/
        ScreenBottom()
    }
}

@Composable
fun ScreenTop () {
    Column (
       /* horizontalAlignment = Alignment.CenterHorizontally,*/
        /*verticalArrangement = Arrangement.Center,*/
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .weight(1.0f)
    ){
        FirstBlock()

        Spacer(modifier = Modifier.size(86.dp))


    }
}

@Composable
fun ScreenBottom() {

    Spacer(modifier = Modifier.size(86.dp))

    Column (
        modifier = Modifier.weight(1.0f)
    ){
        ContactEntry()
    }

}

@Composable
fun FirstBlock() {
    val fullName = "Miriam Di Domizio"
    val role = "Android Developer"
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Box(
            modifier = Modifier
                .background(color = Color.DarkGray)
                .padding(16.dp)
                .size(100.dp)
        )
        {
            AndroidIcon()
        }
        Text(
            text = fullName,
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            lineHeight = 80.sp,
            color = Color.DarkGray
            )

        Text(
            text = role,
            fontSize = 25.sp,
            color = Color(0xFF3ddc84),
            lineHeight = 80.sp,
            )
    }
}



@Composable
fun ContactEntry(){
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding( start = 16.dp, end = 16.dp)

    ) {
        val textPhone = "017656746947"
        val textShare = "@Android.Dev"
        val textEmail = "miriam.didomizio@gmail.com"
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icons.Rounded.Call
            ContactText(textPhone)
    }
        Row {
            Icons.Rounded.Share
            ContactText(text = textShare)
        }

        Row {
            Icons.Rounded.Email
            ContactText(text = textEmail)
        }

    }
}

@Composable
fun AndroidIcon() {
    val image = painterResource(id = R.drawable.android_logo)
    Image(painter = image,
        contentDescription = "Android Icon")
}

@Composable
fun ContactText(text: String) {
    Text(
        text = text,
        fontSize = 15.sp,
        color = Color.DarkGray
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Screen()
    }
}