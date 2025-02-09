import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;
        public class Tests {
            @Test
            public void testAddImageToAlbum() {
                // Arrange: Nutzer und Album erstellen
                User luisa = new User("luisa");
                luisa.createAlbum("Urlaub");
                Album album = luisa.getAlbums().get(0); // Sicherstellen, dass das richtige Album verwendet wird
                Image image = new Image(new File("bild.jpg"));

                // Act: Bild wird hochgeladen (gehört jetzt dem Nutzer)
                luisa.uploadMedia(image);

                // Act: Bild zum Album hinzufügen
                luisa.addImageToAlbum(image, album);

                // Assert: Überprüfen, ob das Album zum Nutzer gehört
                assertTrue(luisa.getAlbums().contains(album), "Album sollte in der Liste des Nutzers sein.");

                // Assert: Gehört das Bild dem Nutzer?
                assertTrue(luisa.getuploadedMedia().contains(image), "Das Bild sollte dem Nutzer gehören.");

                // Assert: Wurde das Bild tatsächlich ins Album aufgenommen?
                assertTrue(album.getImages().contains(image), "Das Bild sollte im Album sein.");
    }
}
