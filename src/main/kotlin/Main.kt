import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import window.KcMainWindow


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "todo title"
    ) {
        KcMainWindow()
    }
}
