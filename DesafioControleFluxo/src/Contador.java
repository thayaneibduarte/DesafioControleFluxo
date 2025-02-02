import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
           throw new ParametrosInvalidosException();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroUm - parametroDois;
            for (int calculo = 0; calculo < contagem; calculo++) {
                System.out.println(calculo);
            }
        }
    }
}