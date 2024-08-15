package JobThree
import java.time.LocalDate

data class Donor(
    val id: Int,
    val name: String,
    val bloodGroup: String,
    val address: String,
    val lastDonateDate: LocalDate
)
