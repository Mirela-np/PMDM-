package com.example.calculadorahorizontal

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.RowScopeInstance.weight
//import androidx.compose.foundation.layout.RowScopeInstance.weight
//import androidx.compose.foundation.layout.RowScopeInstance.weight
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadorahorizontal.ui.theme.CalculadoraHorizontalTheme
import com.example.calculadorahorizontal.ui.theme.naranja


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // Scaffold(topBar = { TopAppBar({ Text(text = "Calculadora") }) }) {
                calculadoraHorizontal()
            }
        }
    }




@Composable
 fun calculadoraHorizontal() {
    when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> {
            Column() {


                calcVertical()
            }
            }

        Configuration.ORIENTATION_LANDSCAPE -> {
                Row() {


                    calcHorizontal()
                }
            }

        else -> throw RuntimeException()
    }
}
@Preview
@Composable
fun calcVertical() {


        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Screen(Modifier.weight(3f))



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora2(modifier = Modifier.weight(1f), "%", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "CE", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "C", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(2f), "÷", 25.sp)

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "7", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "8", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "9", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(2f), "X", 25.sp)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "4", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "5", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "6", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(2f), "-", 25.sp)


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "1", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "2", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "3", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(2f), "+", 25.sp)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "+/-", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "0", 25.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), ",", 25.sp)
                BotonCalculadora2(modifier = Modifier.weight(2f), "=", 25.sp)
            }
        }


    }


    @Composable
    fun BotonCalculadora2(


        modifier: Modifier,
        text: String,
        fontSize: TextUnit,


        ) {
        Button(
            onClick = {/*TODO*/ },
            modifier = modifier.fillMaxHeight(),
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(backgroundColor = naranja),
            shape = RoundedCornerShape(40),
            content = {
                Text(
                    text = text,
                    fontSize = fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        )
    }

    @Composable
    fun BotonCalculadora3(


        modifier: Modifier,
        text: String,
        fontSize: TextUnit

    ) {
        Button(
            onClick = {/*TODO*/ },
            modifier = modifier.fillMaxHeight(),
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
            shape = RoundedCornerShape(40),
            content = {
                Text(
                    text = text,
                    fontSize = fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

        )
    }

    @Composable
    fun Screen(
        modifier: Modifier,
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.BottomEnd,
        )
        {
            Text(
                text = "0",
                textAlign = TextAlign.End,
                color = Color.White,
                fontSize = 70.sp,
            )
        }
    }



@Preview(showSystemUi = true)
    @Composable
    fun calcHorizontal() {

    Column() {
         Row(
             Modifier
                 .fillMaxWidth()
                 .weight(1f)) {

            Screen(modifier = Modifier.weight(1f))

        }



        Column(Modifier.weight(2f)) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora2(modifier = Modifier.weight(1f), "M+", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "M-", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "MR", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "MC", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "%", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "÷", 20.sp)


            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "1/x", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "x²", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "7", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "8", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "9", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "x", 20.sp)

            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "√", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "π", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "4", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "5", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "6", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "-", 20.sp)


            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
            ) {
                BotonCalculadora3(modifier = Modifier.weight(1f), "(", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), ")", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "1", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "2", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "3", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "+", 20.sp)
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Black)
            ) {

                BotonCalculadora3(modifier = Modifier.weight(1f), "\u232B", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), "+/-", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(1f), ",", 20.sp)
                BotonCalculadora3(modifier = Modifier.weight(2f), "0", 20.sp)
                BotonCalculadora2(modifier = Modifier.weight(1f), "=", 20.sp)
            }
        }


    }
    }










