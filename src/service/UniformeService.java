package service;
import java.util.Scanner;
import model.Uniforme;
import java.util.ArrayList;
import java.math.BigDecimal;


public class UniformeService {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Uniforme> estoqueUniforme = new ArrayList<>();

    public void cadastrarUniforme(){
        
        Uniforme uniformeNovo = new Uniforme();
        String descricao;
        String tamanho;
        int quantidade;
        BigDecimal valor;

        //DESCRICAO
        while(true){
        	System.out.println("");
        	System.out.println("============================================================================");
            System.out.println("----- CADASTRAR UNIFORME -----");

            System.out.print("Descricao do uniforme: ");
            descricao = sc.nextLine();
                if(!descricao.isBlank()){
                    break;
                }
                System.out.println("A descricao nao pode estar vazia");
        }
        uniformeNovo.setDescricao(descricao);
                
        //TAMANHO
        while(true){ 
            System.out.print("Tamanho do uniforme somente essas opcoes: (PP, P, M, G, GG, XG): ");
            tamanho = sc.nextLine();
            tamanho = tamanho.toUpperCase();
            
                if(tamanho.isBlank()){
                    System.out.print("O Tamanho nao pode estar vazio");
                }else if (tamanho.matches("PP|P|M|G|GG|XG")){
                    break;
                }else{
                  System.out.print("Tamanho invalido! Por Favor, digite apenas PP, P, M, G, GG, XG");
                }
        }    
        uniformeNovo.setTamanho(tamanho);

        //QUANTIDADE
        while (true) {
            System.out.print("Quantidade do uniforme: ");
            try{
                quantidade = Integer.parseInt(sc.nextLine());

                if(quantidade >= 3){
                    break;
                }

                System.out.print("A quantidade mínima é 3.");
        }catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros!");
                }
            }
        uniformeNovo.setQuantidade(quantidade);

        // VALOR
         while (true) {
            System.out.print("Valor do uniforme: ");


            try{
                valor = new BigDecimal(sc.nextLine().replace(",", "."));
                
                if(valor.compareTo(BigDecimal.ZERO)> 0){
                    break;
                }
                System.out.print("O Valor deve ser maior que zero");
            } catch(NumberFormatException e) {
                System.out.print("Digite um valor valido!");
                
            }
        }
        System.out.println("============================================================================"); 
        System.out.print("");
        uniformeNovo.setValor(valor);

        estoqueUniforme.add(uniformeNovo);
    }

    public void listarUniformes(){
        for(Uniforme uniforme : estoqueUniforme){
        	System.out.println("====================================================================================");
        	System.out.println(uniforme);
        	System.out.println("====================================================================================");
        	System.out.print("");
        }
    }

    public void consultarUniforme(){
        System.out.println("=== Buscar Uniforme ===");
        System.out.println("Digite o codigo do Uniforme: ");
        int id = sc.nextInt();
        sc.nextLine();
            
            for(Uniforme uniforme :estoqueUniforme){
                if(uniforme.getId() == id ){
                	System.out.println("============================================================================");
                    System.out.println(uniforme);
                    System.out.println("============================================================================");
                    System.out.print("");
                }
            }
    }

    public void removerUniforme() {
            System.out.print("Digite o código do uniforme: ");
            int id = Integer.parseInt(sc.nextLine());

            for (int i=0; i < estoqueUniforme.size(); i++){
                Uniforme uniforme = estoqueUniforme.get(i);

                if(uniforme.getId() == id){
                    estoqueUniforme.remove(i);
                    break;
                }
        }
    }

    public void menuUniforme(){

        while ( true)  {
            System.out.println("""
                1 - Cadastrar Uniforme
                2 - Buscar Uniforme
                3 - Listar Uniformes
                0 - Voltar ao Menu
                """);
            	
            	System.out.print("Opcao: ");
                int opcao = sc.nextInt();
               
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarUniforme();
                        break;

                    case 2:
                        consultarUniforme();
                        break;
                        
                    case 3: 
                        listarUniformes();
                        break;
                        
                    case 0:
                    	return;                         
                }
        }
        
    }


}
