package strategy2;

import archive.ArchiveStrategy;

public class Archive {
    private String file;
    private ArchiveStrategy strategy;

    public Archive(String file, ArchiveStrategy strategy) {
        this.file = file;
        this.strategy = strategy;
    }

    public void compress() {
        strategy.compress(file);
    }

    public void extract() {
        strategy.extract(file);
    }
}
