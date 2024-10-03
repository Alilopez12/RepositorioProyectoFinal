package co.edu.uniquindio.proyectofinal.service;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import java.util.List;

public interface ICrudUsuario {

    boolean crearUsuario(String nombre, String apellidos, String cedula, String direccion, String contraseña);
    boolean eliminarUsuario(String cedula);
    boolean modificarUsuario(String nombre, String apellidos, String cedula, String direccion, String contraseña);
    Usuario buscarUsuario(String cedula);
    List<Usuario> listarUsuarios();

    boolean verificarUsuarioExistente(String cedula);
}
