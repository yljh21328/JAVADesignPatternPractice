package chef;

public class James implements Chef {
    public James() {
    }

    public void saute(String dish) {
        System.out.println("詹姆士煎" + dish);
    }

    public void fry(String dish) {
        System.out.println("詹姆士炒" + dish);
    }

    public void boil(String dish) {
        System.out.println("詹姆士煮" + dish);
    }

    public void deepFry(String dish) {
        System.out.println("詹姆士炸" + dish);
    }
}
