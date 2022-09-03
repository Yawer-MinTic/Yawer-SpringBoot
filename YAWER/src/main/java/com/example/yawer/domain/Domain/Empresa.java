package com.example.yawer.domain.Domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empresa{

    public Empresa(String nombre_empresa, String direccion, String telefono, String nit) {
        Nombre_Empresa = nombre_empresa;
        Direccion = direccion;
        Telefono = telefono;
        Nit = nit;
    }

    public String Nombre_Empresa;
    public String Direccion;
    public String Telefono;
    public String Nit;



//CONSTRUCTOR VACIO PARA EL SERVICIO EMPRESA
    public Empresa() {

    }
}
