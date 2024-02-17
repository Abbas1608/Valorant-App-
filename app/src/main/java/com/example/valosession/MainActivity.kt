package com.example.valosession

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.valosession.screens.AgentsDetail
import com.example.valosession.screens.AgentsListScreen
import com.example.valosession.ui.theme.ValosessionTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
//            delay(10000)
            DataManager.loadAssetsFromFile(applicationContext)
            }
        setContent {
            ValosessionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                       App()
                }
            }
        }
    }
}
@Composable
fun App(){

    if(DataManager.isDataLoaded.value){
        if(DataManager.currentPage.value == Pages.LISTING){
            AgentsListScreen(data = DataManager.data) {
                DataManager.switchPages(it)
            }
        }
        else{
            DataManager.currentAgent?.let {

                AgentsDetail(agents = it)
            }
        }
    }

}enum class Pages{
    LISTING,
    DETAIL
}
