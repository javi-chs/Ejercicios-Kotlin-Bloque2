package Ejercicio2

class EmpleadoView {
    fun preguntaNombre():String{
        println("Indicanos el nombre del empleado");
        var valor = readLine()!!
        return valor;
    }
    fun preguntaApellidos():String{
        println("Indicanos los apellidos del empleado");
        var valor = readLine()!!
        return valor;
    }
    fun preguntaFechaNacimiento():String{
        println("Indicanos la fecha de nacimiento del empleado");
        var valor = readLine()!!
        return valor;
    }
    fun preguntaFechaContrato():String{
        println("Indicanos la fecha de inicio de contrato del empleado");
        var valor = readLine()!!
        return valor;
    }
    fun info(empleado:EmpleadoModel){
        println("**************************************")
        println("Nombre : " + empleado.nombre);
        println("Apellidos : " + empleado.apellidos);
        println("Fecha de Nacimiento : " + empleado.anyoDeNacimiento);
        println("Fecha de inicio de contrato : " + empleado.fechaContrato);
        println("**************************************")
    }

}