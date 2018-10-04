package archive;

public class RarStrategy implements ArchiveStrategy {

    @Override
    public void compress(String file) {
        System.out.println("壓縮 rar 檔: " + file);
    }

    @Override
    public void extract(String file) {
        System.out.println("解壓縮 rar 檔: " + file);
    }

}
