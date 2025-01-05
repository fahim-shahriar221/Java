package Lab_7;
class Defence {
    public void Purpose() {
        System.out.println("To protect the country.");
    }
}
class Navy extends Defence {
    public void Purpose() {
        System.out.println("To protect the nation's waters");
    }
}
class AirForce extends Defence {
    public void Purpose() {
        System.out.println("To defend the country from aerial threats.");
    }
}
class Army extends Defence {
    public void Purpose() {
        System.out.println("To protect the land borders");
    }
}
public class Main {
    public static void main(String[] args) {
        Defence navy = new Navy();
        Defence airForce = new AirForce();
        Defence army = new Army();

        navy.Purpose();
        airForce.Purpose();
        army.Purpose();
    }
}