package com.example.xyb5b.cwd;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;


public class MainActivity extends ActionBarActivity {
    public final static String BUTTON_TAG="Button_Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String todayDate = DateFormat.getDateInstance().format(new Date());
        TextView t=(TextView)findViewById(R.id.textView2);
        t.setText(todayDate);
        Log.d("MainActivity", todayDate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void goTest(View view){
        Intent intent=new Intent(this,Test.class);
        switch (view.getId()){
            case R.id.hunter_harvested:
                intent.putExtra(BUTTON_TAG,"hunter_harvested");
                break;
            case R.id.road_kill:
                intent.putExtra(BUTTON_TAG,"road_kill");
                break;
            case R.id.sick_deer:
                intent.putExtra(BUTTON_TAG,"sick_deer");
                break;
            case R.id.targeted_harvest:
                intent.putExtra(BUTTON_TAG,"targeted_harvest");
                break;
        }
        startActivity(intent);
    }
}
