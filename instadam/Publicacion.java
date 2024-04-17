/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instadam;

/**
 *
 * @author dam1
 */
public class Publicacion {
   private String nombreUsuario;
    private String mensaje;

    public Publicacion(String nombreUsuario, String mensaje) {
        this.nombreUsuario = nombreUsuario;
        this.mensaje = mensaje;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
    

