public class DoubleItems {

    public static void main(String[] args) {

        int[] numList = {3, 4, 5, 6, 7};
        int[] output;

        output = new int[5];

        for (int i = 0; i < numList.length; i++) {
            int result = numList[i] * 2;
            output[i] = result;
            System.out.println("Multiplied element are: " + numList);
        }
    }
}
