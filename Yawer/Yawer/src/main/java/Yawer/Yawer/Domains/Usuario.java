package Yawer.Yawer.Domains;


import Yawer.Yawer.Enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;


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

    @Column(name = "Rol")
    @Enumerated(EnumType.STRING)
    private Roles rol;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id")
    private Collection<entityPermisos> permisosCollection;






}
