package com.example.yawer.domain.Services;

import com.example.yawer.domain.Domain.Empresa;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;


@Service
public class ServiceEmpresa {

    static ArrayList<Empresa> Empresas;


    public static ArrayList<Empresa> Empresas(){

        System.out.println("Listas de Empresas");

        return Empresas;
    }



    public Empresa buscarEmpresa (String Nombre_Empresa){

        Empresa empresa = null;

        for (Empresa p :Empresas() ) {
            if (p.getNombre_Empresa() == Nombre_Empresa){
                return p;
            }
        }

        return empresa;
    }


    public void addEmpresa (Empresa empresa){

        Empresa newEmpresa = new Empresa();

         empresa.setNombre_Empresa(empresa.getNombre_Empresa());
         empresa.setNit(empresa.getNit());
         empresa.setTelefono(empresa.getTelefono());
         empresa.setDireccion(empresa.getDireccion());

    }


    public void modificarEmpresa (Empresa empresa){
    System.out.println("");


    }

    public ArrayList<Empresa> eliminarEmpresa (Empresa empresa) {

        Empresas.remove(empresa);

        return Empresas;
    }

}
