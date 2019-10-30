package Ejercicio7

fun main(){
    var lista :List<Electrodomestico> = listOf(
        Television(1000.0,"",'A',10.0,54,true),
        Lavadora(2000.0,"",'B',15.0,7.0),
        Television(250.0,"",'F',8.0,30,true),
        Lavadora(1000.0,"",'D',41.0,7.0),
        Television(58.0,"",'A',5.0,16,false),
        Lavadora(700.0,"",'G',50.0,7.0),
        Television(1500.0,"",'A',20.0,54,false),
        Lavadora(500.0,"",'C',30.0,7.0),
        Television(1300.0,"",'R',4.0,44,true),
        Lavadora(1800.0,"",'A',56.0,7.0));


        for (i in lista){
        i.precioFinal();
    }

var cont =1
    for (i in lista){
        if(i is Television){
            println("Televison $cont tiene un precio final de " + i.getPrecioBase())
       cont++;
        }
    }
var contador=1;
    for (i in lista){
        if(i is Lavadora){
            println("Lavadora $contador tiene un precio final de " + i.getPrecioBase())
            contador++;

        }
    }


}