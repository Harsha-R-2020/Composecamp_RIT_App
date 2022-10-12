package com.example.composecamp.Screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composecamp.R
import com.example.composecamp.data.DDatasource
import com.example.composecamp.data.Datasource
import com.example.composecamp.model.Affirmation
import com.example.composecamp.ui.theme.ComposecampTheme


@Composable
fun AffirmationDashboard(navController: NavController) {
    ComposecampTheme {
        AffirmationDList(navController,affirmationList = DDatasource().loadAffirmations())
    }

}

@Composable
fun AffirmationDList(navController: NavController, affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
//    LazyColumn {
//        items(affirmationList) { affirmation ->
//            AffirmationDCard(affirmation)
//        }
//    }

    LazyColumn{
        item { AffirmationDCard(affirmation=Affirmation(R.string.card3,R.drawable.college))
            ExtendedFloatingActionButton(
                onClick = { /* ... */
                    navController.navigate("VisionMision")
                },
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                icon = {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Arrow"
                    )
                },
                text = { Text("Vision & Mision", textAlign = TextAlign.Center) }
            )}
        item { AffirmationDCard(affirmation = Affirmation(R.string.card1, R.drawable.calendar ) )
            ExtendedFloatingActionButton(
                onClick = { /* ... */
                    navController.navigate("Schedule")
                },
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                icon = {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Arrow"
                    )
                },
                text = { Text("Academic Calendar", textAlign = TextAlign.Center) }
            )}
        item { AffirmationDCard(affirmation=Affirmation(R.string.card2, R.drawable.schedule))
            ExtendedFloatingActionButton(
                onClick = { /* ... */
                    navController.navigate("CSE")
                },
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                icon = {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Arrow"
                    )
                },
                text = { Text("Time Table", textAlign = TextAlign.Center) }
            )}
        item { AffirmationDCard(affirmation=Affirmation(R.string.card7, R.drawable.announcement_text))
            ExtendedFloatingActionButton(
                onClick = { /* ... */
                    navController.navigate("Announcement")
                },
                modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
                icon = {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Arrow"
                    )
                },
                text = { Text("Announcement", textAlign = TextAlign.Center) }
            )}


    }

}

@Composable
fun AffirmationDCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}



