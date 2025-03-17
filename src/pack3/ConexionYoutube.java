/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack3;

import Conexion.java;

public class ConexionYoutube implements java {
     private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
     public ConexionYoutube(){
       
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "Daniel";
        this.contrasena = "0225";
        
    }
    
    public void conectar(){
    System.out.println("se conecto a Youtube");
    }
    public void desconectar(){
    System.out.println("se desconecto de Youtube");
    }
    public String toString(){
    return "ConexionYoutube [host =" + host + ", puerto = " + puerto + ", usuario = " + usuario + 
            ", contraseña = " + contrasena + "]";
    }
}
