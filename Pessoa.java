public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void ola(){
        System.out.println("Ola " + nome + " com " + idade + " anos de idade");
    }
}