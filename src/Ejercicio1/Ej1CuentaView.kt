package Ejercicio1

class Ej1CuentaView {


    fun imprimeMenu():Int {
        val menu = "           Menu\n" +
                "--------------------------\n" +
                "Opción 1 ---> Consultar Saldo \n" +
                "Opción 2 ---> Realizar Deposito \n" +
                "Opción 3 ---> Realizar Extracto \n" +
                "Opción 4 ---> Salir \n";
        println(menu)
       val op= readLine()!!.toInt();
        return op;
    }

    fun deposito() {
        println("¿Cuanto desea ingresar?");
    }

    fun extracto() {
        println("¿Cuanto desea retirar?");
    }
    fun realizarExtracto(saldo :Int, condicion:Boolean){
        if(condicion) println("Extracto realizado, su saldo actual es de $saldo");
        else println("Saldo insuficiente");
    }
    fun consultarSaldo(a:Int):String{
        println("EL saldo actual de su cuenta es $a€")
        return "EL saldo actual de su cuenta es $a€";
    }

    fun Respuesta(indice: Int, saldo: Int,condicion:Boolean) {


        when (indice) {
            1 -> println("Su saldo actual es de $saldo€");
            2 -> println("Deposito realizado con éxito. Su saldo actual es de $saldo");
            3 -> realizarExtracto(saldo ,condicion)
            4 -> println("Hasta pronto!");

        }

    }
}