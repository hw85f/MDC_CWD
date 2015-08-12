package com.example.xyb5b.cwd;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class Test extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        String button_tag=getIntent().getStringExtra(MainActivity.BUTTON_TAG);
        if(findViewById(R.id.menu_container) != null && findViewById(R.id.sheet_container) != null) {

            switch (button_tag) {
                case "hunter_harvested":
                    MenuFragment2 mf1 = new MenuFragment2();
                    getFragmentManager().beginTransaction().add(R.id.menu_container, mf1).commit();
                    Log.d("aa","aa");
                    break;
                case "road_kill":
                    MenuFragment2 mf2 = new MenuFragment2();
                    getFragmentManager().beginTransaction().add(R.id.menu_container, mf2).commit();
                    Log.d("aa", "bb");
                    break;
                case "sick_deer":
                    MenuFragment2 mf3 = new MenuFragment2();
                    getFragmentManager().beginTransaction().add(R.id.menu_container, mf3).commit();
                    Log.d("aa", "cc");
                    break;
                case "targeted_harvest":
                    MenuFragment2 mf4 = new MenuFragment2();
                    getFragmentManager().beginTransaction().add(R.id.menu_container, mf4).commit();
                    Log.d("aa", "dd");
                    break;
            }
            Deer_Collector_Fragment dcf=new Deer_Collector_Fragment();
            //Deer_Location_Fragment dlf=new Deer_Location_Fragment();
            getFragmentManager().beginTransaction().add(R.id.sheet_container,dcf).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
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
