/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuración;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author zneo1
 */
public class Tabla {
    private final SimpleStringProperty CodigoR;
    private final SimpleStringProperty DispositivoR;
    private final SimpleStringProperty UsuarioR;
    private final SimpleStringProperty ContraseñaR;
    private final SimpleStringProperty IpR;
    private final SimpleStringProperty MascaraR;
    private final SimpleStringProperty ConectadoR;
    
    public Tabla(String cod, String dis, String usua, String contra, String Ip, String Masc, String Conectado)
    {
        CodigoR=new SimpleStringProperty(cod);
        DispositivoR=new SimpleStringProperty(dis);
        UsuarioR=new SimpleStringProperty(usua);
        ContraseñaR=new SimpleStringProperty(contra);
        IpR=new SimpleStringProperty(Ip);
        MascaraR=new SimpleStringProperty(Masc);
        ConectadoR=new SimpleStringProperty(Conectado);
    }
    
    // 
    public String getCod()
    {
        return CodigoR.get();
    }
    public String getDisp()
    {
        return DispositivoR.get();
    }
    public String getUsua()
    {
        return UsuarioR.get();
    }
    public String getContra()
    {
        return ContraseñaR.get();
    }
    public String getIp()
    {
        return IpR.get();
    }
    public String getMasc()
    {
        return MascaraR.get();
    }
    public String getConect()
    {
        return ConectadoR.get();
    }
    //
    public void setCod(String cod)
    {
        CodigoR.set(cod);
    }
    public void setDisp(String disp)
    {
        DispositivoR.set(disp);
    }
    public void setUsua(String usua)
    {
        UsuarioR.set(usua);
    }
    public void setContra(String contra)
    {
        ContraseñaR.set(contra);
    }
    public void setIp(String Ip)
    {
        IpR.set(Ip);
    }
    public void setMasc(String Masc)
    {
        MascaraR.set(Masc);
    }
    public void setConect(String Conectado)
    {
        ConectadoR.set(Conectado);
    }
}

