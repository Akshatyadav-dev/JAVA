public class Static_Keyword {
    public static int staticVar = 10;
    
    public static void printStaticVariable(){
        System.out.println("Static Variable : "  + staticVar);
    }
    public static void main(String[] args) {
        Static_Keyword.printStaticVariable();
    }
}
