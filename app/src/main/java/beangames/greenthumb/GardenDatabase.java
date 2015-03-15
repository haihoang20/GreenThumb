package beangames.greenthumb;

import android.app.Activity;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by MSI Note on 3/13/2015.
 */
public class GardenDatabase extends Database implements Serializable {

    private HashMap<String, Plant> database;

    public Activity presentActivity;

    public static final String databasePath  = "database/plant_database.txt";

    public GardenDatabase(Activity activity) {
        presentActivity = activity;
        database = new HashMap<String, Plant>();   // provides O(1) get method
        loadDatabase();
    }

    public void loadDatabase() {

        // Thanks to Robert Balayan https://vk.com/yahhh_gf

        // creating new input stream for .txt file
        try {
            FileInputStream fileIn = presentActivity.getApplicationContext()
                    .openFileInput("garden_database.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            database = (HashMap<String, Plant>) in.readObject();
            in.close();
            fileIn.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public void writeDatabase() {
        try {
            FileOutputStream fileOut = presentActivity.openFileOutput(
                    "garden_database.ser", 0);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(database);
            out.close();
            fileOut.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }


    }


    public void add(String s, Plant p) {
        database.put(s, p);
    }

    public Plant get(String o){
        if (database.containsKey(o)) {
            return database.get(o);
        }
        return (Plant) null;
    }



}

