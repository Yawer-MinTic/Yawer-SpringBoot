package Yawer.Yawer.Domains;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "permisos")

public class entityPermisos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Lectura")
    private Boolean lectura;
    @Column(name = "escritura")
    private Boolean escritura;
    @Column(name = "actualizar")
    private Boolean actualizar;
    @Column(name = "borrar")
    private Boolean borrar;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;


    public entityPermisos(Boolean lectura, Boolean escritura, Boolean actualizar, Boolean borrar, Usuario idUsuario) {
        this.lectura = lectura;
        this.escritura = escritura;
        this.actualizar = actualizar;
        this.borrar = borrar;
        this.idUsuario = idUsuario;
    }
}
