package com.example.valosession.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.valosession.R
import com.example.valosession.models.Agents
import com.example.valosession.ui.theme.screens.AgentsList

@Composable
fun AgentsListScreen(
    data: Array<Agents>,
    onClick: (agents: Agents)->Unit
){
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.valorant),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp)
                    .align(CenterHorizontally)
            )
            AgentsList(
                data=data,onClick
            )
        }
    }
}