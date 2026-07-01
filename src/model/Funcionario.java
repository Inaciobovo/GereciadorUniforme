package model;

public class Funcionario {
    private static int contadorId = 0;

    private int idFuncionario;
    private String nome;
    private String cpf;
    private String setor;

    public Funcionario(){
        this.idFuncionario = ++contadorId;
    }

    //GETTERS
    public int getIDFuncionario() {return this.idFuncionario;}
    public String getNomeFuncionario(String nome){return this.nome;}
    public String getCpfFuncionario(){
        return this.cpf;
    }
    public String getSetorFuncionario(String setor){return this.setor;}

    //SETTERS
    public void setNomeFuncionario(){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("O nome nao pode conter espacoes e nao pode ser vazio");
        }
        this.nome = this.nome;
    }
    public void setCpfFuncionario(String cpf){
        if(cpf.trim().isEmpty()){
            System.out.println("O cpf nao pode ser negativo e nao pode conter espacos");
        }
        this.cpf = this.cpf;
    }
    public void setSetorFuncionario(String setor){
        if(setor == null || setor.trim().isEmpty()){
            System.out.println("O setor nao pode conter espacos e nao pode ser vazio!");
        }
        this.setor = this.setor;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +
                " | CPF: " + cpf +
                " | Setor: " + setor;
    }
}
