package bridge3;

import chef.Chef;

public class Food {
    Chef chef;

    public Food(Chef chef) {
        // 聘請一個廚師來煮菜, 誰煮不重要。
        this.chef = chef;
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
