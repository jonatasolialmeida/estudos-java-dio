package variaveis2;
public class App {
    public static void main(String[] args) throws Exception {
        // tipos de dados
        // int, byte, short, long, float, double, boolean e char

        // tipo      memoria        valor minimo        valor max
        // byte      1 byte         -128                127
        // short     2 bytes        -32.768             32.768
        // int       4 bytes        -2.147.483.648
        // long      8 bytes        -9.223.372.036.854.775.808

        // float     4 bytes        -3,4028E + 38
        // double    8 bytes        -1,7976E +308

        // declaração de variáveis
        // <tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
        // int    idade         =  15;
        // ou
        // int    idade;

        byte idade = 123;
        short ano = 2021;
        int cep = 21547888;
        long cpf = 98765432187L;
        float pi = 3.14F;
        double salario = 1275.33;

        // cuidado com a tipagem

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // aqui utilizamos os cast que converte um tipo em outro
        // por causa do tamnho do número armazenado 
        // ele aponta que possívelmentehaverá um erro no futuro dependendo do que pode ser armazenado na variável
        // por isso convertemos
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("Hello, World!");
    }
}
