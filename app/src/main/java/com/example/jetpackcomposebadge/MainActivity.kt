package com.example.jetpackcomposebadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebadge.ui.theme.JetpackComposeBeagleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBeagleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                    ) {
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GreetingBadge() {
    BadgedBox( badge = { Badge { Text(text = "99+") }  }) {
        Icon(
            imageVector = Icons.Default.Email, contentDescription = "Email",
            modifier = Modifier.size(40.dp)
        )
    }
}

@Preview
@Composable
fun BadgePreview(){
   Surface(modifier = Modifier.fillMaxSize(),
       color = MaterialTheme.colorScheme.background) {
       Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
           GreetingBadge()
       }
   }
}
