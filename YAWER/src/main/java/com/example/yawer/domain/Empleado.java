package com.example.yawer.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Empleado {

    public Empleado(String nombre_Empleado, String email, String empresa, String rol_Empleado) {
        Nombre_Empleado = nombre_Empleado;
        Email = email;
        Empresa = empresa;
        Rol_Empleado = rol_Empleado;
    }

    public String Nombre_Empleado;
    public String Email;
    public String Empresa;
    public String Rol_Empleado;


}
