package Herencia;

/**@author Angie Vanessa Ramirez Rocha Cod: 085450292023 Grupo 6*/
public class main {
    public static void main(String[] args) {
        Developer dev = new Developer("Angie", "Ramirez", 3000000, "Python, JavaScript", true);
        ScrumMaster scrumMaster = new ScrumMaster("Vanessa", "Rocha", 2500000, "CSM, PMP", "Liderazgo, Organización");
        Qa qa = new Qa("Clark", "Kent", 1800000, "Selenium, Jira", "ISTQB");

        dev.mostrarEmpleado();
        dev.programar();
        dev.probar();

        scrumMaster.mostrarEmpleado();
        scrumMaster.liderarScrum();

        qa.mostrarEmpleado();
        qa.probar();
}}
