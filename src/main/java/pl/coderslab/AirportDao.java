package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AirportDao {

    public static List<Airport> getList(){
        List<Airport> result = new ArrayList<Airport>();
        Path path = Paths.get("/Users/krzysztofszczeciak/workspace/Homework_04/src/main/java/pl/coderslab/airports.txt");
        try{
            for (String line: Files.readAllLines(path)
                 ) {
                String[] temp = line.split(";");
                Airport airport = new Airport(temp[0], temp[1], temp[2]);
                result.add(airport);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
