package Yawer.Yawer.Domains;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Setter
@Getter

@Table(name = "MovimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;

    @Column (name = "MontoMovimiento")
    public double Monto_Movimiento;
    @Column (name = "MontosPositivos")
    public double Montos_Positivos;
    @Column (name = "MontosNegativos")
    public double Montos_Negativos;
    @Column (name = "ConceptoMovimientos")
    public String Concepto_Movimiento;
    @Column (name = "UsuarioRegistroMovimiento")
    public String Usuario_Registro_Movimiento;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Usuario",referencedColumnName ="id")
    private Usuario usuario;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Empresa", referencedColumnName = "id")
    private Empresa empresa;
}