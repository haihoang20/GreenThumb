package beangames.greenthumb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class AllPlants extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_plants);

        allPlantsText= (TextView)findViewById(R.id.all_plants_bottom);
        topBarText  = (TextView)findViewById(R.id.top_bar);
        beans = (TextView)findViewById(R.id.beans);
        beets = (TextView)findViewById(R.id.beets);
        broccoli = (TextView)findViewById(R.id.broccoli);
        brusselSprouts = (TextView)findViewById(R.id.brussels_sprout);
        cabbage = (TextView)findViewById(R.id.cabbage);
        carrot = (TextView)findViewById(R.id.carrot);
        cauliflower = (TextView)findViewById(R.id.cauliflower);
        celery = (TextView)findViewById(R.id.celery);
        corn = (TextView)findViewById(R.id.corn);
        cucumber = (TextView)findViewById(R.id.cucumber);
        eggplant = (TextView)findViewById(R.id.eggplant);
        kale = (TextView)findViewById(R.id.kale);
        leek = (TextView)findViewById(R.id.leek);
        lettuce = (TextView)findViewById(R.id.lettuce);
        melon = (TextView)findViewById(R.id.melon);
        okra = (TextView)findViewById(R.id.okra);
        onion = (TextView)findViewById(R.id.onion);
        parsnip = (TextView)findViewById(R.id.parsnip);
        peas = (TextView)findViewById(R.id.peas);
        pepper = (TextView)findViewById(R.id.pepper);
        potato = (TextView)findViewById(R.id.potato);
        pumpkin = (TextView)findViewById(R.id.pumpkin);
        radish = (TextView)findViewById(R.id.radish);
        spinach = (TextView)findViewById(R.id.spinach);
        squash = (TextView)findViewById(R.id.squash);
        sweetPotato = (TextView)findViewById(R.id.sweet_potato);
        swissChard = (TextView)findViewById(R.id.swiss_chard);
        tomato = (TextView)findViewById(R.id.tomato);
        turnip = (TextView)findViewById(R.id.turnip);
        watermelon = (TextView)findViewById(R.id.watermelon);

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
        Intent goToPlant = new Intent(getApplicationContext(),PlantActivity.class);
        goToPlant.putExtra("name",current);
        startActivity(goToPlant);

    }

    public void setFonts(){
        String fontPath = "fonts/Chocolate.ttf";
        String fontPath1  = "fonts/Alittlesunshine.ttf";

        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);
        Typeface plantText = Typeface.createFromAsset(getAssets(),fontPath1);

        allPlantsText.setTypeface(menu);
        topBarText.setTypeface(menu);
        beans.setTypeface(plantText);
        beets.setTypeface(plantText);
        broccoli.setTypeface(plantText);
        brusselSprouts.setTypeface(plantText);
        cabbage.setTypeface(plantText);
        carrot.setTypeface(plantText);
        cauliflower.setTypeface(plantText);
        celery.setTypeface(plantText);
        corn.setTypeface(plantText);
        cucumber.setTypeface(plantText);
        eggplant.setTypeface(plantText);
        kale.setTypeface(plantText);
        leek.setTypeface(plantText);
        lettuce.setTypeface(plantText);
        melon.setTypeface(plantText);
        okra.setTypeface(plantText);
        onion.setTypeface(plantText);
        parsnip.setTypeface(plantText);
        peas.setTypeface(plantText);
        pepper.setTypeface(plantText);
        potato.setTypeface(plantText);
        pumpkin.setTypeface(plantText);
        radish.setTypeface(plantText);
        spinach.setTypeface(plantText);
        squash.setTypeface(plantText);
        sweetPotato.setTypeface(plantText);
        swissChard.setTypeface(plantText);
        tomato.setTypeface(plantText);
        turnip.setTypeface(plantText);
        watermelon.setTypeface(plantText);
    }
}
