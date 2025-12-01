package Parcial2.decorator;

import Parcial2.abstractproduct.Reporte;

public class EncabezadoDecorador extends ReporteDecorador {

    public EncabezadoDecorador(Reporte reporte) { super(reporte); }

    @Override
    public String generarContenido() {
        return "=== ENCABEZADO === \n" + reporte.generarContenido();
    }
}
