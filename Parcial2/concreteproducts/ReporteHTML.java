package Parcial2.concreteproducts;

import Parcial2.abstractproduct.Reporte;

public class ReporteHTML extends Reporte {
    @Override
    public String generarContenido() {
        return "Reporte en HTML";
    }
}
