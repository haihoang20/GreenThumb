package beangames.greenthumb;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.jar.Attributes;

/**
 * Created by jastine on 2015-03-13.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs) {
        super(context,attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/OlivesFont.ttf"));
    }


}
