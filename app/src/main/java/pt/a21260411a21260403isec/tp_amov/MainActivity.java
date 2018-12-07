package pt.a21260411a21260403isec.tp_amov;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //User
        Typeface font = Typeface.createFromAsset(getAssets(),"fonts/SMARC___.TTF");
        ((TextView)findViewById(R.id.Title)).setTypeface(font);

    }

    public void umJogador(View v) {
        Intent intent = new Intent(this,onePlayer.class);
        startActivity(intent);
    }

}
