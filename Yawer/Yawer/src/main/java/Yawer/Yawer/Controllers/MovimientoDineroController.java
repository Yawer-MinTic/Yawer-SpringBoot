package Yawer.Yawer.Controllers;

import Yawer.Yawer.Domains.MovimientoDinero;
import Yawer.Yawer.Services.ServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MovimientoDineroController {

    @Autowired
    ServicioMovimientoDinero servicioMovimientoDinero;

    @GetMapping( "/enterprises/movements")
    private List<MovimientoDinero> movimientoDineros (){

        return servicioMovimientoDinero.consultarMovientoDinero();
    }

    @PostMapping(path ="/enterprises/movements", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private void HacerMovimientoDinero (@RequestBody MovimientoDinero movimientoDinero) {
        servicioMovimientoDinero.HacerMovimientoDinero(movimientoDinero);
    }


    @GetMapping ("/enterprises/{id}/movements/Movements")
    public ResponseEntity<MovimientoDinero> buscarMovimientoDinero (@PathVariable Long id) {
        MovimientoDinero p = servicioMovimientoDinero.buscarMovimientoDinero(id);

        return new ResponseEntity<MovimientoDinero>(p, HttpStatus.OK);
    }


    @DeleteMapping  ("/enterprises/movements")
    private void EliminarMovimientoDinero (@PathVariable("id") Long id) {
        servicioMovimientoDinero.eliminarrMovientoDinero(id);
    }


    @PatchMapping  ("/enterprises/{id}/movements")
    private void editarMovimientoDinero (@RequestBody MovimientoDinero movimientoDinero){
        servicioMovimientoDinero.editarMovimientoDinero(movimientoDinero);
    }

}
