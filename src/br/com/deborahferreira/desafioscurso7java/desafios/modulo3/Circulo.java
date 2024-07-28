package br.com.deborahferreira.desafioscurso7java.desafios.modulo3;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * 3.14;
    }

    @Override
    public String toString() {
        return "círculo";
    }
}
