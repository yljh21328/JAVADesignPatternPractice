package archive;

public class ZipStrategy implements ArchiveStrategy {

    @Override
    public void compress(String file) {
        System.out.println("壓縮 zip 檔: " + file);
    }

    @Override
    public void extract(String file) {
        System.out.println("解壓縮 zip 檔: " + file);
    }

}
