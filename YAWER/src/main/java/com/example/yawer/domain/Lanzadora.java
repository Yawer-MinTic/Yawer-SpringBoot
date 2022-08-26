package com.example.yawer.domain;

public class Lanzadora {

    public static void main(String[] args) {


        System.out.println("CLASE EMPRESA");

        Empresa empresa = new Empresa("Yawer", "carrera 12 # 3-20 ", "212151215", "3126165466");

        System.out.println("Nombre de Empresa: "+empresa.getNombre_Empresa());
        System.out.println("Direccion: "+empresa.getDireccion());
        System.out.println("Telefono: "+empresa.getTelefono());
        System.out.println("NIT: "+empresa.getNit());

        System.out.println("\n");


        Empleado empleado = new Empleado("Ricardo", "jaramilloriki@gmail.com", "Alianza", "Admin");

        System.out.println("CLASE EMPLEADO");
        System.out.println("Nombre: "+empleado.getNombre_Empleado());
        System.out.println("Email: "+empleado.getEmail());
        System.out.println("Rol: "+ empleado.getRol_Empleado());
        System.out.println("Empresa: "+empleado.getEmpresa());

        System.out.println("\n");

        System.out.println("CLASE MOVIMIENTO DINERO");
        MovimientoDinero movimientoDinero = new MovimientoDinero( 1200000, 250000,-100000, "Retiro", "Ricardo");
        System.out.println("Monto Movimiento: "+movimientoDinero.getMonto_Movimiento());
        System.out.println("Usuario: "+movimientoDinero.getUsuario_Registro_Movimiento());
        System.out.println("Montos Positivos: "+movimientoDinero.getMontos_Positivos());
        System.out.println("Montos Negativos: "+movimientoDinero.getMontos_Negativos());
        System.out.println("Concepto Movimiento  "+movimientoDinero.getConcepto_Movimiento());


    }
}
