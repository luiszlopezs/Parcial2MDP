package Parcial2.decorator;

import Parcial2.abstractproduct.Reporte;

public abstract class ReporteDecorador extends Reporte {
    protected Reporte reporte;
    public ReporteDecorador(Reporte reporte) { this.reporte = reporte; }
}
