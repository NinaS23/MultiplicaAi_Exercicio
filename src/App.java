public class App {
    public static void main(String[] args)  {
        int num = 23;
        System.out.println("Tabela de multiplicação de" + num);

        for(int i = 0; i < 11; i++){
           int calc = num * i;
           System.out.println(num + " * " + i + " = " + calc );
        }
    }
}
