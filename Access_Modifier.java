public class Access_Modifier {
    public int publicVar = 10;
    private int privateVar = 20; 
    public void printVariables(){
        System.out.println("Public Variable : " + publicVar);
        System.out.println("Private Variable : " + privateVar);
        }
    public static void main(String[] args){
        Access_Modifier example = new Access_Modifier();
        example.printVariables();
    }
}
