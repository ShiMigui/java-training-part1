import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime dt;

        dt = LocalDateTime.parse("2018-06-21T13:05:44");

        Post post1 = new Post("Traveling to New Zealand", dt, "I'm going to visit this wonderful country!", 12);
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome"));

        dt = LocalDateTime.parse("2018-07-28T23:14:19");

        Post post2 = new Post("Good night guys", dt, "See you tomorrow", 5);
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("Maybe the Force be with you"));

        System.out.println(post1);
        System.out.println();
        System.out.println(post2);
    }
}
