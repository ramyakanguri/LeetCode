package ProblemSolving;

public class Test {

    public static boolean check(){
        int x = 5;
        for(int i=0; i<=x; i++){
            if(i == x)
                return true;
        }
        return false;
    }

    public static void main(String []args){
        boolean res = check();
        System.out.println("   result :   ");
        System.out.println(res);
    }
    
}
