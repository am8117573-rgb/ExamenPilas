public class Obj {

    private int id;
    private String tipoAccion;
    private String descripcion;
    private String fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return 
          "Id: " + id + 
          "\nTipo: " + tipoAccion +
          "\nDescripción: " + descripcion +
          "\nFecha: " + fecha +
          "\n-----------------------";

 }
   
}
