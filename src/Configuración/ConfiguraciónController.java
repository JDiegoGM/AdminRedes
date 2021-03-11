/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuración;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;
import ventanas.ventana;

/**
 * FXML Controller class
 *
 * @author zneo1
 */
public class ConfiguraciónController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    //valores de la tabla
    @FXML TableColumn<Tabla, String> Codigo; 
    @FXML TableColumn<Tabla, String> Dispositivo; 
    @FXML TableColumn<Tabla, String> Usuario;  
    @FXML TableColumn<Tabla, String> Contraseña;
    @FXML TableColumn<Tabla, String> Ip;  
    @FXML TableColumn<Tabla, String> Mascara;
    @FXML TableColumn<Tabla, String> Conectado;  
    //Textos
    @FXML TextField TCodigo;
    @FXML TextField TDispositivo;
    @FXML TextField TUsuario;
    @FXML TextField TContraseña;
    @FXML TextField TIp;
    @FXML TextField TMascara;
    @FXML TextField TConectado;
    
    ventana vt=new ventana();
    public static ObservableList<Tabla> datosConf=FXCollections.observableArrayList(    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Codigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        Dispositivo.setCellValueFactory(new PropertyValueFactory<>("Dispositivo"));
        Usuario.setCellValueFactory(new PropertyValueFactory<>("Usuario"));
        Contraseña.setCellValueFactory(new PropertyValueFactory<>("Contraseña"));
        Ip.setCellValueFactory(new PropertyValueFactory<>("Ip"));
        Mascara.setCellValueFactory(new PropertyValueFactory<>("Mascara"));
        Conectado.setCellValueFactory(new PropertyValueFactory<>("Conectado"));
    } 
    
    @FXML private void Agregar(ActionEvent ev)
    {
        if(!TCodigo.getText().equals("") && !TDispositivo.getText().equals("") && !TUsuario.getText().equals("") && !TContraseña.getText().equals("")
           &&!TIp.getText().equals("") && !TMascara.getText().equals("") && !TConectado.getText().equals("") )
        {
            datosConf.add( new Tabla( TCodigo.getText(), TDispositivo.getText(), TUsuario.getText(), TContraseña.getText(), TIp.getText(), TMascara.getText(), TConectado.getText() ) );
            JOptionPane.showMessageDialog(null,"Configuración actualizada");
            limpiar();
        }
        else
            JOptionPane.showMessageDialog(null,"Campos vacios");
    }
    public void limpiar()
    {
        TCodigo.setText("");
        TDispositivo.setText("");
        TUsuario.setText("");
        TContraseña.setText("");
        TIp.setText("");
        TMascara.setText("");
        TConectado.setText("");
    }
    @FXML void menuPrincipal(ActionEvent ev)
    {
        vt.menuPrincipal(ev);
    }
}
