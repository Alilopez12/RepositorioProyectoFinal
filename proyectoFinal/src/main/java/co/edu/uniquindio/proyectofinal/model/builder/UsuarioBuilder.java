package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;


public class UsuarioBuilder {
    protected String nombre;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String contraseña;

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder apellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public UsuarioBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder contraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    // Método build que crea la instancia de Usuario
    public Usuario build() {
        return new Usuario(nombre, apellidos, cedula, direccion, contraseña);
    }
}

