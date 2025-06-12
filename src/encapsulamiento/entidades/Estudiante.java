package encapsulamiento.entidades;

public class Estudiante {
    private String IdEstudiante;
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private String arrastre;
    private String carrera;
    private int semestre;
    private String foto;
    private Boolean gratiudad;
    private String jornada;
    private static int ids=0;

    public String getIdEstudiante(){return IdEstudiante;}


    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public void setSemestre(int semestre){
        this.semestre=semestre;
    }
    public void setFoto(String foto){
        this.foto=foto;
    }
    public void setArrastre(String arrastre){
        this.arrastre=arrastre;
    }

    public Estudiante(){
        Estudiante.ids=Estudiante.ids + 1;
        IdEstudiante="AB"+ Estudiante.ids;
    }

    public String getCorreo(){
        return (nombre+"."+apellido+"@epn.edu.ec");
    }

    public String getGratuidad() {
        if (arrastre != null && arrastre.equalsIgnoreCase("si")) {
            return "No tiene gratuidad";  // Tiene arrastre, no tiene gratuidad
        }else {
            return "Tiene gratuidad";  // No tiene arrastre, sí tiene gratuidad
        }
    }

    public String getJornada() {
        if (semestre >= 1 && semestre <= 3) {
            return "Mañana";
        } else if (semestre >= 4 && semestre <= 5) {
            return "Tarde";
        } else {
            return "No definida";
        }
    }

    @Override
    public String toString() {
        return "IdEstudiante='" + IdEstudiante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", correo='" + getCorreo() + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                ", foto='" + foto + '\'' +
                ", gratiudad='" + getGratuidad() + '\'' +
                ", jornada='" + getJornada() + '\'' +
                '}';
    }
}