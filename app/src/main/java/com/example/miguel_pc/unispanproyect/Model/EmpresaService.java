package com.example.miguel_pc.unispanproyect.Model;

import com.example.miguel_pc.unispanproyect.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel-PC on 25/09/2016.
 */

public class EmpresaService {

    private List<ListEmpresa> empresa;


    public List<ListEmpresa> getEmpresa(){
        if(empresa == null)
            empresa = new ArrayList<ListEmpresa>();
        this.IniciailizarDate();
        return empresa;
    }


    public boolean addEmpresa(String NombreEmpresa,String Numero, String Estado, String PictureEmpresa){
        if(finEmpresaByEmpresa(NombreEmpresa) != null) return false;

        ListEmpresa empresa = new ListEmpresa(NombreEmpresa,Numero,Estado, PictureEmpresa);
        this.getEmpresa().add(empresa);
        return true;
    }

    public ListEmpresa finEmpresaByEmpresa(String NombreEmpresa){
        int empresa_count = this.getEmpresa().size();

        for (int i =0; i< empresa_count; i++){
            if(getEmpresa().get(i).getNombreEmpresa().equalsIgnoreCase(NombreEmpresa))
                return getEmpresa().get(i);
        }
        return null;
    }

    private void IniciailizarDate(){
        this.addEmpresa("Empresa 2","(01) 42552525","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 3","(01) 53453453","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 4","(01) 34636364","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 5","(01) 34634634","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 6","(01) 22523255","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 7","(01) 23523552","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
        this.addEmpresa("Empresa 8","(01) 23523525","Saldo Pendiente",Integer.toString(R.mipmap.ic_launcher));
    }
}
