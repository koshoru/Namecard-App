package com.example.namecardapp.Contents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.LightGray.copy(0.5f))
            .padding(15.dp),
    ) {
        //Favorite
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 10.dp)) {
            Label(icon = Icons.Default.Favorite, text = "Favorite")
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Playing Games, Watching Drama",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light)
        }

        //Residence
        Row(verticalAlignment = Alignment.CenterVertically) {
            Label(icon = Icons.Default.LocationOn, text = "Residence")
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Tokyo",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light)
        }
    }
}