import java.io.File;
import java.util.Date;

public class Video implements Media{
    public File video;
    public Date timeStamp ;

    public Video(File video){
        this.video = video;
        this.timeStamp = new Date();

    }
    @Override
    public Date getTimestamp() {
        return timeStamp;
    }
}
