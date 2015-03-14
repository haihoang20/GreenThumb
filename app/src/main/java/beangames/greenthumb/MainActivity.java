package beangames.greenthumb;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button myGardenButton;
    private Button allPlantsButton;
    private Button infoButton;
    private TextView mainMenuText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        setFont();
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
        String fontPath = "fonts/OlivesFont.ttf";
        Typeface tf =Typeface.createFromAsset(getAssets(),fontPath);
        myGardenButton = (Button)findViewById(R.id.my_garden);
        allPlantsButton = (Button)findViewById(R.id.all_plants);
        infoButton = (Button)findViewById(R.id.info);
        mainMenuText=(TextView)findViewById(R.id.main_menu);
        myGardenButton.setTypeface(tf);
        allPlantsButton.setTypeface(tf);
        infoButton.setTypeface(tf);
        mainMenuText.setTypeface(tf);

    }



}
