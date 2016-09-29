package com.example.miguel_pc.unispanproyect.Model;

/**
 * Created by Miguel-PC on 25/09/2016.
 */

public class ListEmpresa {

    private String NombreEmpresa;
    private String Numero;
    private String Estado;
    private String PictureEmpresa;
   // private String PictureEmpresa;

    public ListEmpresa(String nombreEmpresa, String numero, String saldo, String PictureEmpresa) {
    }


    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        NombreEmpresa = nombreEmpresa;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getPictureEmpresa() {
        return PictureEmpresa;
    }

    public void setPictureEmpresa(String pictureEmpresa) {
        PictureEmpresa = pictureEmpresa;
    }
}
