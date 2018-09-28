package bridge3;

import chef.Chef;

public class FoodV2 extends Food {
    public FoodV2(Chef chef) {
        super(chef);
    }

    @Override
    public void instantNoodle() {
        chef.fry("泡麵"); // 改成做炒泡麵
    }

    public void meatBall() {
        chef.deepFry("肉圓");
    }
}
