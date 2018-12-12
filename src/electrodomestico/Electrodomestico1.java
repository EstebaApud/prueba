package electrodomestico;

public class Electrodomestico1 { // Inicializo variables

    
    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    //Constructor por defecto
    public Electrodomestico1() {

        color = "blanco";
        consumoEnergetico = 'f';
        precioBase = 100;
        peso = 5;
    }
    //Constructor con parametros para precio base y peso
    public Electrodomestico1(int precio, float peso) {

        this.precioBase = precio;
        this.peso = peso;
        this.color="blanco";
        this.consumoEnergetico='F';
    }
    
    //Constructor con parametros
    public Electrodomestico1(int precio, float peso, String color, char consumo) {
         
        this.precioBase = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumo;
    }
    
    // Metodo para comprobar el tipo de consumo energetico del electrodomestico. Si el valor ingresado no es valido, el tipo de consumo energetico sera por defecto f
    public void ComprobarConsumo(char letra){
       char nom[]= {'a','b','c','d','e','f'};
       consumoEnergetico = letra;
       
       for(int i=0; i<5; i++){
           
           if (nom[i]==consumoEnergetico){
               
               System.out.println("Tipo de consumo: " + consumoEnergetico);
           } else {
               System.out.println("Tipo de consumo: " + consumoEnergetico + "No valido");
               System.out.println("Se usara el tipo de consumo por defecto: F");
               this.consumoEnergetico = 'f';
           }
           
       }
         
    }
    
    //Metodo para comprobrar si se ingreso un color. De lo contrario por defecto, será blanco
    public void ComprobarColor(String color){
        this.color = color;
        if(!"".equals(this.color)){
            System.out.println("Color: " + this.color);
        } else {
            System.out.println("Colo por defecto: Blanco" );
            this.color = "blanco";
        }
    }
    
    //Metodo que calcula el precio final, segun el consumo energetico.
    public void PrecioFinal(int precioBase){
        ComprobarConsumo(consumoEnergetico);
        this.precioBase = precioBase;
        
        switch(consumoEnergetico){
            
            case 'a': this.precioBase += 100;
            case 'b': this.precioBase += 80;
            case 'c': this.precioBase += 60;
            case 'd': this.precioBase += 50;
            case 'e': this.precioBase += 30;
            case 'f': this.precioBase += 10;
        }
        
        
    }

    
    //METODOS GETTER y SETTER
    
    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
