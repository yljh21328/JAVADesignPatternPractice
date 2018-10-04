package archive;

public interface ArchiveStrategy {
    public abstract void compress(String file);

    public abstract void extract(String file);
}
