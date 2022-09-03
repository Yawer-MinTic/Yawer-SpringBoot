package com.example.yawer.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class MovimientoDinero {
    public double Monto_Movimiento;
    public double Montos_Positivos;
    public double Montos_Negativos;
    public String Concepto_Movimiento;
    public String Usuario_Registro_Movimiento;



    public MovimientoDinero(double monto_Movimiento, double montos_Positivos, double montos_Negativos,
                            String concepto_Movimiento, String usuario_Registro_Movimiento) {
        Monto_Movimiento = monto_Movimiento;
        Montos_Positivos = montos_Positivos;
        Montos_Negativos = montos_Negativos;
        Concepto_Movimiento = concepto_Movimiento;
        Usuario_Registro_Movimiento = usuario_Registro_Movimiento;
    }


}