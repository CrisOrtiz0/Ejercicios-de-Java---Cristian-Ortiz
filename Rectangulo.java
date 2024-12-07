package Objetos;
import daw.com.*;

public class Rectangulo {
        
    private int base;
    private int altura;
    private int color;
    private Punto centro;
        
    public Rectangulo (){
        this.base = 0;
        this.altura = 0;
        this.color = 0;
        this.centro = new Punto ();

    }
        
    public Rectangulo (int base, int altura, int color, Punto centro) {
        this.base = base;
        this.altura = altura;
        this.color = color;
        this.centro = centro;

    }
        
    public Rectangulo (Rectangulo rectangulo){
        this.base = rectangulo.base;
        this.altura = rectangulo.altura;
        this.color = rectangulo.color;
        this.centro = rectangulo.centro;

    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public float area ()
    {
        return (float)base*altura;
    }
    
    public void mostrarDatos()
    {
        centro.mostrarDatos();
        Pantalla.escribirString("Base :" +base);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Altura :" +altura);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Color :" +color);
        Pantalla.escribirSaltoLinea();
        
    }
    
    public void cambiarDatos() {
        
    	Pantalla.escribirString("Introduzca los nuevos datos del Rectángulo:");
        Pantalla.escribirSaltoLinea();
        
        
        //Creo que ya se cúal era el "aquel" del trabajo, y es interesante que haya tocado leer tanta documentacion de Java para obtener esto .-.
        
        
        String newX = Teclado.leerString("Ingrese el nuevo valor para la coordenada X:");
        if (newX.length() > 0) {
            centro.setX(Integer.valueOf(newX));
        }
        
        String newY = Teclado.leerString("Ingrese el nuevo valor para la coordenada Y:");
        if (newY.length() > 0) {
            centro.setY(Integer.valueOf(newY));
        }
        
        String newBase = Teclado.leerString("Ingrese el nuevo valor para la Base: ");
        if (newBase.length() > 0) {
            base = Integer.valueOf(newBase);
        }

        String newAltura = Teclado.leerString("Ingrese el nuevo valor para la altura: ");
        if (newAltura.length() > 0) {
            altura = Integer.valueOf(newAltura);
        }

        String newColor = Teclado.leerString("Ingrese el nuevo valor para el Color: ");
        if (newColor.length() > 0) {
            color = Integer.valueOf(newColor);
        }
        
        
        Pantalla.escribirString("Datos actualizados:");
        mostrarDatos();
        
    
    }

}