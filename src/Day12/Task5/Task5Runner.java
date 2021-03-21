package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5Runner {
    public static void main(String[] args) {
        List<MusicArtist> artists = new ArrayList<>();
        artists.add(new MusicArtist("A","AA",19));
        artists.add(new MusicArtist("B","BB",22));
        artists.add(new MusicArtist("CC","CC",24));
        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("D","DD",22));
        artists1.add(new MusicArtist("E","EE",24));
        artists1.add(new MusicArtist("F","FF",26));

        System.out.println(artists);
        System.out.println(artists1);

        List<MusicBand> band1 = new ArrayList<>();
        band1.add(new MusicBand("Ace of Base", 1998, artists));
        List<MusicBand> band2 = new ArrayList<>();
        band2.add(new MusicBand("Kikimoro", 2004,artists1));
        System.out.println(band1);
        System.out.println(band2);
//        MusicBand.transferMembers(band1, band2);

    }
}
