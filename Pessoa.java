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
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
