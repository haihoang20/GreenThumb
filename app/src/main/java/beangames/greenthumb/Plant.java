package beangames.greenthumb;

/**
 * Created by jastine on 2015-03-14.
 */
public class Plant {

    private String name;
    private String sowing;
    private String harvest;
    private String maturity;
    private String watering;
    private String fertilization;
    private String depth;
    private String rowSpacing;
    private String plantSpacing;


    public Plant(String name, String sowing, String harvest, String maturity, String watering,
                 String fertilization, String depth, String rowSpacing, String plantSpacing) {
        this.name = name;
        this.sowing = sowing;
        this.harvest = harvest;
        this.maturity = maturity;
        this.watering = watering;
        this.fertilization = fertilization;
        this.depth = depth;
        this.rowSpacing = rowSpacing;
        this.plantSpacing = plantSpacing;


    }

    public String getName() {
        return name;
    }

    public String getSowing() {
        return sowing;
    }

    public String getHarvest() {
        return harvest;
    }

    public String getMaturity() {
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
