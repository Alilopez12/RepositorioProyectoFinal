package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.service.ICrudUsuario;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements ICrudUsuario {
    List<Usuario> listUsuarios = new ArrayList<>();


    private String nombre;

    public MarketPlace() {
    }

    @Override
    public boolean crearUsuario(String nombre, String apellidos, String cedula, String direccion, String contraseña) {
        Usuario usuarioEncontrado = verificarUsuario(cedula);

        if (usuarioEncontrado == null) {
            Usuario usuario = Usuario.builder()

                    .nombre(nombre)
                    .apellidos(apellidos)
                    .cedula(cedula)
                    .direccion(direccion)
                    .contraseña(contraseña)
                    .build();

            getListUsuarios().add(usuario);

            return true;
        }

        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula) {
        Usuario usuarioEncontrado = verificarUsuario(cedula);
        if (usuarioEncontrado != null) {
            getListUsuarios().remove(usuarioEncontrado);
            return true;
        }
        return false;
    }
    @Override
    public boolean modificarUsuario(String nombre, String apellidos, String cedula, String direccion, String contraseña) {
        Usuario usuarioEncontrado = verificarUsuario(cedula);
        if (usuarioEncontrado != null) {
            usuarioEncontrado.setNombre(nombre);
            usuarioEncontrado.setApellidos(apellidos);
            usuarioEncontrado.setCedula(cedula);
            usuarioEncontrado.setDireccion(direccion);
            usuarioEncontrado.setContraseña(contraseña);

            return true;
        }
        return false;
    }

    @Override
    public Usuario buscarUsuario(String cedula) {
        Usuario usuarioEncontrado = verificarUsuario(cedula);
        if (usuarioEncontrado != null) {
            return usuarioEncontrado;
        }
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return List.of();
    }

    @Override
    public boolean verificarUsuarioExistente(String cedula) {
        return verificarUsuario(cedula) != null;
    }

    public Usuario verificarUsuario(String cedula) {
        Usuario usuarioExistente = null;

        for (Usuario usuario : listUsuarios) {
            if (usuario.getCedula().equals(cedula)) {
                usuarioExistente = usuario;
                break;
            }
        }
        return usuarioExistente;
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
