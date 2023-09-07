package com.example.namecardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecardapp.Contents.CompanySection
import com.example.namecardapp.Contents.DetailSection
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
                        modifier = Modifier
                            .padding(30.dp)
                            .verticalScroll(rememberScrollState())
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
                            //CompanySection
                            CompanySection()

                            var isShowDetail by remember { mutableStateOf(false) }
                            //Detail Button
                            Button(
                                modifier = Modifier
                                    .padding(vertical = 15.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(5.dp)),
                                colors = ButtonDefaults.buttonColors(Color(0xEDF44C36)),
                                shape = RoundedCornerShape(10.dp),
                                onClick = { isShowDetail = !isShowDetail }) {
                                Text(
                                    text = "Detail",
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.White
                                )
                            }

                            //DetailSection
                            if (isShowDetail) {
                                DetailSection()
                            }
                        }
                    }
                }
            }
        }
    }
}

