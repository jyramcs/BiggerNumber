package com.example.biggernumber;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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


    int num,num2;

    public void initial_startup(View view)
    {
        TextView tv=this.findViewById(R.id.button);
        TextView tv2=this.findViewById(R.id.button2);

        Random r = new Random();
        num = r.nextInt(100);
        num2 = r.nextInt(100);
        tv.setText(Integer.toString(num));
        tv2.setText(Integer.toString(num2));
    }

    int score=0;

    public void bigger_clicked(View view)
    {
        TextView tv3=this.findViewById(R.id.textView1);
        TextView tv4=this.findViewById(R.id.scoreField);

        if (view.getId() == R.id.button) {
            if (num > num2) {
                tv3.setText("Congratulations");
                score++;
                //correct so "congratulations"
            }else {
                tv3.setText("Incorrect");
            }
        }else if (view.getId() == R.id.button2){
            if (num2>num){
                tv3.setText("Congratulations");
                score++;
                //correct so "congratulations"
            }else{
                tv3.setText("Incorrect");
            }
        }
        tv4.setText(Integer.toString(score));
    }
}
