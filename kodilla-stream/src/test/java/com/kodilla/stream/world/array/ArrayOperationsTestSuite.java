package com.kodilla.stream.world.array;
import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;
public class ArrayOperationsTestSuite {
    @Test
   public void testGetAverage(){
        //Given
        int[] numbers = {1, 1, 1, 1, 2, 7, 9};
        //When
        double averageOne = ArrayOperations.getAverage(numbers);
        //then
        double averageTwo = 3.14;
        Assert.assertEquals(averageOne,averageTwo,2);
    }
}
