package strategy1;

public class Archive {
    private String file;
    private String format;

    public Archive(String file, String format) {
        this.file = file;
        this.format = format;
    }

    public void compress() {
        switch (format) {
        case "zip":
            System.out.println("壓縮 zip 檔: " + file);
            break;
        case "rar":
            System.out.println("壓縮 rar 檔: " + file);
            break;
        default:
            System.out.println("壓縮格式不明 ");
        }

    }

    public void extract() {
        switch (format) {
        case "zip":
            System.out.println("解壓縮 zip 檔: " + file);
            break;
        case "rar":
            System.out.println("解壓縮 rar 檔: " + file);
            break;
        default:
            System.out.println("壓縮格式不明 ");
        }

    }
}
