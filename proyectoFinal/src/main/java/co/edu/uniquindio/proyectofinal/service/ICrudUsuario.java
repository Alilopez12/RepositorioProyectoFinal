package co.edu.uniquindio.proyectofinal.service;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import java.util.List;

public interface ICrudUsuario {

    Usuario crearUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario obtenerUsuarioPorCedula(String cedula);
    Usuario actualizarUsuario(String cedula, Usuario usuario);
    boolean eliminarUsuario(String cedula);
}
