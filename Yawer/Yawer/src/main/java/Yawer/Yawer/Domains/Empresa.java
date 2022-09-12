package Yawer.Yawer.Domains;

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


@Table (name = "Empresa")
public class Empresa {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NombreEmpresa")
    public String Nombre_Empresa;
    @Column (name = "Direccion")
    public String Direccion;
    @Column(name = "Telefono")
    public String Telefono;
    @Column(name = "NIT")
    public String Nit;


    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "Usuario-ID", referencedColumnName = "id")
    private List<Usuario> usuario;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "MovimientoDinero",referencedColumnName = "id")
    private List<MovimientoDinero> movimientoDineros;

}
