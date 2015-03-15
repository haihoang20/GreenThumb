package beangames.greenthumb;

import android.app.Activity;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by MSI Note on 3/13/2015.
 */
public class PlantDatabase implements Serializable {

    HashMap<String, Plant> database;

    public Activity presentActivity;

    public PlantDatabase(Activity activity) {
        presentActivity = activity;
        database = new HashMap<String, Plant>();   // provides O(1) get method
        loadDatabase();
    }

    public void loadDatabase() {

        // Thanks to Robert Balayan https://vk.com/yahhh_gf

        // creating new input stream for .txt file
        String databasePath  = "database/plant_database.txt";
        try {

            AssetManager am = presentActivity.getApplicationContext().getAssets();
            InputStream istream = am.open(databasePath);

            BufferedReader buf = new BufferedReader(new InputStreamReader(istream));
            String line;

            while ((line = buf.readLine()) != null) {
                // process every plant.
                if (line.startsWith("[") && line.endsWith("]")) {
                    // process all plant's fields
                    String name = "";
                    String sowing = "";
                    String harvest = "";
                    String maturity = "";
                    String watering = "";
                    String fertilization = "";
                    String depth = "";
                    String rowSpacing = "";
                    String plantSpacing = "";
                    while (!(line = buf.readLine()).equals("*")) {

                        if (line.contains("<name>")) {
                            name = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<sowing>")) {
                            sowing = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("harvest")) {
                            harvest = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<maturity>")) {
                            maturity = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<watering>")) {
                            watering = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<fertilization>")) {
                            fertilization = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<depth>")) {
                            depth = line.substring(line.indexOf(">") + 2, line.length());
                        }
                        if (line.contains("<rowSpacing>")) {
                            rowSpacing = line.substring(line.indexOf(">") + 2, line.length());
                        }

                        if (line.contains("<plantSpacing>")) {
                            plantSpacing = line.substring(line.indexOf(">") + 2, line.length());
                        }
                    }
                    Plant tempPlant = new Plant(name,sowing,harvest,maturity,watering,fertilization,
                            depth,rowSpacing,plantSpacing);
                    database.put(name,tempPlant);
                }
            }
            istream.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }

    public void writeDatabase() {
        OutputStream ostream = null;
        String databasePath  = "database/plant_database.txt";
        try {
            presentActivity.getApplicationContext().getFileStreamPath("plant_database.txt");
            File file = new File("plant_database.txt"); //I have no idea what I am doing :D
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            Iterator it = database.entrySet().iterator();
            while (it.hasNext()) {

                Map.Entry pair = (Map.Entry) it.next();
                Plant temp = (Plant) pair.getValue();

                bw.write("[" + pair.getKey() + "]");

                bw.write("<name> " + temp.getName() + "\n");

                bw.write("<sowing> " + temp.getName() + "\n");

                bw.write("<harvest> " + temp.getHarvest() + "\n");

                bw.write("<maturity> " + temp.getMaturity() + "\n");

                bw.write("<watering> " + temp.getName() + "\n");

                bw.write("<fertilization> " + temp.getFertilization() + "\n");

                bw.write("<depth> " + temp.getDepth() + "\n");

                bw.write("<rowSpacing> " + temp.getRowSpacing() + "\n");

                bw.write("<plantSpacing> " + temp.getPlantSpacing() + "\n");

                bw.write("*");

                bw.write("\n");
                //bw.newLine();
                //it.remove(); // avoids a ConcurrentModificationException
            }
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }


    public void add(String s, Plant p) {
        database.put(s, p);
    }

    public Plant get(String s){
        if (database.containsKey(s)) {
            return database.get(s);
        }
        return (Plant) null;
    }





}
