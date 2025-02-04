import java.util.ArrayList;

public class Album {

    public String title;
    ArrayList<Image> images= new ArrayList<>();
    User user;
    public Album(String title, User user) {
        this.title = title;
        this.user=user;
    }

    public void addImage(Image image, User user) {
        if(this.user==user) {
            images.add(image);
        }
    }
    public ArrayList<Image> getImages() {
        return images;
    }

    public String getTitle() {
        return title;
    }




}
