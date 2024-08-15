package JobThree
import java.time.LocalDate

fun UserLogin (username: String, password: String): Boolean {
    return username == "admin" && password == "password"
}

fun createDonorsList(): List<Donor> {
    return listOf(
        Donor(1, "John Doe", "A+", "123 Maple St", LocalDate.of(2024, 5, 10)),
        Donor(2, "Jane Smith", "O+", "456 Oak St", LocalDate.of(2024, 4, 20)),
        Donor(3, "Alice Johnson", "B-", "789 Pine St", LocalDate.of(2024, 6, 15)),
        Donor(4, "Bob Brown", "AB+", "321 Cedar St", LocalDate.of(2024, 3, 10)),
        Donor(5, "Charlie Davis", "A-", "654 Elm St", LocalDate.of(2024, 7, 1)),
        Donor(6, "Diana Evans", "O-", "987 Birch St", LocalDate.of(2024, 2, 25)),
        Donor(7, "Edward Wilson", "B+", "246 Willow St", LocalDate.of(2024, 8, 5)),
        Donor(8, "Fiona Green", "AB-", "135 Spruce St", LocalDate.of(2024, 1, 18)),
        Donor(9, "George Harris", "A+", "579 Maple St", LocalDate.of(2024, 7, 30)),
        Donor(10, "Hannah Scott", "O+", "864 Oak St", LocalDate.of(2024, 4, 28)),
        Donor(11, "Ivy Moore", "B-", "753 Pine St", LocalDate.of(2024, 6, 11)),
        Donor(12, "Jack Taylor", "AB+", "426 Cedar St", LocalDate.of(2024, 5, 3)),
        Donor(13, "Karen Lewis", "A-", "159 Elm St", LocalDate.of(2024, 3, 20)),
        Donor(14, "Larry King", "O-", "738 Birch St", LocalDate.of(2024, 8, 1)),
        Donor(15, "Megan Carter", "B+", "982 Willow St", LocalDate.of(2024, 2, 13)),
        Donor(16, "Nathan Reed", "AB-", "573 Spruce St", LocalDate.of(2024, 7, 22)),
        Donor(17, "Olivia Clark", "A+", "264 Maple St", LocalDate.of(2024, 5, 15)),
        Donor(18, "Paul Adams", "O+", "681 Oak St", LocalDate.of(2024, 4, 7)),
        Donor(19, "Quincy Wright", "B-", "197 Pine St", LocalDate.of(2024, 3, 30)),
        Donor(20, "Rachel Turner", "AB+", "384 Cedar St", LocalDate.of(2024, 6, 5))
    )
}

fun searchDonors(donors: List<Donor>, query: String): List<Donor> {
    return donors.filter {
        it.name.contains(query, ignoreCase = true) ||
                it.bloodGroup.equals(query, ignoreCase = true) ||
                it.address.contains(query, ignoreCase = true)
    }
}

fun main() {
    println("Enter username:")
    val username = readLine()!!
    println("Enter password:")
    val password = readLine()!!

    if (!UserLogin(username, password)) {
        println("Invalid login credentials.")
        return
    }

    val donors = createDonorsList()

    while (true) {
        println("\nMenu:")
        println("1. View all donors")
        println("2. Search donors by name, blood group, or address")
        println("0. Exit")
        val choice = readLine()!!

        when (choice) {
            "1" -> {
                println("\nList of All Donors:")
                donors.forEach {
                    println("${it.id}. ${it.name} - ${it.bloodGroup} - ${it.address} - Last Donate Date: ${it.lastDonateDate}")
                }
            }
            "2" -> {
                println("Enter search query:")
                val query = readLine()!!
                val results = searchDonors(donors, query)
                if (results.isEmpty()) {
                    println("No donors found.")
                } else {
                    println("\nSearch Results:")
                    results.forEach {
                        println("${it.id}. ${it.name} - ${it.bloodGroup} - ${it.address} - Last Donate Date: ${it.lastDonateDate}")
                    }
                }
            }
            "0", "exit" -> {
                println("Exiting program.")
                return
            }
            else -> {
                println("Invalid choice. Please try again.")
            }
        }
    }
}