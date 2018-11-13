package BlogPost;

public class Main {
  public static void main(String[] args) {
    BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.",
        "2000.05.04.");

    System.out.println(post1.authorName + ": " + post1.title + " - " + post1.publicationDate);
    System.out.println(post1.text);

    BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-" +
        "illustrated blog about almost everything.", "2010.10.10.");

    System.out.println(post2.authorName + ": " + post2.title + " - " + post2.publicationDate);
    System.out.println(post2.text);

    BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I" +
        " asked to take\n his picture outside one of IBM’s New York City offices, he told me that he wasn’t really " +
        "into the whole organizer\n profile thing.", "2017.03.28.");

    System.out.println(post3.authorName + ": " + post3.title + " - " + post3.publicationDate);
    System.out.println(post3.text);

  }

}

