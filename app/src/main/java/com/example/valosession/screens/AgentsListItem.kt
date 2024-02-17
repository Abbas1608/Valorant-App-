package com.example.valosession.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.valosession.R
import com.example.valosession.models.Agents


@Composable
fun AgentsListItem(
    agents:Agents,
    onClick:(agents:Agents)->Unit
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                onClick(agents)
//          Here detail screen will be visible after clicking
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = rememberImagePainter(data = agents.displayIcon),
                contentDescription = "Agents",
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = CircleShape)
                    .background(Color.White )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = agents.displayName,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Blue
            )
            Spacer(modifier = Modifier.height(10.dp))

        }
    }
}



