package JobTwo

import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)

    var A = scan.nextInt()
    var B = scan.nextInt()
    var C = scan.nextInt()
    var D = scan.nextInt()

    if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
        println("Valores accitos")
    } else {
        println("Valores neo acetions")
    }
}