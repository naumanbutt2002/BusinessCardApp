package com.naumanbutt2002.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naumanbutt2002.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}
@Composable
fun BusinessCardApp()
{
    val logo= painterResource(id = R.drawable.myimage)
    val name= stringResource(id = R.string.fName)
    val title= stringResource(id = R.string.title)
    val phIcon= painterResource(id = R.drawable.baseline_phone_24)
    val phNo= stringResource(id = R.string.phNo)
    val shareIcon= painterResource(id = R.drawable.baseline_share_24)
    val username= stringResource(id = R.string.username)
    val mailIcon= painterResource(id = R.drawable.baseline_email_24)
    val mail= stringResource(id = R.string.mail)

    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }

    Column(modifier = Modifier
        .background(Color(210, 232, 212))
        .fillMaxSize()
        .padding(bottom = 50.dp, top = 50.dp)
    )
    {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment=Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        )
        {

            Image(
                painter = logo,
                contentDescription = stringResource(id = R.string.profileDesc),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(175.dp)
                    .border(
                        BorderStroke(4.dp, rainbowColorsBrush),
                        CircleShape
                    )
                    .padding(4.dp)
                    .clip(CircleShape)

            )

            Text(
                text = name,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                fontSize = 24.sp,
                fontFamily = FontFamily.Monospace
            )
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight= FontWeight.Bold,
                color= Color(0, 109, 59)
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,

            horizontalAlignment=Alignment.CenterHorizontally,
            modifier= Modifier.fillMaxSize()
        )
        {
            Row(
                modifier= Modifier
                    .padding(80.dp, 5.dp, 0.dp, 5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom

            )
            {

                Image(
                    painter = phIcon,
                    contentDescription = stringResource(id = R.string.phDesc),
                    modifier = Modifier

                )
                Text(
                    text = phNo,
                    modifier = Modifier.padding(start=20.dp,bottom=2.dp),
                    fontSize = 16.sp,
                    textAlign= TextAlign.Start,
                    fontFamily = FontFamily.SansSerif

                )
            }
            Row(
                modifier= Modifier
                    .padding(80.dp, 5.dp, 0.dp, 5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom
            )
            {
                Image(
                    painter = shareIcon,
                    contentDescription = stringResource(id = R.string.shareDesc),
                    modifier = Modifier

                )
                Text(
                    text = username,
                    modifier = Modifier.padding(start=20.dp,bottom=2.dp),
                    fontSize = 16.sp,
                    textAlign= TextAlign.Start,
                    fontFamily = FontFamily.SansSerif
                )
            }
            Row(
                modifier= Modifier
                    .padding(80.dp, 5.dp, 0.dp, 5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom
            )
            {
                Image(
                    painter = mailIcon,
                    contentDescription = stringResource(id = R.string.mailDesc),
                    modifier = Modifier

                )
                Text(
                    text = mail,
                    modifier = Modifier.padding(start=20.dp,bottom=2.dp),
                    fontSize = 16.sp,
                    textAlign= TextAlign.Start,
                    fontFamily = FontFamily.SansSerif
                )
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}