package beangames.greenthumb;

import java.util.Calendar;


/**
 * Created by MSI Note on 3/14/2015.
 */

public class Struct {

    // Plant Type		Type of Alarm		Alarm Details
    // String			String			    Date

    String plant_type;
    String type_plant;
    Calendar date;

    public Struct(String s, String t, Calendar c) {
        plant_type = s;
        type_plant = t;
        date = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Struct struct = (Struct) o;

        if (!date.equals(struct.date)) return false;
        if (!plant_type.equals(struct.plant_type)) return false;
        if (!type_plant.equals(struct.type_plant)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = plant_type.hashCode();
        result = 31 * result + type_plant.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
