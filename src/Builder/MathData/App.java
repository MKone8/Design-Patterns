package Builder.MathData;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MathData mathData = new MathDataBuilder().withVarA(1).withVarB(3).build();
        System.out.println(mathData.getVarA());
        System.out.println(mathData.getVarB());
        
        
    }
}
