/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorya;

import Conexion.java;
import pack3.ConexionYoutube;
import pack3.ConexionGoogle;
import pack3.ConexionWhattsapp;
import pack3.ConexionVacia;
import pack3.ConexionFacebook;

public class ConexionFabrica {
    public java getConexion(String motor) {
    if (motor == null) {
               return new ConexionVacia();   
    }
    if (motor.equalsIgnoreCase("Google")){
             return new ConexionGoogle();
    } else if (motor.equalsIgnoreCase("Whattsapp")){
             return new ConexionWhattsapp();
    }  else if (motor.equalsIgnoreCase("Facebook")){
             return new ConexionYoutube();
    } else if (motor.equalsIgnoreCase("Youtube")){
             return new ConexionFacebook();
    }    
    return new ConexionVacia();
  }
}
