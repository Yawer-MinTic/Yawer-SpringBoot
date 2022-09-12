package Yawer.Yawer.Domains;


import Yawer.Yawer.Enums.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;

    @Column (name = "NombreEmpleado")
    public String Nombre_Empleado;

    @Column (name = "Email")
    public String Email;

    @Column (name = "Empresa")
    public String Empresa;


   @Enumerated(EnumType.STRING)
   @Column (name = "Roles")
    public Roles rol;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="Empresa1", referencedColumnName = "ID")
    private Empresa Empresa1;


    @JsonIgnore
    @OneToMany
   @JoinColumn(name = "MovimientoDinero", referencedColumnName = "id")
   private List<MovimientoDinero> movimientoDinero;


}
