package model;
import java.math.BigDecimal;
public class Uniforme {
    private static int contadorId = 0;
    
    private int id;
    private String descricao;
    private String tamanho;
    private int quantidade;
    private BigDecimal valor;

    // Metodo construtor para o ID autoincrementado
    public Uniforme(){
        this.id = ++contadorId;
    }

    //getters
    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getTamanho(){
        return tamanho;
    }
    
    public int getQuantidade(){
        return quantidade;
    }

    public BigDecimal getValor(){
        return valor;
    }

    //setters

    public void setDescricao(String descricao){
        if(descricao.isEmpty()){
            System.out.println("O campo de descricao nao pode estar vazio!");
        }
        this.descricao = descricao;
    }

    public void setTamanho(String tamanho){
        if(tamanho.isEmpty()){
            System.out.println("O campo de tamanho nao pode estar vazio!");
        }
        this.tamanho = tamanho.toUpperCase();
    }
    
    public void setQuantidade(int quantidade){
        if(quantidade <0){
            System.out.println("A quantidade nao pode ser negativa!");
        }
        this.quantidade = quantidade;
    }

    public void setValor(BigDecimal valor){
        if(valor.compareTo(BigDecimal.ZERO) < 0){
            System.out.println("O valor do uniforme nao pode negativo");
        }
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Id: " + id+
        		" | Descricao: " + descricao +
                " | Tamanho: " + tamanho +
                " | Quantidade: " + quantidade +
                " | Valor Atual: " + valor.multiply(BigDecimal.valueOf(quantidade));
    }
}
