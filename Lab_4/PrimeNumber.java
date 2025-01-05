package Lab_4;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0;
        n=47;
        for (int i=2; i<n; i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(+n+" is a Prime Number");
        }else {
            System.out.println(+n+ " is not a Prime Number");
        }
    }
}
