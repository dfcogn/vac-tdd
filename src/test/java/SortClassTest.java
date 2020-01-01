import org.junit.Test;

import static org.junit.Assert.*;

public class SortClassTest {
    @Test
    public void checkSort(){
        SortClass sortClass = new SortClass(100);
        int[] sortedIntArr = sortClass.getSortedIntArr();
        int prevInt = 0;

        for (int i = 0; i < sortedIntArr.length; i++) {
//            System.out.println("prevInt " + prevInt + " equal || not bigger than sortedIntArr[i] " +sortedIntArr[i]);
            assertTrue(sortedIntArr[i] >= prevInt);
            prevInt = sortedIntArr[i];
        }
    }
}