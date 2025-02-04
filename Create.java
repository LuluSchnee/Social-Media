import java.awt.*;
import java.io.File;

public class Create {
    public static void main(String[] args) {
        Address adresse1 = new Address("schutterstr", "Leipzig", "Germany");
        User luisa = new User("Luisa");
        luisa.setAddress(adresse1);
        luisa.setProfileImage(new File("https://www.kindernetz.de/wissen/1712824767800%2Csonne-118~_v-16x9@2dL_-6c42aff4e68b43c7868c3240d3ebfa29867457da.jpg"));

        luisa.uploadMedia(new Image(new File("https://www.kindernetz.de/wissen/1712824767800%2Csonne-118~_v-16x9@2dL_-6c42aff4e68b43c7868c3240d3ebfa29867457da.jpg")));
        System.out.println(luisa.getuploadedMedia());
        luisa.createAlbum("leben");
        luisa.addImageToAlbum((Image) luisa.getuploadedMedia().get(0),luisa.getAlbums().get(0));
        System.out.println(luisa.getAlbums().get(0).getImages());
    }



}
