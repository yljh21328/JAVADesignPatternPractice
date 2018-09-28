package bridge1;

import chef.AJ;
import chef.Chef;

public class Food {
    Chef chef;

    public Food() {
        // 聘請阿基師來煮菜
        this.chef = new AJ();
    }

    public void eggPie() {
        chef.saute("蛋餅");
    }

    public void friedRice() {
        chef.fry("飯");
    }

    public void instantNoodle() {
        chef.boil("泡麵");
    }
}
