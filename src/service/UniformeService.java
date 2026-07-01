package service;

//import dos ultilitario (Scanner, ArrayList)
import java.util.Scanner;
import model.Uniforme;
import java.util.ArrayList;
import service.MenuService;

public class UniformeService {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Uniforme> estoqueUniforme = new ArrayList<>();

    public void cadastrarUniforme(){
        
        Uniforme uniformeNovo = new Uniforme();
        String descricao;
        String tamanho;
        int quantidade;
        Double valor;

        //DESCRICAO
        while(true){
            
            System.out.println("=== CADASTRAR UNIFORME ===");

            System.out.println("Descricao do uniforme: ");
            descricao = sc.nextLine();
                if(!descricao.isBlank()){
                    break;
                }
                System.out.println("A descricao nao pode estar vazia");
        }
        uniformeNovo.setDescricao(descricao);
                
        //TAMANHO
        while(true){ 
            System.out.println("Tamanho do uniforme somente essas opcoes: (PP, P, M, G, GG, XG): ");
            tamanho = sc.nextLine();
            tamanho = tamanho.toUpperCase();
            
                if(tamanho.isBlank()){
                    System.out.println("O Tamanho nao pode estar vazio");
                }else if (tamanho.matches("PP|P|M|G|GG|XG")){
                    break;
                }else{
                  System.out.println("Tamanho invalido! Por Favor, digite apenas PP, P, M, G, GG, XG");
                }
        }    
        uniformeNovo.setTamanho(tamanho);

        //QUANTIDADE
        while (true) {
            System.out.println("Quantidade do uniforme: ");
            try{
                quantidade = Integer.parseInt(sc.nextLine());

                if(quantidade >= 3){
                    break;
                }

                System.out.println("A quantidade mínima é 3.");
        }catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros!");
                }
            }
        uniformeNovo.setQuantidade(quantidade);

        // VALOR
         while (true) {
            System.out.println("Valor do uniforme: ");


            try{
                valor = Double.parseDouble(sc.nextLine());

                if(valor > 0){
                    break;
                }
                System.out.println("O Valor deve ser maior que zero");
            } catch(NumberFormatException e) {
                System.out.println("Digite um valor valido!");
            }
        }
        uniformeNovo.setValor(valor);

        estoqueUniforme.add(uniformeNovo);
    }

    public void listarUniformes(){
        for(Uniforme uniforme : estoqueUniforme){
            System.out.println(uniforme);
        }
    }

    public void consultarUniforme(){
        System.out.println("=== Buscar Uniforme ===");
        System.out.println("Digite o codigo do Uniforme: ");
        int id = sc.nextInt();
        sc.nextLine();
            
            for(Uniforme uniforme :estoqueUniforme){
                if(uniforme.getId() == id ){
                    System.out.println(uniforme);
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
        MenuService menu = new MenuService();

        while ( true)  {
            System.out.println("""
                1 - Cadastrar Uniforme
                2 - Buscar Uniforme
                3 - Listar Uniformes
                0 - Voltar ao Menu
                """);
                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarUniforme();

                        menu.menuPrincipal();

                    case 2:
                        consultarUniforme();

                        menu.menuPrincipal();
                    case 3: 
                        listarUniformes();

                        menu.menuPrincipal();

                    
                    case 0:
                        menu.menuPrincipal();
                        return;
                }
        }
        
    }


}
