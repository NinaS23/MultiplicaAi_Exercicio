public class App {
    public static void main(String[] args)  {
       int num = 7;
       System.out.println("Tabela de multiplicação de" + num);

       for (int i = 1; i <= 10; i++) {
        int result = num * i;
        System.out.println(num + " x " + i + " = " + (result));
    }
    }
}
