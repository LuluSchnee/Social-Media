import java.io.File;
import java.util.Date;

public class Music implements Media{

    public File musicFile;
    public Date timeStamp ;

    public Music(File musicFile){
        this.musicFile = musicFile;
        this.timeStamp = new Date();
    }

    @Override
    public Date getTimestamp() {
        return timeStamp;
    }
}
