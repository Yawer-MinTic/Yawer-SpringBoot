package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.Empresa;
import Yawer.Yawer.Services.ServiceEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RestController

public class EmpresaController {



    @Autowired
    ServiceEmpresa serviceEmpresa;

    @PostMapping (path = "/enterprises")
    private RedirectView crearEmpresa (@ModelAttribute Empresa empresa, Model modelo){
        modelo.addAttribute("Nempresa", new Empresa());

        //modelo.addAttribute(empresa);

        serviceEmpresa.crearEmpresa(empresa).equals(Boolean.TRUE);
            return new RedirectView("/crearEmpresa");


    }





    @GetMapping ("/enterprises")
     private List<Empresa> listaEmpresas (){

        return serviceEmpresa.consultarListaEmpresa();
    }


   @GetMapping (value = "/enterprises/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empresa> buscarEmpresa (@PathVariable int id) {
        Empresa p = serviceEmpresa.buscarEmpresa(id);

        return new ResponseEntity<Empresa>(p, HttpStatus.OK);
    }



    @DeleteMapping("/enterprises/{id}")
    private void EliminarEmpresa (@PathVariable("id") Long id) {
        serviceEmpresa.eliminarrEmpresa(id);
    }


    @PatchMapping  ("/enterprises")
     private void editarEmpresa (@RequestBody Empresa empresa){
        serviceEmpresa.editarEmpresa(empresa);
    }




}
