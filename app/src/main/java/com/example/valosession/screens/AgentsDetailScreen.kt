package com.example.valosession.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.valosession.DataManager
import com.example.valosession.models.Agents


@Composable
fun AgentsDetail(
    agents: Agents
){
    BackHandler {
        DataManager.switchPages(null)
    }
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp,24.dp)
            ) { Image(
                painter = rememberImagePainter(data = agents.displayIcon),
                contentDescription = "Agents",
                alignment = Alignment.TopCenter,
                modifier = Modifier
                    .size(250.dp)
            )
                Text(
                    text = "Name :- " + agents.displayName,
                )
                Text(
                    text = "Developer  :- " + agents.developerName,
                )
                Text(
                    text = "About :- " + agents.description,
                )


            }
            }

        }
}