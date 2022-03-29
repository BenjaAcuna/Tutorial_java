public class Materia {
    
    String nombre;
    String profesor;
    String descripcion;

    public Materia(){
        this.nombre = "Ejemplo";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    public String getProfesor(){
        return this.profesor;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }


}
