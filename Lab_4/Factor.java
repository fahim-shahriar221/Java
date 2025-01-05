package Lab_4;

public class Factor {
    public static void main(String[] args) {
        int n=99;
        System.out.println("Factors of "+n+": ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
