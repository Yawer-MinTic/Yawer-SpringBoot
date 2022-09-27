package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.Usuario;
import Yawer.Yawer.Services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RestController
public class UsuarioController {

@Autowired
ServiceUsuario serviceUsuario;


    @GetMapping ("/users")
    private List<Usuario> listaUsuarios (){
        return serviceUsuario.consultarListaUsuarios();
    }


    @PostMapping("/users")
    private void crearUsuario (@RequestBody Usuario usuario) {
        serviceUsuario.crearUsuario(usuario);

    }


    @GetMapping ("/users/{id}")
    public ResponseEntity<Usuario> buscarUsuario (@PathVariable int id) {
        Usuario p = serviceUsuario.buscarUsuario(id);

        return new ResponseEntity<Usuario>(p, HttpStatus.OK);
    }

    @PatchMapping  ("/users/{id}")
    private void editarUsuario (@RequestBody Usuario usuario){
        serviceUsuario.editarUsuario(usuario);
    }


    @DeleteMapping("/users/{id}")
    private void EliminarUsuario (@PathVariable("id") Long id) {
            serviceUsuario.eliminarrUsuario(id);
    }

 /*@PostMapping(path = "/usersRol", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void insertarUsuarioRol (@RequestBody Usuario usuario ){

        serviceUsuario.insertarUsuarioRol(usuario);

    }*/


    @PostMapping(path = "/usersRol")
    public RedirectView insertarUsuarioRol (@ModelAttribute Usuario usuario, Model modelo ) {
        modelo.addAttribute(usuario);

        if (serviceUsuario.insertarUsuarioRol(usuario).equals(Boolean.TRUE)) {
            return  new RedirectView("crearUsuario");

        }else {
            return new RedirectView();        }

    }
}
