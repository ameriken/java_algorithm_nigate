package graph.adjacency_list;

public class Practice {
    public static void main(String[] args) {
        Station[] station = new Station[6];

        station[0] = new Station("鎌倉");
        station[1] = new Station("藤沢");
        station[2] = new Station("横浜");
        station[3] = new Station("横須賀");
        station[4] = new Station("茅ヶ崎");
        station[5] = new Station("東京");


        // 鎌倉
        //station[].addStation(station[]);
        //station[].addStation(station[]);
        //station[].addStation(station[]);

        // 藤沢
        //station[].addStation(station[]);
        //station[].addStation(station[]);
        //station[].addStation(station[]);

        // 横浜
        //station[].addStation(station[]);
        //station[].addStation(station[]);
        //station[].addStation(station[]);

        // 横須賀・茅ヶ崎・東京
        //station[].addStation(station[]);
        //station[].addStation(station[]);
        //station[].addStation(station[]);


        for (int i = 0; i < 6; i++) {
            station[i].printStation();
        }
    }
}
