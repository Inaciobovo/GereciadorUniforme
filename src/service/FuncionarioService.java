package service;
import java.util.ArrayList;
import java.util.Scanner;
import model.Funcionario;

public class FuncionarioService {
    public void cadastrarFuncionario(){
        Funcionario funcionarioNovo = new Funcionario();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String nome;
        String cpf;
        String setor;

        //NOME FUNCIONARIO
        while(true){
            System.out.println(" === CADASTRAR FUNCIONARIO ===");

            System.out.println("Digite o nome do funcionario: ");
            nome = sc.nextLine();

                if(!nome.isBlank()){
                    break;
                }
                System.out.println("O nome nao pode estar vazio e nem conter espacos em branco");
        }
        funcionarioNovo.getNomeFuncionario(nome);

        //CPF FUNCIONARIO
        while(true){
            System.out.println("Digite o cpf do funcionario: ");
            cpf = sc.nextLine();
            cpf = cpf.replaceAll("\\D", "");  // REmOVE PONTOS E TRACOS

                if(cpf.length() != 11){
                    System.out.println("O cpf deve conter 11 digitos numericos");
                }
                break;
        }
        funcionarioNovo.setCpfFuncionario(cpf);

        //SETOR FUNCIONARIO
        while(true){
            System.out.println("Digite o setor do funcionario: ");
            setor = sc.nextLine();

            if(!setor.isBlank()){
                break;
            }
            System.out.println("O setor nao pode estar vazio e nem conter espacos em branco");
        }
        funcionarioNovo.getSetorFuncionario(setor);

        funcionarios.add((funcionarioNovo));
    }
}
