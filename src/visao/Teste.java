package visao;
import modelo.Ingresso;
import java.util.Scanner;
import modelo.Cinema;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Cinema c1 = new Cinema();
        
        int opcao;
        do{
            System.out.println("------Cinemark Canoas---------");
            System.out.println("1. Adicionar Ingresso");
            System.out.println("2. Verificar Ingresso");
            System.out.println("3. Remover Ingresso");
            System.out.println("4. Limpar Ingressos");
            System.out.println("5. Obter Quantidade de Ingressos");
            System.out.println("6. Pesquisar Ingresso por Lugar");
            System.out.println("7. Pesquisar Ingresso por Filme");
            System.out.println("8. Alterar Ingresso");
            System.out.println("0. Sair");
            opcao = ler.nextInt();
        switch (opcao){
            case 1:
                Ingresso i1 = new Ingresso();
                    ler.nextLine();
                do{
                    System.out.println("Digite o Lugar Escolhido pelo Cliente: ");
                        i1.setLugar(ler.nextLine());
                    if(i1.getLugar().length() <1 && i1.getLugar().length() >2){
                        System.out.println("Lugar Inválido!");
                    }
                }while(i1.getLugar().length() <1 && i1.getLugar().length() >2);
                
                do{
                    System.out.println("Digite a Fila Escolhida pelo Cliente: ");
                        i1.setFila(ler.nextLine());
                    if(i1.getFila().length() <1 && i1.getFila().length() >1){
                        System.out.println("Fila Inválida!");
                    }
                }while(i1.getFila().length() <1 && i1.getFila().length() >1);
                
                do{
                    System.out.println("Digite o Filme Escolhido pelo Cliente: ");
                    System.out.println("1. Batman Vs Superman - A Origem da Justiça");
                    System.out.println("2. Branca de Neve e os Sete Anões");
                    System.out.println("3. Capitão América - Guerra Civil");
                    System.out.println("4. Heróis da Galáxia - Ratchet e Clank");
                    System.out.println("5. Martyrs");
                    System.out.println("6. Mogli - O Menino Lobo");
                    System.out.println("7. No Mundo da Lua");
                    System.out.println("8. O Caçador e a Rainha do Gelo");
                    System.out.println("9. Prova de coragem");
                        i1.setNomeDoFilme(ler.nextInt());
                    if(i1.getNomeDoFilme() <1 || i1.getNomeDoFilme() >9){
                        System.out.println("Opção Inválida!");
                    }
                }while(i1.getNomeDoFilme() <1 || i1.getNomeDoFilme() >9);
        
                do{
                    System.out.println("Digite o Valor do Ingresso: ");
                        i1.setValor(ler.nextDouble());
                    if(i1.getValor() <10 && i1.getValor() >30){
                        System.out.println("Valor Inválido!");
                    }
                }while(i1.getValor() <10 && i1.getValor() >30);
                
                System.out.println("Gerando Código...");
                int codigo = i1.gerarCodigo();
                System.out.println("Código do Ingresso: ");
                System.out.println("--->"+codigo+"<---");
                i1.setCodigo(codigo);
                
                c1.adicionarIngresso(i1);
                   System.out.println("Ingresso Comprado com Sucesso!"); 
                break;
            case 2:
                if(c1.getLista().isEmpty()){
                    System.out.println("Não Há Ingressos Vendidos!");
                }else{
                    System.out.println("----------Ingressos Vendidos:------------ ");
                    System.out.println(c1);
                }
                break;
            case 3:
                if(c1.getLista().isEmpty()){
                    System.out.println("Não Há Ingressos Vendidos!");
                }else{
                    c1.verificarIngresso();
                    System.out.println("Digite o Índice do Ingresso que Deseja Remover: ");
                    int indice = ler.nextInt();
                    c1.removerIngresso(indice);
                    System.out.println("Ingresso Removido Com Sucesso!");
                }
                break;
            case 4:
                if(c1.getLista().isEmpty()){
                    System.out.println("Não Há Ingressos Vendidos!");
                }else{
                    int confirma;
                    System.out.println("Digite \n 1. Sim \n 2. Não");
                    confirma = ler.nextInt();
                    if(confirma == 1){
                        c1.limparLista();
                        System.out.println("Registros Excluídos com Sucesso!");
                    }else{
                        System.out.println("Opção Cancelada!");
                    }
                }
                break;
            case 5:
                System.out.println("Obter Quantidade de Ingressos: "+c1.obterQuantidadeDeIngressos());
                break;
            case 6:
                System.out.println("Digite o Lugar do Ingresso: ");
                ler.nextLine();
                String lugar = ler.nextLine();
                Ingresso resultado = c1.pesquisarIngressoPorLugar(lugar);
                if(resultado == null){
                    System.out.println("Não Há Ingressos Vendidos Com Este lugar!");
                }else{
                    System.out.println(resultado);
                }
                break;
            case 7:
                System.out.println("Digite o Filme Escolhido: ");
                System.out.println("1. Batman Vs Superman - A Origem da Justiça");
                System.out.println("2. Branca de Neve e os Sete Anões");
                System.out.println("3. Capitão América - Guerra Civil");
                System.out.println("4. Heróis da Galáxia - Ratchet e Clank");
                System.out.println("5. Martyrs");
                System.out.println("6. Mogli - O Menino Lobo");
                System.out.println("7. No Mundo da Lua");
                System.out.println("8. O Caçador e a Rainha do Gelo");
                System.out.println("9. Prova de coragem");
                int nomeDoFilme = ler.nextInt();
                ArrayList<Ingresso> busca = c1.pesquisarIngressoPorFilme(nomeDoFilme);
                if(busca.isEmpty()){
                    System.out.println("Não Há Ingressos Vendidos Para Este Filme!");
                }else{
                    System.out.println(busca);
                }   
                break;
            case 8:
                if(c1.getLista().isEmpty()){
                    System.out.println("Não Há Ingressos Vendidos!");
                }else{
                    System.out.println("Digite o Índice do Ingresso que Deseja Alterar: ");
                    System.out.println("------------------------------------------------");
                    c1.verificarIngresso();
                    System.out.println("--->");
                    int indice = ler.nextInt();
                    
                    Ingresso I = new Ingresso(c1.getLista().get(indice).getLugar(),
                                              c1.getLista().get(indice).getFila(),
                                              c1.getLista().get(indice).getCodigo(),
                                              c1.getLista().get(indice).getNomeDoFilme(),
                                              c1.getLista().get(indice).getValor());
                    
                    System.out.println("Digite o Campo que Deseja Alterar: ");
                    System.out.println("1. Possivel Alterar 1 - Lugar: "+I.getLugar());
                    System.out.println("2. Possivel Alterar 2 - Fila: "+I.getFila());
                    System.out.println("3. Impossivel Alterar - Codigo: "+I.getCodigo());
                    System.out.println("4. Imossivel Alterar - Filme: "+I.getNomeDoFilme());
                    System.out.println("5. Impossivel Alterar - Valor: "+I.getValor());
                    System.out.println("0. Cancelar Alteração");
                    System.out.println("Opção --->");
                    int res = ler.nextInt();
                    
                    switch(res){
                        case 1:
                            System.out.println("Lugar Atual: "+I.getLugar());
                            System.out.println("Novo Lugar: ");
                            ler.nextLine();
                            I.setLugar(ler.nextLine());
                            c1.alterarIngresso(I, indice);
                            System.out.println("Lugar Alterado com Sucesso!");
                            break;
                        case 2:
                            System.out.println("Fila Atual: "+I.getFila());
                            System.out.println("Nova Fila: ");
                            ler.nextLine();
                            I.setFila(ler.nextLine());
                            c1.alterarIngresso(I, indice);
                            System.out.println("Fila Alterada com Sucesso!");
                            break;
                        case 0:
                            System.out.println("Alteração Cancelada!");
                            break;
                        default:
                            System.out.println("Opção Inválida!");
                           break;
                    }
                }        
                    break;
            case 0:
                System.out.println("Sistema Encerrado");
                break;
                
        }        
                
        }while(opcao != 0);                  
    }                        
}
