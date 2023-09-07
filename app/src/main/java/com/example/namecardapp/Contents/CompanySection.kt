package com.example.namecardapp.Contents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column {
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
            modifier = Modifier.padding(top = 5.dp, bottom = 10.dp),
            text = "hyeongseop.ye@tm-nets.com",
            fontSize = 15.sp,
        )

        //Tel
        Label(icon = Icons.Default.Phone, text = "Tel")
        Text(
            modifier = Modifier.padding(top = 5.dp, bottom = 10.dp),
            text = "080-4673-5743",
            fontSize = 15.sp,
        )
        Divider(
            modifier = Modifier
                .padding(top = 5.dp)
                .clip(RoundedCornerShape(1000.dp)),
            thickness = 3.dp,
            color = Color.LightGray,
        )

    }
}