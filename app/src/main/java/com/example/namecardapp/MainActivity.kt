package com.example.namecardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecardapp.Contents.Label
import com.example.namecardapp.ui.theme.NamecardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NamecardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(30.dp)
                    ) {
                        //Profile Picture
                        Image(
                            painter = painterResource(id = R.drawable.profilepic),
                            contentDescription = "ProfilePic",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(150.dp)
                                .clip(RoundedCornerShape(16.dp))
                        )

                        //Name
                        Text(
                            modifier = Modifier.padding(top = 20.dp),
                            text = "Ye Hyeongseop",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        //Job
                        Text(
                            modifier = Modifier.padding(top = 10.dp),
                            text = "Android Engineer",
                            color = Color.Gray,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Medium
                        )

                        Column(horizontalAlignment = Alignment.Start) {
                            //Company Name
                            Text(
                                modifier = Modifier.padding(top = 20.dp),
                                text = "Transaction Media-Networks Inc",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold
                            )

                            //Dept
                            Text(
                                modifier = Modifier.padding(top = 15.dp),
                                text = "IoT R&D Planning Division",
                                color = Color.Gray,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal
                            )

                            //Team
                            Text(
                                modifier = Modifier.padding(top = 5.dp, bottom = 20.dp),
                                text = "MiddleWare Development Group",
                                color = Color.Gray,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal
                            )

                            //Email
                            Label(icon = Icons.Default.Email, text = "Email")
                            Text(
                                modifier = Modifier.padding(top = 5.dp, bottom = 15.dp),
                                text = "hyeongseop.ye@tm-nets.com",
                                fontSize = 15.sp,
                            )

                            //Tel
                            Label(icon = Icons.Default.Phone, text = "Tel")
                            Text(
                                modifier = Modifier.padding(top = 5.dp, bottom = 15.dp),
                                text = "080-4673-5743",
                                fontSize = 15.sp,
                            )
                            Divider(
                                modifier = Modifier
                                    .padding(top = 5.dp)
                                    .clip(RoundedCornerShape(200.dp)),
                                thickness = 3.dp,
                                color = Color.LightGray,
                            )
                        }
                    }
                }
            }
        }
    }
}