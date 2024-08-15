package JobOne

import java.util.Scanner

fun main(args: Array<String>) {
    var sacn = Scanner(System.`in`)
    var A = sacn.nextInt()
    var B = sacn.nextInt()
    var C = sacn.nextInt()
    var D = sacn.nextInt()

    var product = (A * B) - ( C * D )

    println("DIFERENCA = $product")
}


