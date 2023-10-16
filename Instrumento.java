
package com.mycompany.instrumento;

public class Instrumento {
    private String tiṕoInstrumento;
    public void tocarInstrumento(){
        System.out.println("Tocando instrumento.....");
    }
        
    static class guitarra extends Instrumento{
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

