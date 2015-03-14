package beangames.greenthumb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    private Button myGardenButton;
    private Button allPlantsButton;
    private Button infoButton;
    private TextView mainMenuText;
    private TextView topBarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFont();
        /*myGardenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent goToMyGarden = new Intent(getBaseContext(), MyGarden.class);
                startActivity(goToMyGarden);
            }
        });*/
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void setFont(){
        String fontPath1  = "fonts/OlivesFont.ttf";
        String fontPath2 = "fonts/Chocolate.ttf";
        Typeface button = Typeface.createFromAsset(getAssets(),fontPath1);
        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath2);
        myGardenButton  = (Button)findViewById(R.id.my_garden);
        allPlantsButton = (Button)findViewById(R.id.all_plants);
        infoButton  = (Button)findViewById(R.id.info);
        mainMenuText= (TextView)findViewById(R.id.main_menu);
        topBarText  = (TextView)findViewById(R.id.top_bar);
        myGardenButton.setTypeface(button);
        allPlantsButton.setTypeface(button);
        infoButton.setTypeface(button);
        mainMenuText.setTypeface(menu);
        topBarText.setTypeface(menu);

    }
    public void myGardenNextPage(View v){
        myGardenButton = (Button)v;
        startActivity(new Intent(getApplicationContext(),MyGarden.class));
    }

    public void allPlantsNextPage(View v){
        allPlantsButton = (Button)v;
        startActivity((new Intent(getApplicationContext(),AllPlants.class)));
    }

    public void infoNextPage (View v){
        infoButton = (Button)v;
        startActivity(new Intent(getApplicationContext(),Info.class));
    }





}
