package calculo.salario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FunctionaryTest {

    @Test void functionaryIsDev(){
        Functionary func1 = new Functionary("Gragote", "gragote@domain.com", 2000, Position.DEV);
        assertEquals(1600.0, func1.getNetSalary());

        Functionary func2 = new Functionary("Gragote", "gragote@domain.com", 3000, Position.DEV);
        assertEquals(2400.0, func2.getNetSalary());

        Functionary func3 = new Functionary("Gragote", "gragote@domain.com", 3500, Position.DEV);
        assertEquals(2800.0, func3.getNetSalary());
    }

    @Test void functionaryIsTester(){
        Functionary func1 = new Functionary("Gragote", "gragote@domain.com", 1000, Position.DEV);
        assertEquals(800.0, func1.getNetSalary());

        Functionary func2 = new Functionary("Gragote", "gragote@domain.com", 2000, Position.DEV);
        assertEquals(1600.0, func2.getNetSalary());

        Functionary func3 = new Functionary("Gragote", "gragote@domain.com", 4500, Position.DEV);
        assertEquals(3600.0, func3.getNetSalary());
    }

    @Test void functionaryIsManager(){
        Functionary func1 = new Functionary("Gragote", "gragote@domain.com", 500, Position.DEV);
        assertEquals(400.0, func1.getNetSalary());

        Functionary func2 = new Functionary("Gragote", "gragote@domain.com", 2000, Position.DEV);
        assertEquals(1600.0, func2.getNetSalary());;

        Functionary func3 = new Functionary("Gragote", "gragote@domain.com", 10500, Position.DEV);
        assertEquals(8400.0, func3.getNetSalary());
    }

    @Test void functionaryIsDBA(){
        Functionary func1 = new Functionary("Gragote", "gragote@domain.com", 2000, Position.DEV);
        assertEquals(1600.0, func1.getNetSalary());

        Functionary func2 = new Functionary("Gragote", "gragote@domain.com", 5000, Position.DEV);
        assertEquals(4000.0, func2.getNetSalary());

        Functionary func3 = new Functionary("Gragote", "gragote@domain.com", 10000, Position.DEV);
        assertEquals(8000.0, func3.getNetSalary());
    }
}
