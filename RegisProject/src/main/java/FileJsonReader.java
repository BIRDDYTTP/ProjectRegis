import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FileJsonReader {
    private final String filename = "";

    private static FileJsonReader instance = new FileJsonReader();

    private FileJsonReader(){}

    public static FileJsonReader getInstance(){
        if (instance == null)
            instance = new FileJsonReader();
        return instance;
    }

    public ArrayList<Subject> readJsonToSubject(String filename){
        Gson gson = new Gson();
        JsonReader reader = null;
        try {
            reader = new JsonReader(new FileReader(filename));
            Subject[] data = gson.fromJson(reader, Subject[].class);
            ArrayList<Subject> subjects = new ArrayList<Subject>(Arrays.asList(data));
            return subjects;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
