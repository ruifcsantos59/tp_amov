package pt.a21260411a21260403isec.tp_amov;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void umJogador(View v) {
        Intent intent = new Intent(this,onePlayer.class);
        startActivity(intent);
    }

}
