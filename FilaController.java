package controller;

import model.estrutura.Fila;
import model.estrutura.Pagina;

public class FilaController {
    private Fila fila = new Fila();

    public void teste(){
        for(int i = 1; i <= 5; i++){
            Pagina pagina = new Pagina(String.valueOf(i));
            fila.adicionar(pagina);
            System.out.println("adicionar "+i+" total= "+fila.total());
        }
        
        for(int i = 0; i <3; i++){
            Pagina pagina = fila.ler();
            System.out.println("ler -> id = "+pagina.getId()+" total= "+fila.total());
        }
        
        for(int i = 6; i <=7; i++){
            Pagina pagina = new Pagina(String.valueOf(i));
            fila.adicionar(pagina);
            
            System.out.println("adicionar "+i+" total= "+fila.total());
        }
        
        while(!fila.vazia()){
            Pagina pagina = fila.ler();
            
            System.out.println("ler -> id "+pagina.getId()+" total= "+fila.total());
        }
        
        Pagina pagina = fila.ler();
        if(pagina == null){
            System.out.println("ler -> null total= 0");
        }else{
            System.out.println("ler -> "+pagina.getId()+" total= "+fila.total());
        }
    }
}
