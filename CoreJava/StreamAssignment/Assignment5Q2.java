package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assignment5Q2 {
    public static int maxComments(List<News> news) {
        return news.stream().max(Comparator.comparing(News::getCommentByUser)).get().getNewsId();
    }

    public static int budgetCount (List < News > news) {
        int count = 0;
        List<String> allComments = new ArrayList<>();
        news.stream().forEach(i->allComments.add(i.getComment()));
        for(String s:allComments) {
            if(s.contains("budget")) {
                count++;
            }
        }
        return count;

    }
    public static String maxCommentsByUser (List < News > news) {
        return news.stream().max(Comparator.comparing(News::getComment)).get().getCommentByUser();

    }

    public static Map<String, List<News>> sortMaxCommentsByUser (List < News > news) {
        return news.stream().collect(Collectors.groupingBy(w -> w.getComment()));
    }

    public static void main(String[] args) {
        News a = new News(1,"SAI","KING","Awesome");
        News b = new News(2,"RAM","KING","budget!");
        News c = new News(1,"RAVI","KING","Awesome :)");
        News d = new News(3,"RAJU","SAI","budget");
        News e = new News(1,"KING","MARTIN","budget!");
        News f = new News(3,"MARTIN","SUMAN","budget!");
        News g = new News(1,"SUMAN","MARTIN","comment");
        List<News> news = new ArrayList<>();
        news.add(a);
        news.add(b);
        news.add(c);
        news.add(d);
        news.add(e);
        news.add(f);
        news.add(g);
        Assignment5Q2 ab=new Assignment5Q2();
        System.out.println(maxComments(news));
        System.out.println(budgetCount(news));
        System.out.println(maxCommentsByUser(news));
        System.out.println(sortMaxCommentsByUser(news));
    }
}
class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public News(int newsId, String postedByUser, String commentByUser, String comment) {
        this.newsId = newsId;
        this.postedByUser = postedByUser;
        this.commentByUser = commentByUser;
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", postedByUser='" + postedByUser + '\'' +
                ", commentByUser='" + commentByUser + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}