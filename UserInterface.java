import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public interface UserInterface {
    public String getName();
    public void setBirthday(Date date);
    public Date getBirthday();
    public int getAge();
    public void setAddress(Address address);
    public Address getAddress();
    public void setProfileImage(File profileImage);
    public File getProfileImage();
    public void uploadMedia(Media media);
    public ArrayList<Media> getuploadedMedia();
    public void createAlbum(String albumName);
    public ArrayList<Album> getAlbums();
    public void addImageToAlbum(Image image, Album album);
}
