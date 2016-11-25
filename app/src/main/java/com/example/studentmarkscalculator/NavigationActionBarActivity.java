package com.example.studentmarkscalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.studentmarkscalculator.integration.R;

/* Code modified from class MainActivity3 obtained from https://blackboard.algonquincollege.com/webapps/blackboard/execute/content/file?cmd=view&content_id=_968911_1&course_id=_34969_1 */
/**
 * An Activity with an action bar at the top that lets the user switch between sub-applications.
 */
public class NavigationActionBarActivity extends ActionBarActivity {

    /**
     * Called when the options menu is created; Adds items to the action bar if it is present.
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Called when an action bar item is clicked; switches between sub-applications.
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        switch (id){
            //navbar menu items have been removed.
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Switches to another sub-application.
     * @param c
     */
    private void go(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
