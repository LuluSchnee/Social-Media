import java.util.ArrayList;

public class TimeLineAll implements TimeLineInterface{
    public User user;
    TimeLineAll(User user){
        this.user = user;
    }
    @Override
    public ArrayList<Media> getTimeLine(User requester) {
        return user.uploadedMedia;
    }
}
