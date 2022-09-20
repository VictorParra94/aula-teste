import Pessoa.java;

class Teste {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Kleber", 36);
        pessoa.ola();
        
        pessoa.setNome("Victor");
        pessoa.setIdade(28);
        pessoa.ola();

        Calculadora calc = new Calculadora();
        float imc = calc.imc(pessoa);
        System.out.println("IMC: " + imc);
    }
}
