package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2250.0, 1000.0, 4000.0)

    for(salario in salarios){
        println(salario) //listar os salarios
    }
println("------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("------------------------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 } //filtro
    salariosMaiorQue2500.forEach { println(it) }

    println("------------------------")
    println(salarios.count { it in 2000.0..4000.0 })//contar. //retorna quantidade

    println("------------------------")
    println(salarios.find { it == 2250.0 }) //procura algo especifico
    println(salarios.find { it == 500.0 })  //retorna se não houver: null
    println(salarios.find { it >= 3000.0 }) //retorna se houver: o valor em si

    println("------------------------")
    println(salarios.any { it == 1000.0 }) //procura algo não tão especifico
    println(salarios.any { it == 500.0 }) //retorna Boolean
    println(salarios.any { it >= 2500.0 })
}
