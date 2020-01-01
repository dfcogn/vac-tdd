import java.util.Arrays;

public class SortClass {
    int[] intArr;

    public SortClass(int lengthArr) {
        intArr = new int[lengthArr];
    }

    public int[] getSortedIntArr() {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random()*100);
        }

        Arrays.sort(intArr);
//        intArr[intArr.length - 1] = 1;
        return intArr;
    }
}
