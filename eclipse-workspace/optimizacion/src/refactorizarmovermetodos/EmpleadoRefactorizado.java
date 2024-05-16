package refactorizarmovermetodos;

public class EmpleadoRefactorizado {
    private int horas;
    private int horasExtra;
    private TipoEmpleadoRefactorizado tipo;
    
    public EmpleadoRefactorizado(int horas, int horasExtra, TipoEmpleadoRefactorizado tipo) {
        this.horas = horas;
        this.horasExtra = horasExtra;
        this.tipo = tipo;
    }
    
    public double calculoHoras() {
        if (tipo.getTipo().equals("supervisor")) {
            return horas * tipo.getHoraBase() + horasExtra * tipo.getHoraBase() * 1.40;
        } else if (tipo.getTipo().equals("dependiente")) {
            return horas * tipo.getHoraBase() + horasExtra * tipo.getHoraBase() * 1.75;
        } else {
            return horas * tipo.getHoraBase() + horasExtra * tipo.getHoraBase() * 1.5;
        }
    }
    
    public double getSueldo() {
        return calculoHoras();
    }
}