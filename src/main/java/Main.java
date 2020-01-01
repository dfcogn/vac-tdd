public class Main {
    public static void main(String[] args) {
        SortClass sort = new SortClass(10);

        int[] sortedIntArr = sort.getSortedIntArr();

        for (int i = 0; i < sortedIntArr.length; i++) {
            System.out.println(sortedIntArr[i]);
        }

    }
}
