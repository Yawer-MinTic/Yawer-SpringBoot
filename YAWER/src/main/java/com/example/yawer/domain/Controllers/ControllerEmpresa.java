package com.example.yawer.domain.Controllers;


import com.example.yawer.domain.Domain.Empresa;
import com.example.yawer.domain.Services.ServiceEmpresa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/controller")


public class ControllerEmpresa {


    @GetMapping(path = "/enterprises", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Empresa> Empresas (){

        System.out.println("Ingreso al Metodo");

        return ServiceEmpresa.Empresas();
    }




}
