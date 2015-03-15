package beangames.greenthumb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Created by jastine on 2015-03-14.
 */
public class Plant implements Serializable {

    private String name;
    private String sowing;
    private String harvest;
    private long maturity;    // long
    private String watering;
    private String fertilization;
    private String depth;
    private String rowSpacing;
    private String plantSpacing;

    public Plant(String name, String sowing, String harvest, String maturity, String watering,
                 String fertilization, String depth, String rowSpacing, String plantSpacing) {

        this.name = name;

        this.sowing = this.sowing;
        this.harvest = this.harvest;
        this.maturity = Long.parseLong(maturity);


        this.watering = watering;
        this.fertilization = fertilization;
        this.depth = depth;
        this.rowSpacing = rowSpacing;
        this.plantSpacing = plantSpacing;
    }


    private long[] processDate (String s) {

        // pair of month and day
        // pair of month and day
        // [0] day of first month
        // [1] first month
        // [2] day of second month
        // [3] second month

        // Mid-January - March
        // [0] 15 Mid
        // [1] 1 January
        // [2] 1 absence of Mid, beginning of month
        // [3] 3 March

        long[] ret = new long[4];
        String month0 = "";
        String month1 = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                month0 = s.substring(0, i);
                month1 = s.substring(i + 3, s.length());
                break;
            }
        }
        if (month0.contains("Mid")) ret[0] = 15;
        else ret[0] = 1;

        if (month0.contains("January")) ret[1] = 1;
        if (month0.contains("February")) ret[1] = 2;
        if (month0.contains("March")) ret[1] = 3;
        if (month0.contains("April")) ret[1] = 4;
        if (month0.contains("May")) ret[1] = 5;
        if (month0.contains("June")) ret[1] = 6;
        if (month0.contains("July")) ret[1] = 7;
        if (month0.contains("August")) ret[1] = 8;
        if (month0.contains("September")) ret[1] = 9;
        if (month0.contains("October")) ret[1] = 10;
        if (month0.contains("November")) ret[1] = 11;
        if (month0.contains("December")) ret[1] = 12;

        if (month1.contains("Mid")) ret[2] = 15;
        else ret[2] = 1;

        if (month1.contains("January")) ret[3] = 1;
        if (month1.contains("February")) ret[3] = 2;
        if (month1.contains("March")) ret[3] = 3;
        if (month1.contains("April")) ret[3] = 4;
        if (month1.contains("May")) ret[3] = 5;
        if (month1.contains("June")) ret[3] = 6;
        if (month1.contains("July")) ret[3] = 7;
        if (month1.contains("August")) ret[3] = 8;
        if (month1.contains("September")) ret[3] = 9;
        if (month1.contains("October")) ret[3] = 10;
        if (month1.contains("November")) ret[3] = 11;
        if (month1.contains("December")) ret[3] = 12;

        return ret;
    }

    public String getName() {
        return name;
    }

    public long[] getSowingArray() {
        return processDate(sowing);
    }

    public long[] getHarvestArray() {
        return processDate(sowing);
    }

    public String getSowing() { return sowing;}

    public String getHarvest() { return harvest;}

    public long getMaturity() {
        return maturity;
    }

    public String getWatering() {
        return watering;
    }

    public String getFertilization() {
        return fertilization;
    }

    public String getDepth() {
        return depth;
    }

    public String getRowSpacing() {
        return rowSpacing;
    }

    public String getPlantSpacing() {
        return plantSpacing;
    }


}
