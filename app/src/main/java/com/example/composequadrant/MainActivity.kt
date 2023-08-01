package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(){
    Column(modifier = Modifier.fillMaxWidth()) {
    Row(Modifier.weight(1f)) {
        QuadrantView(modifier = Modifier.weight(1f),title = stringResource(R.string.text_composable),
            text = stringResource(R.string.description_txt_composable),
            backgroundColor = Color(0xFFEADDFF))
        QuadrantView(modifier = Modifier.weight(1f),title = stringResource(R.string.image_composable),
            text = stringResource(R.string.description_img_composable) ,
            backgroundColor = Color(0xFFD0BCFF))
    }
        Row(Modifier.weight(1f)) {
            QuadrantView(modifier = Modifier.weight(1f),title = stringResource(R.string.row_composable),
                text = stringResource(R.string.description_row_composable) ,
                backgroundColor = Color(0xFFB69DF8))
            QuadrantView(modifier = Modifier.weight(1f),title = stringResource(R.string.column_composable),
                text = stringResource(R.string.description_column_composable
            ), backgroundColor = Color(0xFFF6EDFF))
        }
    }
}
@Composable
fun QuadrantView(
    modifier: Modifier=Modifier,
    title: String,
    text:String,
    backgroundColor: Color
){
    Column(modifier = modifier
        .fillMaxSize()
        .padding(1.dp)
        .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold)
        Text(text = text)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        QuadrantApp()
    }
}