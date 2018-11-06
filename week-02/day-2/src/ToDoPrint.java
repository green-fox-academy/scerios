public class ToDoPrint {

    public static void main(String[] args) {

        String todoText = " - Buy milk\n";
        String begin = "My todo:\n";
        String dlg = " - Download games\n";
        String dia = "\t - Diablo";

        StringBuilder sb = new StringBuilder(todoText);
        sb.insert(0, begin);
        sb.append(dlg);
        sb.append(dia);

        todoText = sb.toString();

        System.out.println(todoText);
    }
}
