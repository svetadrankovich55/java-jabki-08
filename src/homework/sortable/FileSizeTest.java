package homework.sortable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileSizeTest {
    @Test
    void testComparePositiveFileSize() {
        FileSize larger = new FileSize(2048);
        FileSize smaller = new FileSize(1024);
        assertTrue(larger.compare(smaller) > 0);
    }

    @Test
    void testCompareSameFileSize() {
        FileSize file1 = new FileSize(1024);
        FileSize file2 = new FileSize(1024);
        assertEquals(0, file1.compare(file2));
    }

    @Test
    void testCompareNegativeFileSize() {
        FileSize smaller = new FileSize(1024);
        FileSize larger = new FileSize(2048);
        assertTrue(smaller.compare(larger) < 0);
    }

    @Test
    void testCompareThrowsException() {
        FileSize fileSize = new FileSize(1024);
        Person person = new Person(25);
        assertThrows(IllegalArgumentException.class, () -> fileSize.compare(person));
    }
}
