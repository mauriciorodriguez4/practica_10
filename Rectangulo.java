package practica_10.Ejercicio2;

/**
 *
 * @author MauriRod
 */
public class Rectangulo implements GeometricObject{
    
    private double ancho, largo;
    
    public Rectangulo(double _ancho, double _largo){
        this.ancho = _ancho;
        this.largo = _largo;
    }

    @Override
    public double getAre() {
        return Math.round(ancho*largo);
    }

    @Override
    public double getPerimetro() {
        return Math.round((2*ancho)+(2*largo));
    }
    
    @Override
    public String toString(){
        return "Rectangulo[ancho= " + ancho+ ", largo= "+ largo+ "]" ; 
    }
    
}
