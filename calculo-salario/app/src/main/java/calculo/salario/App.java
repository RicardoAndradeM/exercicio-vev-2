/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculo.salario;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
    	Functionary func = new Functionary("Gragote", "gragote@domain.com", 2327.20, Position.DEV);

        System.out.println(func.getNetSalary());
    }
}
