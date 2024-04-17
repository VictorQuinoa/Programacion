/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instadam;

/**
 *
 * @author dam1
 */
import java.util.ArrayList;
import java.util.List;

public class RedSocial {
    private List<Usuario> usuarios;
    private List<Publicacion> publicaciones;

    public RedSocial() {
        this.usuarios = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

    public boolean registrarUsuario(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return false;
            }
        }
        usuarios.add(new Usuario(nombreUsuario, contrasena));
        return true;
    }

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    public void publicarMensaje(String nombreUsuario, String mensaje) {
        publicaciones.add(new Publicacion(nombreUsuario, mensaje));
    }

    public List<Publicacion> verPublicaciones() {
        return publicaciones;
    }

    public Usuario getUsuario(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }
}