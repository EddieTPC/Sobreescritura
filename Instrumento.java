
package com.mycompany.instrumento;

public class Instrumento {
    private String tiṕoInstrumento;
    public void tocarInstrumento(){
        System.out.println("Tocando instrumento.....");
    }
        
    static class guitarra extends Instrumento{
        /*La anotación @Override simplemente se utiliza, para forzar al compilador a 
        comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método,
        y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar. */
        @Override         
        public void tocarInstrumento() {
        System.out.println("Tocar La Guitarra");
        }
    }
    
    public static void main(String[] args) {
        Instrumento nuevaGuitarra= new guitarra();
        
        nuevaGuitarra.tocarInstrumento();
    }
}

