public class Calculadora {
    public float imc(Pessoa pessoa){
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }
}