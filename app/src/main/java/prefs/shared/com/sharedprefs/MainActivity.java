package prefs.shared.com.sharedprefs;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout mymainLayout= (RelativeLayout) findViewById(R.id.mymainLayout);

        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String mycolor= preferences.getString("color",null);
        if(mycolor==null)
        {
            mymainLayout.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            mymainLayout.setBackgroundColor(Color.parseColor(mycolor));
        }

        Button redBtn= (Button) findViewById(R.id.redBtn);
        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout mymainLayout= (RelativeLayout) findViewById(R.id.mymainLayout);
                mymainLayout.setBackgroundColor(Color.RED);


                SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("color", "red");
                editor.commit();


            }
        });

        Button blueBtn= (Button) findViewById(R.id.blueBtn);
        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout mymainLayour= (RelativeLayout) findViewById(R.id.mymainLayout);
                mymainLayour.setBackgroundColor(Color.BLUE);

                SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("color", "blue");
                editor.commit();
            }
        });

        Button greenBtn= (Button) findViewById(R.id.greenBtn);
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RelativeLayout mymainLayour= (RelativeLayout) findViewById(R.id.mymainLayout);
                mymainLayour.setBackgroundColor(Color.GREEN);


                SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor= preferences.edit();
                editor.putString("color", "green");
                editor.commit();
            }
        });

    }
}
