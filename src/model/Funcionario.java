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
    public int getIDFuncionario() {return idFuncionario;}
    public String getNomeFuncionario(String nome){return nome;}
    public String getCpfFuncionario(){return cpf;}
    public String getSetorFuncionario(String setor){return setor;}

    //SETTERS
    public void setNomeFuncionario(String nome){
        this.nome = nome;
    }
    public void setCpfFuncionario(String cpf){
        if(cpf.trim().isEmpty()){
            System.out.println("O cpf nao pode ser negativo e nao pode conter espacos");
        }else {
        	this.cpf = cpf;
        }

    }
    public void setSetorFuncionario(String setor){
        if(setor == null || setor.trim().isEmpty()){
            System.out.println("O setor nao pode conter espacos e nao pode ser vazio!");
        }
        this.setor = setor;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +
                " | CPF: " + cpf +
                " | Setor: " + setor;
    }
}
