package dynamitechetan.nanodegree.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Spotify_Button = (Button)findViewById(R.id.Spotify_Streamer);
        Button Library_Button =(Button)findViewById(R.id.library);
        Button Scores_Button = (Button)findViewById(R.id.scores);
        Button Capstone_Button =(Button)findViewById(R.id.capstone);
        Button Bigger_Button =(Button)findViewById(R.id.bigger);
        Button XYZ_Button = (Button)findViewById(R.id.xyzreader);


        Spotify_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "This will Open Spotify Streamer App", Toast.LENGTH_SHORT).show();
            }
        });
        Library_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"This will Open Library App",Toast.LENGTH_SHORT).show();
            }
        });
        Scores_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"This will Open Scores App",Toast.LENGTH_SHORT).show();
            }
        });
        Capstone_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"This will Open My Capstone Project",Toast.LENGTH_SHORT).show();
            }
        });
        Bigger_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"This will Open Build it Bigger App",Toast.LENGTH_SHORT).show();
            }
        });
        XYZ_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"This will Open XYZ Reader App",Toast.LENGTH_SHORT).show();
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
