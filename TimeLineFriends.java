import java.util.ArrayList;

public class TimeLineFriends implements TimeLineInterface{
    public User user;
    TimeLineFriends(User user){
        this.user = user;
    }
    @Override
    public ArrayList<Media> getTimeLine(User requester) {
        if(user.FollowerList.contains(requester)) {
            return user.uploadedMedia;

        }else {
            return null;
        }
    }
}
