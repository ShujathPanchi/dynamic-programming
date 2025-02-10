public class SimpleIfElse {
    public String checkIfElse(int N){
        if(!( N % 2 == 0)){
            System.out.println("The number you entered "+N + " is Weird");
        } else if( N >=2 && N <=5){
            System.out.println("The number you entered "+N + " is Not Weird");
        } else if( N >= 6 && N <=20){
            System.out.println("The number you entered "+N + " is Weird");
        } else if( N > 20){
            System.out.println("The number you entered "+N + " is Not Weird");
        }
        return "";
    }
}
