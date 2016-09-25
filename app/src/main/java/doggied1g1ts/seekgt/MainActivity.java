package doggied1g1ts.seekgt;

import android.app.Activity;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class MainActivity extends Activity {

    Firebase top, game;

    String playerName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);

        top = new Firebase("https://seekgt-bca8d.firebaseio.com/\n");
        game = top.child("game");

        playerName = "Chris";


    }
}
