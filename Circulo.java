package practica_10.Ejercicio2;

/**
 *
 * @author MauriRod
 */
public class Circulo implements GeometricObject {
    
    private double radio;
    
    public Circulo(double _radio){
        
        this.radio= _radio;
    }

    @Override
    public double getAre() {
        return Math.round((Math.PI*Math.pow(radio, 2)));
    }

    @Override
    public double getPerimetro() {
        return Math.round((Math.PI*2*radio));
    }
    
    @Override
    public String toString(){
        return "Circulo [radio= " + radio + "]" ;
    }
    
}
