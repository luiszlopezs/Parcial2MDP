package Parcial2.decorator;

import Parcial2.abstractproduct.Reporte;
import Parcial2.singleton.ConfiguracionSistema;

public class MarcaAguaDecorador extends ReporteDecorador {

    public MarcaAguaDecorador(Reporte reporte) { super(reporte); }

    @Override
    public String generarContenido() {
        if (!ConfiguracionSistema.obtenerInstancia().isMostrarMarcaAgua()) {
            return reporte.generarContenido();
        }
        return reporte.generarContenido() + "\n[MARCA DE AGUA]";
    }
}
