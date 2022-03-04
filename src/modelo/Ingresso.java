package modelo;
import java.util.Random;

public class Ingresso {
   private String lugar;
   private String fila;
   private int codigo;
   private int nomeDoFilme;
   private double valor;
   
   public Ingresso(){
   }
   
   public Ingresso(String lugar, String fila, int codigo, int nomeDoFilme, double valor){
        this.lugar=lugar;
        this.fila=fila;
        this.codigo=codigo;
        this.nomeDoFilme=nomeDoFilme;
        this.valor=valor;
   }
    
   public String getLugar(){
        return lugar;
   }
   public void setLugar(String lugar){
        this.lugar=lugar;
   }
   public String getFila(){
        return fila;
   }
   public void setFila(String fila){
        this.fila=fila;
   }
   public int getCodigo(){
        return codigo;
   }
   public void setCodigo(int codigo){
        this.codigo=codigo;
   }
   public int getNomeDoFilme(){
        return nomeDoFilme;
   }
   public void setNomeDoFilme(int nomeDoFilme){
        this.nomeDoFilme=nomeDoFilme;
   }
   public double getValor(){
        return valor;
   }
   public void setValor(double valor){
        this.valor=valor;
   }
   
   public int gerarCodigo(){
       Random r1 = new Random();
       
       return r1.nextInt();
   }
   
   @Override
   public String toString(){
       String texto;
       switch(nomeDoFilme){
           case 1:
               texto="Batman Vs Superman - A Origem da Justiça";
               break;
           case 2:
               texto="Branca de Neve e os Sete Anões";
               break;
           case 3:
               texto="Capitão América - Guerra Civil";
               break;
           case 4:
               texto="Heróis da Galáxia - Ratchet e Clank";
               break;
           case 5:
               texto="Martyrs";
               break;
           case 6:
               texto="Mogli - O Menino Lobo";
               break;
           case 7:
               texto="No Mundo da Lua";
               break;
           case 8:
               texto="O Caçador e a Rainha do Gelo";
               break;
           case 9:
               texto="Prova de coragem";
               break;
           default:
               texto="Opção Inválida";
        }
       
       return "\n-------Nota Fiscal:-------"+
               "\nLugar: "+lugar+
               "\nFila: "+fila+
               "\nCodigo: "+codigo+
               "\nNome do Filme: "+texto+
               "\nValor: "+valor+
               "\n-------------------------";
   }
}