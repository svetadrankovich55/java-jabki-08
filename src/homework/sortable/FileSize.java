package homework.sortable;

public class FileSize implements Sortable {
    private final long size;

    public FileSize(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    @Override
    public int compare(Sortable other) {
        if (other instanceof FileSize) {
            FileSize otherFileSize = (FileSize) other;
            return Long.compare(this.size, otherFileSize.size);
        } else {
            throw new IllegalArgumentException("Не сравниваемые объекты " + other.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "FileSize(size = " + size + ")";
    }
}