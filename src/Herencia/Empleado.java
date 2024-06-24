package Herencia;

/**@author Angie Vanessa Ramirez Rocha Cod: 085450292023 Grupo 6*/
public class Empleado {
    public String nombre;
    public String apellido;
    private final float salario;

    public Empleado(String nombre, String apellido, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void mostrarEmpleado() {
        System.out.println("Empleado: " + nombre + " " + apellido + ", Salario: " + salario);
    }
}