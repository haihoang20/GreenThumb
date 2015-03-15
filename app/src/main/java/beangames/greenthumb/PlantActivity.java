package beangames.greenthumb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PlantActivity extends MainActivity {

    private String key;
    private Plant p;
    private Button b;
    private TextView topBarText;
    private TextView bottomBarText;
    private TextView name;
    private TextView sowingSeasons;
    private TextView harvestTime;
    private TextView timeToMaturity;
    private TextView watering;
    private TextView fertilization;
    private TextView depth;
    private TextView rowSpacing;
    private TextView plantSpacing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);
        Intent intent = getIntent();
        key = intent.getExtras().getString("name");
        p = getPlant();
        setFonts();
        setDescription();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_plant, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public Plant getPlant(){
        PlantDatabase pdb = this.getPlantDataBase();
        return pdb.get(key);
    }

    public void setFonts(){
        String fontPath = "fonts/Chocolate.ttf";
        String fontPath1  = "fonts/OlivesFont.ttf";
        topBarText  = (TextView)findViewById(R.id.top_bar);
        b = (Button)findViewById(R.id.add);
        Typeface button = Typeface.createFromAsset(getAssets(),fontPath1);
        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);
        topBarText.setTypeface(menu);
        b.setTypeface(button);

    }

    public void setDescription(){
        name = (TextView)findViewById(R.id.name);
        sowingSeasons = (TextView)findViewById(R.id.Sowing_Season_Description);
        bottomBarText = (TextView)findViewById(R.id.plants_bottom);
        harvestTime = (TextView)findViewById(R.id.Harvest_Time_Description);
        timeToMaturity = (TextView)findViewById(R.id.Time_to_Maturity_Description);
        watering = (TextView)findViewById(R.id.Watering_Requirements_Description);
        fertilization = (TextView)findViewById(R.id.Fertilization_Description);
        depth = (TextView)findViewById(R.id.Seed_Depth_Description);
        rowSpacing = (TextView)findViewById(R.id.Row_Spacing_Description);
        plantSpacing = (TextView)findViewById(R.id.Plant_Spacing_Description);
        bottomBarText.setText(p.getName());
        name.setText(p.getName());
        sowingSeasons.setText(p.getSowing());
        harvestTime.setText(p.getHarvest());
        timeToMaturity.setText(String.valueOf(p.getMaturity()));
        watering.setText(p.getWatering());
        fertilization.setText(p.getFertilization());
        depth.setText(p.getDepth());
        rowSpacing.setText(p.getRowSpacing());
        plantSpacing.setText(p.getPlantSpacing());

    }


}
