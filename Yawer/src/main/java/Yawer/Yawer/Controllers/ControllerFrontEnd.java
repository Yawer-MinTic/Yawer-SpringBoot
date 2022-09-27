package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.Empresa;
import Yawer.Yawer.Domains.MovimientoDinero;
import Yawer.Yawer.Domains.Usuario;
import Yawer.Yawer.Services.ServiceEmpresa;
import Yawer.Yawer.Services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;
import org.thymeleaf.model.IModel;

import java.util.List;

@Controller
public class ControllerFrontEnd {

    @Autowired
    ServiceEmpresa serviceEmpresa;

    @Autowired
    ServiceUsuario serviceUsuario;


    @GetMapping(path = "/home")
    public String home(){
        return  "index";

    }


    @GetMapping(path = "/empresas")
    public String empresas(Model modelo){

        List<Empresa> listaEmpresas = serviceEmpresa.consultarListaEmpresa();
        modelo.addAttribute("empresasLista", listaEmpresas);

        return  "empresas";

    }

    @GetMapping  (path = "/crearEmpresa")
    public String crearEmpresa ( Model modelo ){
       // modelo.addAttribute("Nempresa", new Empresa());

        return "crearEmpresa";
    }


    @GetMapping(path = "/crearUsuario")
    public String crearUsuario (Model modelo1 ){
        modelo1.addAttribute("Nusuario", new Usuario());

        return "CrearUsuario";

    }


    @PostMapping (path = "/enterprises/crearEmpresa")
    private RedirectView crearEmpresaUno (@ModelAttribute Empresa empresa, Model modelo){
        modelo.addAttribute("Nempresa", new Empresa());

        //modelo.addAttribute(empresa);

        serviceEmpresa.crearEmpresa(empresa).equals(Boolean.TRUE);
        return new RedirectView("/crearEmpresa");


    }


    @GetMapping(path = "/login")
     public String login (Model modelo){


        return "login";
    }


    @GetMapping(path = "/movimientoDinero")
    public String Movimiento (Model modelo){


        return "CrearMovimiento";
    }




}
