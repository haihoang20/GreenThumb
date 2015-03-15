package beangames.greenthumb;

import android.app.Activity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by MSI Note on 3/14/2015.
 */
public class GardenStorage implements Serializable {

    private static final long serialVersionUID = 808898191;

    public static final String edenPath  = "database/notification_data.txt";

    private Activity presentActivity;

    public GardenStorage(Activity activity) {
        presentActivity = activity;
    }

    public MyGarden loadStorage() {

        MyGarden eden;
        try {

            FileInputStream fistream = new FileInputStream(edenPath);
            ObjectInputStream istream = new ObjectInputStream(fistream);

            Object o = istream.readObject();

            eden = (MyGarden) o;
            return eden;
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        return null;
    }


    public void writeStorage(MyGarden eden) {

        try {
            ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(edenPath));
            ostream.writeObject(eden);
            ostream.flush();
            ostream.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}
