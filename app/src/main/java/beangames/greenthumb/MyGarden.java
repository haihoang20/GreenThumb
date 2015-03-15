package beangames.greenthumb;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyGarden extends ActionBarActivity {

    private TextView topBar;
    private TextView bottomBar;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_garden);
        topBar = (TextView)findViewById(R.id.top_bar);
        bottomBar = (TextView)findViewById(R.id.my_garden_bottom);
        message = (TextView)findViewById(R.id.message);
        setFont();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_garden, menu);
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

    private void setFont(){
        String fontPath = "fonts/Chocolate.ttf";
        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);
        String fontPath1  = "fonts/Alittlesunshine.ttf";
        Typeface plantText = Typeface.createFromAsset(getAssets(),fontPath1);
        topBar.setTypeface(menu);
        bottomBar.setTypeface(menu);
        message.setTypeface(plantText);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyGarden myGarden = (MyGarden) o;

        if (!bottomBar.equals(myGarden.bottomBar)) return false;
        if (!topBar.equals(myGarden.topBar)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = topBar.hashCode();
        result = 31 * result + bottomBar.hashCode();
        return result;
    }
}
