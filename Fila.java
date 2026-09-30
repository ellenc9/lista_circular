package model.estrutura;

public class Fila {
    private No<Pagina> P;
    private int total;
    
    public void Fila(){
        P = null;
        total = 0;
    }
    
    public void adicionar(Pagina pagina){
        No<Pagina> novo = new No<>(pagina);
        
        if(P == null){
            novo.setAnterior(novo);
            novo.setProximo(novo);
            P = novo;
        }else{
            No<Pagina> ultima = P.getAnterior();
            
            novo.setAnterior(ultima);
            novo.setProximo(P);
            
            P.setAnterior(novo);
            ultima.setProximo(novo);
        }
        total++;
    }
    
    public Pagina ler(){
        if(P == null)
            return null;
        
        Pagina pagina = P.getValor();
        if(P.getProximo() == P){
            P = null;
        }else{
            No<Pagina> anterior = P.getAnterior();
            No<Pagina> proximo = P.getProximo();
            
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            P = proximo;
        }
        total--;
        return pagina;
    }
    
    public int total(){
        return total;
    }
    
    public boolean vazia(){
        return P == null;
    }
}
