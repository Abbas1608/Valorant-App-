package com.example.valosession.ui.theme.screens


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.valosession.models.Agents

@Composable
fun AgentsList(
    data: Array<Agents>,
    onClick: (agents: Agents)->Unit
){
    LazyColumn(content = {
        items(data) {
            AgentsListItem(agents= it,onClick)
        }
    })
}


    










