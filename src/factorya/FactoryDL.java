/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorya;

import Conexion.java;
public class FactoryDL {

    
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        java cx1 = fabrica.getConexion("Google");
        cx1.conectar();
        cx1.desconectar();
        
        java cx2 = fabrica.getConexion("Whattsapp");
        cx2.conectar();
        cx2.desconectar();
        
        java cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
    
}

