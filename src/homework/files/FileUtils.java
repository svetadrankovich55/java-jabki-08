package homework.files;

public class FileUtils {

    public static long calculateTotalSize(File[] files) {
        long totalSize = 0;

        for (File file : files) {
            if (file != null) {
                totalSize += file.getSize();
            }
        }
        return totalSize;
    }
}