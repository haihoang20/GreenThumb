package beangames.greenthumb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class Plant extends ActionBarActivity {
    private String name;
    private String season;
    private TextView topBarText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);
        Intent intent = getIntent();
        name = intent.getExtras().getString("name");
        Toast toast = Toast.makeText(this, name, Toast.LENGTH_LONG);
        toast.show();
        topBarText  = (TextView)findViewById(R.id.top_bar);
        setFonts();
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

    public void setFonts(){
        String fontPath = "fonts/Chocolate.ttf";


        Typeface menu   = Typeface.createFromAsset(getAssets(),fontPath);



        topBarText.setTypeface(menu);

    }

}
