import static org.junit.Assert.*;
import java.util.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
    @Test
    void longestStartsWithTest(){
        Set<String> words = new HashSet<>();
        words.add("abc");
        words.add("xyz");
        words.add("abcd");

        String actual = Practice.longestStartsWith(words, 'a');

        assertEquals("abcd", actual);
    }

    @Test
    void longerAndShorterTest(){
        List<String> words = new ArrayList<>();
        words.add("1");
        words.add("11");
        words.add("111");
        words.add("1111");
        words.add("11111");

        int actual = Practice.longerAndShorter(1, 4, words);

        assertEquals(2, actual);
    }

    @Test
    void diffOddEvenTest(){
        Map<Integer, Integer> nums = new HashMap<>();
        nums.put(0,1);
        nums.put(1,2);
        nums.put(2,3);

        int actual = Practice.diffOddEven(nums);

        assertEquals(1, actual);
    }

    @Test
    void secondLargestTest(){
        Map<Integer, Integer> nums = new HashMap<>();
        nums.put(1,1);
        nums.put(2,2);
        nums.put(4,3);
        nums.put(3,4);
        nums.put(30,5);

        int actual = Practice.secondLargest(nums);

        assertEquals(4, actual);
    }
    
}


