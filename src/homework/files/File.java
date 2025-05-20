package homework.files;

public abstract class File {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    public abstract long getSize();

}