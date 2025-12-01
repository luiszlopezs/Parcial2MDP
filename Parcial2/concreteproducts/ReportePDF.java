package Parcial2.concreteproducts;

import Parcial2.abstractproduct.Reporte;

public class ReportePDF extends Reporte {
    @Override
    public String generarContenido() {
        return "Reporte en PDF";
    }
}
