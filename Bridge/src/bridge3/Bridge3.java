package bridge3;

import chef.AJ;
import chef.James;

public class Bridge3 {

    public static void main(String[] args) {
        // 呼叫的人決定要請阿基師
        Food food1 = new Food(new AJ());
        food1.eggPie();
        food1.friedRice();
        food1.instantNoodle();
        // 呼叫的人決定要請詹姆士
        Food food2 = new Food(new James());
        food2.eggPie();
        food2.friedRice();
        food2.instantNoodle();

        FoodV2 food3 = new FoodV2(new James());
        food3.instantNoodle(); // 改成用炒的做法
        food3.meatBall();
    }

}
