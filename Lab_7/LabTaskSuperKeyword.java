package Lab_7;
class University1{
    String name;
    University1(String name){
        this.name=name;
        System.out.println("University name: "+this.name);
    }
}
class College1 extends University1{
    College1(String name){
        super("Daffodil International University");
        this.name=name;
        System.out.println("College name: "+this.name);
    }
}
public class LabTaskSuperKeyword {
    public static void main(String[] args) {
        College1 c=new College1("Cantonment Public School and College.");
    }
}