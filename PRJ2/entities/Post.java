package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private LocalDateTime moment;
    private String content;
    private Integer likes = 0;

    private List<Comment> comments = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public Post(String title, LocalDateTime moment, String content, Integer likes) {
        setTitle(title);
        setMoment(moment);
        setContent(content);
        increaseLikes(likes);
    }

    /*
     * public String toString() {
     * String post = "\nTitle: " + getTitle();
     * post += "\n" + getLikes() + " like(s) - " + getMoment("dd/MM/yyyy HH:mm");
     * post += "\nContent: " + getContent();
     * post += "\nComments: ";
     * post += listComments();
     * return post;
     * }
     */
    public String toString() {
        sb.append(getTitle() + "\n");
        sb.append(getLikes() + " like(s) - " + getMoment("dd/MM/yyyy HH:mm") + "\n");
        sb.append("Content: " + getContent() + "\n");
        sb.append("Comments:\n");
        listComments();
        return sb.toString();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public void listComments() {
        for (Comment c : comments) {
            sb.append(c + "\n");
        }
    }

    public void increaseLikes(int likes) {
        this.likes += likes;
    }

    public void decreaseLikes(int likes) {
        this.likes -= likes;
    }

    // #region Getters e setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.trim();
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public String getMoment(String fmt) {
        return moment.format(DateTimeFormatter.ofPattern(fmt));
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    // #endregion
}
