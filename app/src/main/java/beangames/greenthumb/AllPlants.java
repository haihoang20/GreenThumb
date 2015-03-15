package beangames.greenthumb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AllPlants extends ActionBarActivity {
    private String current;
    private TextView tv;
    private TextView allPlantsText;
    private TextView topBarText;
    private TextView beans;
    private TextView beets;
    private TextView broccoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_plants);

        allPlantsText= (TextView)findViewById(R.id.all_plants_bottom);
        topBarText  = (TextView)findViewById(R.id.top_bar);
        beans = (TextView)findViewById(R.id.beans);
        beets = (TextView)findViewById(R.id.beets);
        broccoli = (TextView)findViewById(R.id.broccoli);

        setFonts();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_all_plants, menu);
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

    public void plantNextPage(View v){
        tv = (TextView) v;
        current = tv.getText().toString();
        Intent goToPlant = new Intent(getApplicationContext(),Plant.class);
        goToPlant.putExtra("name",current);
        startActivity(goToPlant);

    }

    public void setFonts(){
        String fontPath = "fonts/Chocolate.ttf";
        String fontPath1  = "fonts/RockSalmon.ttf";

        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);
        Typeface plantText = Typeface.createFromAsset(getAssets(),fontPath1);

        allPlantsText.setTypeface(menu);
        topBarText.setTypeface(menu);
        beans.setTypeface(plantText);
        beets.setTypeface(plantText);
        broccoli.setTypeface(plantText);
    }
}
