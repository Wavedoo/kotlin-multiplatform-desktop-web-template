import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import com.example.template.template
import org.khronos.webgl.ArrayBuffer
import org.w3c.xhr.XMLHttpRequest
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("Template", canvasElementId = "templateCanvas") {
        template()
    }
}