
package proyectoavanzadagit;

import java.util.ArrayList;
import java.util.Date;

public class Bus {
    private String ruta;
    private Date fecha;
    private String horario;
    private final Integer num_total_asientos;
    private ArrayList <Boolean> num_asientos;

    public Bus(String ruta, Date fecha, String horario) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.horario = horario;
        this.num_total_asientos =55;
        for(int i=0;i<this.num_total_asientos;i++)
            this.num_asientos.add(Boolean.TRUE);
    }
    
    

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void reemplazo(int[] ocupados){
        for(int i=0;i<ocupados.length;i++)
            this.num_asientos.set(ocupados[i], Boolean.FALSE);
    }
    
    
}
