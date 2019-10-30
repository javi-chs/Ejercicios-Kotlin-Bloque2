package Ejercicio3
//Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo.
//Definir las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y agruparlos en la clase Cuenta.
//Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto.
//Un plazo fijo añade un plazo de imposición en días y una tasa de interés.
//Hacer que la caja de ahorro no genera intereses.
//En la función main del programa definir un objeto de la clase CajaAhorro y otro de la clase PlazoFijo.
open abstract class Cuenta (var nombreTitular:String, var amount:Double){


    fun loadName(){
        println("Indicanos el nombre del titular");
        this.nombreTitular = readLine()!!;
    }
    fun loadAmount(){
        println("Indicanos el saldo inicial de la cuenta");
        this.amount = readLine()!!.toDouble();
    }
    fun extracto(amount:Double){

        if(amount>this.amount){
                println("Imposible hacer extracto, saldo insuficiente");
                 }

        else{
            this.amount -= amount;
            println("Extracto realizado con exito!\n Saldo actual: ${this.amount}");
            }
    }
    fun ingreso(amount: Double){
        this.amount += amount;
        println("Ingreso realizado con exito!\n Saldo actual: ${this.amount}");
    }

   open fun printDetails() {
        println("Titular de la cuenta : ${this.nombreTitular} \n+" +
                "Saldo total: ${this.amount}");
    }
}