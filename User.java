import java.awt.*;
import java.io.File;
import java.util.Date;

import java.util.ArrayList;
public class User implements UserInterface{
public String name;
public int age;
public Date birthday;
public Address address;
public File profileImage;
public ArrayList<Media> uploadedMedia= new ArrayList<>();
public ArrayList<Album> albumList= new ArrayList<>();
public ArrayList<User> FollowerList= new ArrayList<>();
public TimeLineInterface timeLine;

// wenn instanc erstellt wird , name muss da sein
public User(String name) {
    this.name = name;
    timeLine= new TimeLineFriends(this);
}
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setBirthday(Date date) {
this.birthday = date;
//berechne age
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return  address;
    }

    @Override
    public void setProfileImage(File profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public File getProfileImage() {
        return profileImage ;
    }

    @Override
    public void uploadMedia(Media media) {
        uploadedMedia.add(media);
    }

    @Override
    public ArrayList<Media> getuploadedMedia() {
        return uploadedMedia;
    }

    @Override
    public void createAlbum(String albumName) {
        albumList.add(new Album(albumName,this));
    }

    @Override
    public ArrayList<Album> getAlbums() {
        return albumList;
    }


    public void addImageToAlbum(Image image, Album album){
    if(albumList.contains(album)&& uploadedMedia.contains(image)){
        album.addImage(image,this);
    }

    }

    @Override
    public void addFriend(User friend) {
        this.FollowerList.add(friend);
    }

    @Override
    public ArrayList<Media>getTimeLine(User requester) {
        return timeLine.getTimeLine(requester) ;
    }

    @Override
    public void setTimeLine(TimeLineInterface timeLine) {
        this.timeLine= timeLine;
    }

}


