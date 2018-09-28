package chef;

public class AJ implements Chef {
    public AJ() {
    }

    public void saute(String dish) {
        System.out.println("阿基師煎" + dish);
    }

    public void fry(String dish) {
        System.out.println("阿基師炒" + dish);
    }

    public void boil(String dish) {
        System.out.println("阿基師煮" + dish);
    }

    public void deepFry(String dish) {
        System.out.println("阿基師炸" + dish);
    }
}
