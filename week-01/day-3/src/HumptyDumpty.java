public class HumptyDumpty {

    public static void main(String[] args) {

        String firstLine = "Humpty Dumpty sat on a wall,";
        String secondLine= "Humpty Dumpty had a great fall.";
        String thirdLine = "All the king's horses and all the king's men";
        String fourthLine = "Couldn't put Humpty together again.";
        String newLine = System.getProperty("line.separator");

        System.out.println(firstLine + newLine + secondLine + newLine + thirdLine + newLine + fourthLine);
    }
}
