public class UrlFixer {

    public static void main(String... args) throws Exception {

        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");

        String buf = new StringBuffer(url).insert(5, ":").toString();
        url = buf;

        System.out.println(url);
    }
}
