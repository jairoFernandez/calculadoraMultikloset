package net.tucompualdia.app.calctablas;

import com.orm.SugarRecord;

/**
 * Creado por Jairo Fernández para Tu compu al día 21/07/15.
 */
public class TipoLamina extends SugarRecord<TipoLamina> {
    String tipoLamina;
    String alto;
    String ancho;
    String espesor;
    String valor;
    String area;
    String valorCm;

    public TipoLamina(){

    }

    public TipoLamina(String tipoLamina, String alto, String ancho, String valor, String valorCm) {
        this.tipoLamina = tipoLamina;
        this.ancho = ancho;
        this.alto = alto;
        this.valor = valor;
        this.valorCm = valorCm;
    }

    public String getTipoLamina() {
        return tipoLamina;
    }

    public void setTipoLamina(String tipoLamina) {
        this.tipoLamina = tipoLamina;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEspesor() {
        return espesor;
    }

    public void setEspesor(String espesor) {
        this.espesor = espesor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getValorCm() {
        return valorCm;
    }

    public void setValorCm(String valorCm) {
        this.valorCm = valorCm;
    }
}
