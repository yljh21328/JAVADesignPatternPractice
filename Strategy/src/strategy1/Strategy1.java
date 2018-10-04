package strategy1;

public class Strategy1 {

    public static void main(String[] args) {
        Archive file1 = new Archive("file1.rar", "rar");
        file1.compress();
        file1.extract();
        Archive file2 = new Archive("file2.zip", "zip");
        file2.compress();
        file2.extract();
    }

}
