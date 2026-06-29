package service;

//import dos ultilitario (Scanner, ArrayList)
import java.util.Scanner;
import model.Uniforme;
import java.util.ArrayList;

public class UniformeService {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Uniforme> estoqueUniforme = new ArrayList<>();

    public void cadastrarUniforme(){
        
        Uniforme uniformeNovo = new Uniforme();
        String descricao;
        String tamanho;
        int quantidade;
        Double valor;
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
                
               
        while(true){ 
            System.out.println("Tamanho do uniforme somente essas opcoes: (PP, P, M, G, GG, XG): ");
            tamanho = sc.nextLine();
            
                if(tamanho.isBlank()){
                    System.out.println("O Tamanho nao pode estar vazio");
                }else if (tamanho.matches("PP | P | M | G | GG | XG")){
                    break;
                }else{
                  System.out.println("Tamanho invalido! Por Favor, digite apenas PP, P, M, G, GG, XG");
                }
        }    
        uniformeNovo.setTamanho(tamanho);

         
        while (true) {
            System.out.println("Quantidade do uniforme: ");
            quantidade = sc.nextInt();
            sc.nextLine();
                if(quantidade > 2){
                    break;
                }
                System.out.println("Quantidade nao pode ser menor que 3");
        }
        uniformeNovo.setQuantidade(quantidade);

         while (true) {
            System.out.println("Valor do uniforme: ");
            valor = sc.nextDouble();
            sc.nextLine();
                if(valor > 0){
                    break;
                }
                System.out.println("O Valor nao pode ser negativo");
        }
        uniformeNovo.setValor(valor);

        estoqueUniforme.add(uniformeNovo);
    }

    public void listarUniformes(){
        for(Uniforme uniforme : estoqueUniforme){
            System.out.println(uniforme);
        }
    }

    public void consltarUniforme(){
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
}
