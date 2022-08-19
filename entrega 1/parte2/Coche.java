package coche;

public class Coche {
    private int cantPuertas;

    public Coche(int cantPuertas){

    this.cantPuertas=cantPuertas;
    }


    /*ESP:Suma 1 puerta
    ENG:Add 1 Door*/
    public void sumarPuerta(){
        this.cantPuertas++;
    }
    
    public void mostrarPuertas(){
        System.out.println(cantPuertas);
    }

    public static void main(String[] args){
        Coche autito = new Coche(3);
        autito.sumarPuerta();
        autito.mostrarPuertas();
    }

}
