package Herencia;

/**@author Angie Vanessa Ramirez Rocha Cod: 085450292023 Grupo 6*/
public class Qa extends Empleado {
    private String herramientas;
    private String certificaciones;

    public Qa(String nombre, String apellido, float salario, String herramientas, String certificaciones) {
        super(nombre, apellido, salario);
        this.herramientas = herramientas;
        this.certificaciones = certificaciones;
    }

    public void probar() {
        System.out.println(getNombre() + " " + getApellido() + " está probando con " + herramientas + ".");
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
}