package compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun KcNavigation() {
    NavigationRail(
        modifier = Modifier.padding(end = 8.dp),
        contentColor = MaterialTheme.colors.onSurface,
    ) {
        Column() {
            NavigationRailItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Home"
                    )
                },
                label = {
                    Text("Home", modifier = Modifier.padding(8.dp))
                },
                selected = true,
                onClick = { /* Handle Home click */ }
            )

            NavigationRailItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = null
                    )
                },
                label = {
                    Text("Account", modifier = Modifier.padding(8.dp))
                },
                selected = false,
                onClick = {}
            )

            NavigationRailItem(
                modifier = Modifier.padding(bottom = 8.dp),
                icon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null
                    )
                },
                label = {
                    Text("Add", modifier = Modifier.padding(8.dp))
                },
                selected = true,
                onClick = {}
            )
        }
    }
}
