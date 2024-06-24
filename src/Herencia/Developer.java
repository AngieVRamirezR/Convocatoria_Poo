package Herencia;

/**@author Angie Vanessa Ramirez Rocha Cod: 085450292023 Grupo 6*/
public class Developer extends Empleado {
    private String lenguajes;
    private boolean esBackend;

    public Developer(String nombre, String apellido, float salario, String lenguajes, boolean esBackend) {
        super(nombre, apellido, salario);
        this.lenguajes = lenguajes;
        this.esBackend = esBackend;
    }

    public void programar() {
        System.out.println(getNombre() + " " + getApellido() + " está programando en " + lenguajes + ".");
    }

    public void probar() {
        System.out.println(getNombre() + " " + getApellido() + " está probando su código.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    private String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public boolean isEsBackend() {
        return esBackend;
    }

    public void setEsBackend(boolean esBackend) {
        this.esBackend = esBackend;
    }
    
}
