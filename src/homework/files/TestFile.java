package homework.files;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFile {

    @Test
    void testGetSizeWithMinimumValuesForImageFile() {
        ImageFile imageFile = new ImageFile("min.jpg", 1, 1, 1);
        assertEquals(1L, imageFile.getSize());
    }

    @Test
    void testGetSizeWithZeroValuesForImageFile() {
        ImageFile zeroWidth = new ImageFile("zero1.jpg", 0, 100, 3);
        ImageFile zeroHeight = new ImageFile("zero2.jpg", 100, 0, 3);
        ImageFile zeroBytes = new ImageFile("zero3.jpg", 100, 100, 0);
        assertEquals(0L, zeroWidth.getSize());
        assertEquals(0L, zeroHeight.getSize());
        assertEquals(0L, zeroBytes.getSize());
    }

    @Test
    void testCalculateTotalSizeWithImageFilesForImageFile() {
        File[] files = new File[] {
                new ImageFile("img1.jpg", 100, 100, 3),
                new ImageFile("img2.png", 200, 200, 4),
                new ImageFile("img3.bmp", 300, 300, 2)
        };
        long expectedSize = (100L*100*3) + (200L*200*4) + (300L*300*2);
        long actualSize = FileUtils.calculateTotalSize(files);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void testMixedFilesCalculation() {
        File[] mixedFiles = new File[]{
                new TextFile("notes.txt", "Important notes"),
                new ImageFile("photo.jpg", 800, 600, 3),
                new TextFile("readme.txt", "Please read carefully")
        };
        long expectedSize = 15L + (800 * 600 * 3) + 21L;
        long actualSize = FileUtils.calculateTotalSize(mixedFiles);
        assertEquals(expectedSize, actualSize);
    }
}