package beangames.greenthumb;

/**
 * Created by jastine on 2015-03-14.
 */
public class Plant {

    private String name;
    private long[] sowing;      // pair of month and day
    private long[] harvest;     // pair of month and day
    private long[] maturity;    // long
    private String watering;
    private String fertilization;
    private String depth;
    private String rowSpacing;
    private String plantSpacing;


    public Plant(String name, String sowing, String harvest, String maturity, String watering,
                 String fertilization, String depth, String rowSpacing, String plantSpacing) {

        this.name = name;

        this.sowing = processDate(sowing);
        this.harvest = processDate(harvest);
        this.maturity = processDate(maturity);

        this.watering = watering;
        this.fertilization = fertilization;
        this.depth = depth;
        this.rowSpacing = rowSpacing;
        this.plantSpacing = plantSpacing;

    }

    private long[] processDate(String s) {
        long[] ret = new long[4];
        String month0 = s.substring(0, s.indexOf("-") - 1);
        String month1 = s.substring(s.indexOf("-") + 1, s.length());
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

    public long[] getSowing() {
        return sowing;
    }

    public long[] getHarvest() {
        return harvest;
    }

    public long[] getMaturity() {
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
