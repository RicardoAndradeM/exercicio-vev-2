package calculo.salario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class newTestes {

    @Test void CasoDeTeste1() {
        Functionary f = new Functionary("John", "john@example.com",2999.99, Position.DEV);
        assertEquals(2399.99,Math.round(f.getNetSalary() * 100.0)/100.0);
    }

    @Test void CasoDeTeste2() {
        Functionary f = new Functionary("John", "john@example.com",3000, Position.DEV);
        assertEquals(2400.00,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste3() {
        Functionary f = new Functionary("John", "john@example.com",3000.01, Position.DEV);
        assertEquals(2400.01,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste4() {
        Functionary f = new Functionary("John", "john@example.com",1999.99, Position.DBA);
        assertEquals(1699.99,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste5() {
        Functionary f = new Functionary("John", "john@example.com",2000.00, Position.DBA);
        assertEquals(1500.00,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste6() {
        Functionary f = new Functionary("John", "john@example.com",2000.01, Position.DBA);
        assertEquals(1500.01,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste7() {
        Functionary f = new Functionary("John", "john@example.com",1999.99, Position.TESTER);
        assertEquals(1699.99,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste8() {
        Functionary f = new Functionary("John", "john@example.com",2000.00, Position.TESTER);
        assertEquals(1500.00,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste9() {
        Functionary f = new Functionary("John", "john@example.com",2000.01, Position.TESTER);
        assertEquals(1500.01,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste10() {
        Functionary f = new Functionary("John", "john@example.com",4999.99, Position.MANAGER);
        assertEquals(3999.99,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste11() {
        Functionary f = new Functionary("John", "john@example.com",5000.00, Position.MANAGER);
        assertEquals(3500.00,Math.round(f.getNetSalary() * 100.0)/100.0);
    }
    @Test void CasoDeTeste12() {
        Functionary f = new Functionary("John", "john@example.com",5000.01, Position.MANAGER);
        assertEquals(3500.01,Math.round(f.getNetSalary() * 100.0)/100.0);
    }

}
