package co.edu.uniquindio.proyectofinal.mapping.dto;

public record UsuarioDto(String nombre, String apellidos, String cedula, String direccion, String contraeña) {
    @Override
    public String toString() {
        return "UsuarioDto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", contraeña='" + contraeña + '\'' +
                '}';
    }
}

