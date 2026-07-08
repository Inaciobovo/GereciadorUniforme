package service;
import java.util.Scanner;

public class MenuService {
    Scanner sc = new Scanner(System.in);
    private UniformeService uniformeService = new UniformeService();
    private FuncionarioService funcionarioService = new FuncionarioService();
    
    
    public void menuPrincipal(){        
    	
    	while(true) {
    		  
    		System.out.println("""
                      === GERENCIADOR ===
                      1 - Uniformes
                      2 - Funcionários
                      0 - Sair
                      """);
    		System.out.print("opcao: ");
    		System.out.print("");
    		
            int opcao = sc.nextInt();
            
            switch (opcao) {
                    
            	case 1:
            		System.out.println("============================================================================");
            		uniformeService.menuUniforme();
            		break;
                
            	case 2:
            		funcionarioService.menuFuncionario();
            		break;
            
            	case 0:
                        return;
                }
        }
        
    }
}
