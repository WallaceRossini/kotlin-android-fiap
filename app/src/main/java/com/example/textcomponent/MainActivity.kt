package com.example.textcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import com.example.textcomponent.ui.theme.Kablammo
import com.example.textcomponent.ui.theme.TextComponentTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TextComponentTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
          TextFieldComponent()
        }
      }
    }
  }
}

@Composable
fun TextComponent() {
  Column(
    modifier = Modifier
      .padding(16.dp)
  ) {
    Text(
      modifier = Modifier
        .background(Color(0xFFFF9800))
        .border(border = BorderStroke(1.dp, color = Color.Blue))
        .padding(vertical = 32.dp)
//        .width(200.dp)
        .align(Alignment.CenterHorizontally)
        .fillMaxWidth(),
      text = "Estudando programação",
      fontSize = 32.sp,
      color = Color(0xFF673AB7),
      textAlign = TextAlign.Center,
      fontWeight = FontWeight.Bold,
      letterSpacing = 2.sp,
      fontFamily = Kablammo
    )
  }
}

@Composable
fun TextFieldComponent(){
  Column(
    modifier = Modifier.padding(32.dp)
  ) {
    TextField(
      value = "", 
      onValueChange = {},
      modifier = Modifier.fillMaxWidth(),
      label = {
        Text(text = "Qual o seu nome?")
      },
      placeholder = {
        Text(text = "Qual o seu nome?")
      },
      trailingIcon = {
        Icon(
          painter = painterResource(id = R.drawable.settings_24),
          contentDescription = "ícone de configuração" )
      },
      leadingIcon = {
        Icon(
          painter = painterResource(id = R.drawable.person_24),
          contentDescription = "ícone de usuário")
      }
      )
  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun GreetingPreview() {
  TextComponentTheme {
    TextFieldComponent()
  }
}