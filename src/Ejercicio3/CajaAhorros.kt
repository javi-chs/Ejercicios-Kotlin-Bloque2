package Ejercicio3

class CajaAhorros (nombre:String, amount:Double):Cuenta(nombre,amount){
    override fun printDetails(){
        println("        Caja de Ahorros");
        println("---------------------------------");
        super.printDetails();
    }

}