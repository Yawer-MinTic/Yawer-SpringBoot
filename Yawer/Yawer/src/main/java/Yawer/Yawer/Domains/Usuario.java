package Yawer.Yawer.Domains;


import Yawer.Yawer.Enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


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


  /* @ManyToOne
    @JoinColumn(name = "Empresa", referencedColumnName = "id")
    private Empresa empresa;


   @OneToMany
   @JoinColumn(name = "MovimientoDinero", referencedColumnName = "id")
   private List<MovimientoDinero> movimientoDinero;

  @OneToMany
  @JoinColumn(name = "Roles", referencedColumnName = "id")
  private Roles roles;*/

}
