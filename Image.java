import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

public class Image implements Media{
    public File image;
public Date timeStamp ;

    public Image(File image) {
        this.image = image;
        this.timeStamp = new Date();
    }

    @Override
    public Date getTimestamp() {
    return timeStamp;
    }
}
