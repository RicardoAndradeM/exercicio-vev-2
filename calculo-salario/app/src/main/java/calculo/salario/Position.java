package calculo.salario;

public enum Position {
	DEV("DESENVOLVEDOR"),
    TESTER("TESTADOR"),
    MANAGER("GERENTE"),
    DBA("DBA");

    private final String position;

    private Position(String position) {
        this.position = position;
    }

    public String getPositionName() {
        return this.position;
    }
}
