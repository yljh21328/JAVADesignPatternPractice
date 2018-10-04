package strategy2;

import archive.RarStrategy;
import archive.ZipStrategy;
import strategy2.Archive;

public class Strategy2 {

    public static void main(String[] args) {
        Archive file1 = new Archive("file1.rar", new RarStrategy());
        file1.compress();
        file1.extract();
        Archive file2 = new Archive("file2.zip", new ZipStrategy());
        file2.compress();
        file2.extract();
    }

}
