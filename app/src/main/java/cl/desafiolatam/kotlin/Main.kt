package cl.desafiolatam.kotlin
/*
[x]1.Crear el proyecto Kotlin correctamente.
[x]2.Crear archivo “Main.kt” con la función main.
[X]3.Imprimir “Mi nombre es: {Nombre del alumno}.
[X]4.Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
[X]5.Imprimir la suma de las 3 variables.
[X]6.Declarar 1 variable String y otra variable Char.
[X]7.Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
[X]8.Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto.
[X]9.Declarar una variable de tipo Float de forma explícita.
[X]10.Asignar un valor a la variable Float.
[X]11.Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
[X]12.Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
[X]13.Declarar una variable Boolean con true o false e imprimir su valor.
[X]14.Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este imprime el total de caracteres de los dos parámetros.
[X]15.Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
[X]16.Desde la función main llamar a estas dos funciones de forma correcta.

*/
fun main() {
  val name = "Natalia"
    println("Mi nombre es; $name")

    val number1 = 10
    val number2 = 20
    val number3 = 30
    var result = number1 + number2 + number3
    println("$number1 + $number2 + $number3 = $result")

    val variable1 = "Arataka Reigen"
    var variable2 = 'A'
    variable2 = 'B'
    val count = "Tiene ${variable1.count()} caracteres"
    println(count)

    var a : Float = 10f
    println(a)

    val byteMax = Byte.MAX_VALUE
    val shortMax = Short.MAX_VALUE
    println(byteMax)
    println(shortMax)

    val intMin = Int.MIN_VALUE
    val longMin = Long.MIN_VALUE
    println(intMin)
    println(longMin)

    var b = true
    println(b)

    getImprimiendoParametros("bulldog","frances")
    getImprimirIva()
}

fun getImprimiendoParametros(raza : String, subraza : String) {
      val result = raza.length + subraza.length

    val  perritos = ("${raza.length} + ${subraza.length} = $result")

    println(perritos)

}
fun getImprimirIva(){
    val iVA = 1.19f
    val valor = 5000
    val result = valor * iVA

    println(result)
}







