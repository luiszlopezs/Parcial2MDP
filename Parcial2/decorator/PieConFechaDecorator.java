package Parcial2.decorator;

import Parcial2.abstractproduct.Reporte;
import java.time.LocalDateTime;

public class PieConFechaDecorator extends ReporteDecorador {

    public PieConFechaDecorator(Reporte reporte) { super(reporte); }

    @Override
    public String generarContenido() {
        return reporte.generarContenido() + "\nGenerado el: " + LocalDateTime.now();
    }
}
