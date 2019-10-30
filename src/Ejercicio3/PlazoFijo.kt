package Ejercicio3

class PlazoFijo(  nombre:String,  amount:Double,val plazo:Int, val tasa:Int):Cuenta(nombre,amount) {

    override fun printDetails(){
        println("        Plazo Fijo ");
        println("---------------------------------");
        super.printDetails();
        println("Dias de plazo: ${this.plazo}");
        println("Tasa de interes: ${this.tasa}%");
    }
}