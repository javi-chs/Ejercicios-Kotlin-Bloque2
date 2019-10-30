package Ejercicio3

fun main(){
    var caja:CajaAhorros = CajaAhorros("Javier", 1500.0);
    var plazoFijo:PlazoFijo = PlazoFijo("Javier",1500.0,30,5);
    caja.printDetails();
    plazoFijo.printDetails();
}