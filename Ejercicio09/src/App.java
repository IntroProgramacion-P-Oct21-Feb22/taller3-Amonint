public class App {
    public static void main(String[] args) throws Exception {
        int var1= 81;
        int var2= 25;
        int var3= 10;
        int var4= 50;
        
        double resultado = Math.sqrt(var1)+ Math.sqrt(var2)*(var3);
        boolean comparador = resultado >= var4;
        System.out.print(comparador);
    }
}
