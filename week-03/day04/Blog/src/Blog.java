import java.util.List;
/*delete(int) one item at given index
update(int, BlogPost) one item at the given index and update it with another BlogPost*/

public class Blog {
  List<BlogPost> blogPosts;

  public Blog() {

  }

  void add(BlogPost blogPost) {
    blogPosts.add(blogPost);
  }

  void delete(int i){
    blogPosts.remove(i);
  }

  void update(int i , BlogPost blogPost){
    blogPosts.add(i, blogPost);
  }


}
