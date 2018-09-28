package bridge2;

import chef.Chef;
import chef.James;

public class Food {
    Chef chef;

    public Food() {
        // 換詹姆士來主菜
        // 換一個廚師來煮菜就要修改原本聘請廚師的邏輯
        this.chef = new James();
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
