package Parcial2.factory;

import Parcial2.abstractproduct.Reporte;
import Parcial2.concreteproducts.*;
import Parcial2.singleton.ConfiguracionSistema;

public class ReporteFactory {

    public Reporte crearReporte(String tipo) {

        ConfiguracionSistema config = ConfiguracionSistema.obtenerInstancia();
        System.out.println("Generando en: " + config.getDirectorioSalida());

        return switch (tipo) {
            case "pdf" -> new ReportePDF();
            case "excel" -> new ReporteExcel();
            case "html" -> new ReporteHTML();
            default -> null;
        };
    }

    public Reporte crearReportePorDefecto() {
        return crearReporte(ConfiguracionSistema.obtenerInstancia().getFormatoPorDefecto());
    }
}
