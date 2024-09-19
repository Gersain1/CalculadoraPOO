package paquete;

public class Calculadora {

    //Atributos
    private int operando1;
    private int operando2;

    //Constructores
    public Calculadora(){

    }
    public Calculadora(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Metodos de las operaciones basicas
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }

    public int restar() {
        int resta = this.operando1 - this.operando2;
        return resta;
    }

    public int multiplicar() {
        int mumtiplicacion = this.operando1 * this.operando2;
        return mumtiplicacion;
    }

    public double dividir(){
        double division = (double)this.operando1 / (double)this.operando2;
        return division;
    }

}
