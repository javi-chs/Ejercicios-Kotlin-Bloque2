package Ejercicio2

class EmpresaController {
    var vistaEmpresa :EmpresaView = EmpresaView();
    var vistaEmpleado :EmpleadoView = EmpleadoView();

    var vistaApp:AppView = AppView();

    var Empresas :Array<EmpresaModel> = arrayOf(EmpresaModel("",0,
        arrayOf(EmpleadoModel("","","",""))));

    fun crearEmpresa(){
        var nombre = vistaApp.preguntaNombreEmpresa()
        var anyo = vistaApp.preguntaAnyoEmpresa()
        var empresa = EmpresaModel(nombre, anyo,
            arrayOf(EmpleadoModel("","","","")));
        Empresas =  Empresas.plus(empresa);

    }
 // Añade a la empresa que se le indica un nuevo empleado
    fun añadirEmpleado(){
        var empresaNombre = vistaApp.preguntaNombreEmpresa();
        var emp = this.crearEmpleado2()
        for(i in Empresas){
            if(i.nombre === empresaNombre){
                i.empleados = i.empleados.plus(emp);
                vistaApp.empleadoAnyadido();
            }
        }
    }

    fun listarEmpresas(){
        vistaEmpresa.listarEmpresas(Empresas);
        }

    fun infoEmpresa(){
        var nombre = vistaApp.preguntaNombreEmpresa();
        for(i in Empresas){
            if(i.nombre === nombre) vistaEmpresa.info(i);
            }
    }

    fun crearEmpleado2():EmpleadoModel{
        var nombre = vistaEmpleado.preguntaNombre();
        var apellidos = vistaEmpleado.preguntaApellidos();
        var fechaNacimiento = vistaEmpleado.preguntaFechaNacimiento();
        var fechaContrato = vistaEmpleado.preguntaFechaContrato();
        var empleado = EmpleadoModel(nombre,apellidos,fechaNacimiento,fechaContrato)
        return empleado;
    }
//Crea el empleado y lo añade a la empresa que se le indica
    fun crearEmpleado(){
        var nombre = vistaEmpleado.preguntaNombre();
        var apellidos = vistaEmpleado.preguntaApellidos();
        var fechaNacimiento = vistaEmpleado.preguntaFechaNacimiento();
        var fechaContrato = vistaEmpleado.preguntaFechaContrato();
        var empleado = EmpleadoModel(nombre,apellidos,fechaNacimiento,fechaContrato)
        var empresa = vistaApp.preguntaNombreEmpresa();
        for(i in Empresas){
            if(i.nombre === empresa){
                i.empleados = i.empleados.plus(empleado);
                vistaApp.empleadoAnyadido();
            }
        }

    }
    fun buscaEmpresa(em:String):EmpresaModel{
        var empresa :EmpresaModel = EmpresaModel("", 0,
            arrayOf(EmpleadoModel("","","","")));
        for(i in this.Empresas){
            if (i.nombre===em) empresa =  i;
        }
        return empresa;
    }
    fun listaEmpleados(){
        var empresa = vistaApp.preguntaNombreEmpresa();
        var miEmpresa = buscaEmpresa(empresa);
        for(i in miEmpresa.empleados){
            vistaEmpleado.info(i);
        }
    }
    fun infoEmpleado(){
        var nombreEmpleado = vistaEmpleado.preguntaNombre();
        var apellido = vistaEmpleado.preguntaApellidos();
        for(i in this.Empresas){
            for(j in i.empleados){
                if(j.nombre==nombreEmpleado && j.apellidos==apellido){
                    vistaApp.infoEmpleado(i,j);
                }
            }
        }
    }

    fun imprimeMenu(){
        var fin = false;
        while(!fin){
            vistaApp.menu()
            val op = readLine()!!.toInt();
            when(op){
                1->this.crearEmpresa();
                2->this.añadirEmpleado();
                3->this.listarEmpresas();
                4->this.infoEmpresa();
                5->this.crearEmpleado();
                6->this.listaEmpleados();
                7->this.infoEmpleado();
                8->fin=true;
            }
        }
    }
}
