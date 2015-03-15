package beangames.greenthumb;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Info extends ActionBarActivity {

    private TextView thanks;
    private TextView topBar;
    private TextView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        String fontPath1  = "fonts/Alittlesunshine.ttf";
        Typeface plantText = Typeface.createFromAsset(getAssets(),fontPath1);
        thanks = (TextView)findViewById(R.id.thank_you);
        thanks.setTypeface(plantText);
        String fontPath = "fonts/Chocolate.ttf";
        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);
        topBar = (TextView)findViewById(R.id.top_bar);
        bottomBar = (TextView)findViewById(R.id.bottom_bar);
        topBar.setTypeface(menu);
        bottomBar.setTypeface(menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
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
}
