package es.cic.curso.ejerc004;

public class Reloj {
    
    private Calculadora calculadora;

    public int calcularMinutoDelDia(int hora, int minuto) {
        int minutosHora = calculadora.multiplicar(hora, 60);
        int minutoDelDia = calculadora.sumar(minuto, minutosHora);
        return minutoDelDia;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
