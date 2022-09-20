public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, float peso, float alura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void ola(){
        System.out.println("Ola " + nome + " com " + idade + " anos de idade");
    }

    public float getPeso(){
        return this.peso;
    }

    public float getAltura(){
        return this.altura;
    }
}