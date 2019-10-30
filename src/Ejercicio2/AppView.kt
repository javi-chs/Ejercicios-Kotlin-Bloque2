package Ejercicio2
//Crear nueva empresa.
// Añadir empleado a empresa existente.
// Listado de empresas.
// Informacion de una empresa en particular.
// Crear empleado.
// Listado de empleados.
// Información de un empleado en particular.
// Salir.
class AppView {
    fun empleadoAnyadido(){
        println("Empleado añadido")
    }

    fun preguntaNombreEmpresa():String{
        println("Indicanos el nombre de tu empresa")
        var nombre:String = readLine().toString();

        return nombre;
    }
    fun preguntaAnyoEmpresa():Int{
        println("Indicanos el año de fundacion de tu empresa")
        var anyo = readLine()!!.toInt();
        return anyo;
    }
    fun infoEmpleado(emp : EmpresaModel, emplo:EmpleadoModel){
        println("Empleado : " + emplo.nombre+ "   "+ emplo.apellidos+"\n"+
                "Año de nacimiento: "+ emplo.anyoDeNacimiento+"\n" +
                "Año de inicio de contrato: "+ emplo.fechaContrato+ "\n"+
                "Trabaja en: " + emp.nombre );
    }
    fun menu(){
      val menu = "                  Menu\n"+
                 "----------------------------------------------\n"+
                 "Opcion 1--->Crear nueva empresa\n"+
                 "Opcion 2--->Añadir empleado\n"+
                 "Opcion 3--->Listado de empresas.\n"+
                 "Opcion 4--->Información de una empresa\n"+
                 "Opcion 5--->Crear empleado.\n"+
                 "Opcion 6--->Listado de empleados\n"+
                 "Opcion 7--->Información de un empleado\n"+
                 "Opcion 8--->Salir\n"
       println(menu);
    }
}