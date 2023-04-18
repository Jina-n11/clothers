
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun LocalDateTime.spleitDateTime(): String {
    return this.toString().split("T").first()
}

@RequiresApi(Build.VERSION_CODES.O)
fun LocalDateTime.convertDateFormat(): String {
    val formatterInput = DateTimeFormatter.ISO_DATE_TIME
    val formatterOutput = DateTimeFormatter.ofPattern("EEE, dd MMMM yyyy", Locale.ENGLISH)
    val parsedDateTime = LocalDateTime.parse(this.toString(), formatterInput)
    return formatterOutput.format(parsedDateTime)
}

