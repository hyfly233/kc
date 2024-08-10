package window

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import compose.KcHome
import compose.KcNavigation

@Composable
@Preview
fun KcMainWindow() {

    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            Row() {
                KcNavigation()
                KcHome()
            }
        }
    }
}
