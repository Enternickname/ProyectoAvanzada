
package proyectoavanzadagit;

import java.util.ArrayList;

public class Cliente {
    private String id_cedula;
    private String telefono;
    private String nombre;
    private String apellido;
    private String correo;
    private ArrayList <Integer> num_asientos;

    public Cliente(String id_cedula, String nombre, String apellido, String telefono, String correo, ArrayList<Integer> num_asientos) {
        this.id_cedula = id_cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.num_asientos = num_asientos;
    }

    public ArrayList <Integer> getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(ArrayList <Integer> num_asientos) {
        this.num_asientos = num_asientos;
    }

    public String getId_cedula() {
        return id_cedula;
    }

    public void setId_cedula(String id_cedula) {
        this.id_cedula = id_cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
