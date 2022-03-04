package modelo;
import java.util.ArrayList;

public class Cinema {
    private String nome;
    private ArrayList<Ingresso> lista = new ArrayList<>();

    public Cinema(){
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public ArrayList<Ingresso> getLista(){
        return lista;
    }
    public void setLista(ArrayList<Ingresso> lista){
        this.lista=lista;
    }
    
    public void adicionarIngresso(Ingresso i1){
        this.lista.add(i1);
    }
    public void verificarIngresso(){
        if(lista.isEmpty()){
            System.out.println("Não Há Ingressos Vendidos!");
        }else{
            for(int i=0; i<lista.size();i++){
                System.out.println("Ingresso: "+ i + "--->"+lista.get(i).getNomeDoFilme());
            }
        }
    }
    public void removerIngresso(int indice){
        this.lista.remove(indice);
    }
    public void limparLista(){
        this.lista.clear();
    }
    public int obterQuantidadeDeIngressos(){
        return this.lista.size();
    }
    public Ingresso pesquisarIngressoPorLugar(String lugar){
        Ingresso i2 = null;
        for(int i = 0; i <lista.size();i++){
            if(this.lista.get(i).getLugar().equals(lugar)){
                i2=this.lista.get(i);
            }
        }
        return i2;
    }
    public ArrayList<Ingresso> pesquisarIngressoPorFilme(int novoFilme){
        ArrayList<Ingresso> listaFilme = new ArrayList<Ingresso>();
            for(int i = 0; i<this.lista.size(); i++){
                if(this.lista.get(i).getNomeDoFilme() == novoFilme){
                    listaFilme.add(this.lista.get(i));
                }
            }
        return listaFilme;
    }

    public void alterarIngresso(Ingresso I, int indice){
        for(int i = 0; i<this.lista.size();i++){
            if(i == indice && !(this.lista.isEmpty())){
                removerIngresso(indice);
                this.lista.add(indice, I); 
            }
        }
    }

    @Override
    public String toString(){
        return ""+lista;
    }
}