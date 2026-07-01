package service;
import java.util.Scanner;

public class MenuService {
    Scanner sc = new Scanner(System.in);
    public void menuPrincipal(){
            System.out.println("=== GERENCIADOR DE UNIFORME ===");
            System.out.print("""
            1 - Uniforme
            2 - Funcionarios
            3 - Estoque
            0 - Sair
            """);
            int opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        UniformeService novoService = new UniformeService();
                        novoService.menuUniforme();
                        break;
                    case 2:
                        System.out.println("EM DESENVOLVIMENTO");
                        break;
                    case 3:
                        System.out.println("EM DESENVOLVIMENTO");
                        break;
                    case 0:
                        return;
                }
        }
        
}
