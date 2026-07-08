package service;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import model.Funcionario;
import model.Uniforme;

public class FuncionarioService {
    ArrayList<Funcionario> funcionariosCadastrados = new ArrayList<>();
    Scanner sc = new Scanner (System.in);
    String nome;
    String cpf;
    String setor;

    public void cadastrarFuncionario(){
        Funcionario funcionarioNovo = new Funcionario();

        //NOME FUNCIONARIO
        while(true){
            System.out.println(" === CADASTRAR FUNCIONARIO ===");

            System.out.print("Digite o nome do funcionario: ");
            nome = sc.nextLine();

                if(!nome.isBlank()){
                	break;
                }
                System.out.print("O nome nao pode estar vazio e nem conter espacos em branco");
        }
        funcionarioNovo.setNomeFuncionario(nome);
        

        //CPF FUNCIONARIO
        while(true){
            System.out.print("Digite o cpf do funcionario: ");
            cpf = sc.nextLine();
                if(cpf.matches("\\d{11}")){
                    break;
                }
                System.out.println("O cpf deve conter 11 digitos numericos");
        }
        funcionarioNovo.setCpfFuncionario(cpf);
        

        //SETOR FUNCIONARIO
        while(true){
            System.out.println("Digite o setor do funcionario: ");
            String setor = sc.nextLine();

            if(!setor.isBlank()){
            	funcionarioNovo.setSetorFuncionario(setor);
                break;
            }
            System.out.println("O setor nao pode estar vazio e nem conter espacos em branco");
            
            System.out.print(setor);
        }

        funcionariosCadastrados.add((funcionarioNovo));
    }

    public void listarFuncionario(){
        for(Funcionario funcionario : funcionariosCadastrados){
        	System.out.println("============================================================================");
        	System.out.println(funcionario);
        	System.out.println("============================================================================");
        }
    }

    public void consultarFuncionario(){
        System.out.println("=== Buscar Funcionario ===");
        System.out.println("Digite o cpf do Funcionario: ");
        String cpf = sc.nextLine();

        for (Funcionario funcionario : funcionariosCadastrados)
            if (funcionario.getCpfFuncionario().equals(cpf)) {
                System.out.println(funcionario);
                System.out.println("Funcionario cadastrado " + funcionario);
                return;
            }
    }

    public void menuFuncionario(){

        while ( true)  {
            System.out.println("""
                1 - Cadastrar Funcionario
                2 - Buscar Funcionario
                3 - Listar Funcionario
                0 - Voltar ao Menu
                """);
            System.out.print("Opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

            	case 1:
                    cadastrarFuncionario();
                    break;

                case 2:
                    consultarFuncionario();
                    break;
                    
                case 3:
                    listarFuncionario();

                case 0:
                   return;
            }
        }

    }
}
