package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Runner {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("A");
        members1.add("B");
        members1.add("C");
        members1.add("D");
        MusicBand band1 = new MusicBand("Ace of Base", 1988, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("E");
        members2.add("F");
        members2.add("G");
        members2.add("H");
        MusicBand band2 = new MusicBand("Acid Black Cherry", 1999, members2);
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

//        MusicBand band3 = new MusicBand("Adelitas Way", 1934);
//        MusicBand band4 = new MusicBand("Adema", 1922);
//        MusicBand band5 = new MusicBand("Aeba", 1999);
//        MusicBand band6 = new MusicBand("Aerosmith", 2001);
//        MusicBand band7 = new MusicBand("AFI", 2002);
//        MusicBand band8 = new MusicBand("After Forever", 2003);
//        MusicBand band9 = new MusicBand("Agalloch", 2004);
//        MusicBand band10 = new MusicBand("Airbourne", 2005);

        List<MusicBand> list = new ArrayList<>();
        list.add(band1);
        list.add(band2);
//        list.add(band3);
//        list.add(band4);
//        list.add(band5);
//        list.add(band6);
//        list.add(band7);
//        list.add(band8);
//        list.add(band9);
//        list.add(band10);
        Collections.shuffle(list);

        List<MusicBand> after2000 = new ArrayList<>();
            for (MusicBand bands: list) {
                if(bands.getYear() > 2000){
                    after2000.add(bands);
                }
            }
        System.out.println(after2000);
            List<MusicBand> before2000 = new ArrayList<>();
        for (MusicBand band : list) {
            if (band.getYear() < 2000){
                before2000.add(band);
            }
        }
        System.out.println(before2000);
    }
}
