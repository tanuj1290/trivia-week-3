package com.example.android.thursdaytriviaweek3rockpaper

//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.thursdaytriviaweek3rockpaper.ui.theme.ThursdayTriviaWeek3RockPaperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTriviaWeek3RockPaperTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    rockPaper()
                }
            }
        }
    }
}

@Composable
fun rockPaper() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.week_3), contentDescription = "imge")
        Text(
            text = "Score",
            fontSize = 30.sp,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = "0 / 4",
            fontWeight = FontWeight.Medium,
            fontSize = 50.sp,
            modifier = Modifier.padding(top = 18.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(top = 90.dp)
                .fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = "You chose", fontSize = 16.sp)
                Text(text = "Rock", fontSize = 32.sp, fontWeight = FontWeight.Medium)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = "Android chose", fontSize = 16.sp)
                Text(text = "Paper", fontSize = 32.sp, fontWeight = FontWeight.Medium)
            }
        }
        Spacer(modifier = Modifier.height(90.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
//            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(80.dp)
                    .weight(1f)
                    .padding(all = 5.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = "Rock", color = Color.White)
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(80.dp)
                    .weight(1f)
                    .padding(all = 5.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = "Paper", color = Color.White)
            }
            Spacer(modifier = Modifier.width(30.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(80.dp)
                    .weight(1f)
                    .padding(all = 5.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Text(text = "Scissors", color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "#JetpackCompose",
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp
            )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ThursdayTriviaWeek3RockPaperTheme {
        rockPaper()
    }
}