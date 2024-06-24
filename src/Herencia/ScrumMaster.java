package Herencia;

/**@author Angie Vanessa Ramirez Rocha Cod: 085450292023 Grupo 6*/
public class ScrumMaster extends Empleado {
    private String certificaciones;
    private String habilidadesBlandas;

    public ScrumMaster(String nombre, String apellido, float salario, String certificaciones, String habilidadesBlandas) {
        super(nombre, apellido, salario);
        this.certificaciones = certificaciones;
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public void liderarScrum() {
        System.out.println(getNombre() + " " + getApellido() + " está liderando una reunión Scrum.");
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getHabilidadesBlandas() {
        return habilidadesBlandas;
    }

    public void setHabilidadesBlandas(String habilidadesBlandas) {
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
}