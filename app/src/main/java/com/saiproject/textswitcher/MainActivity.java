package com.saiproject.textswitcher;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextSwitcher textSwitcher1;
    ImageButton btnNext1;
    ImageButton btnPrev1;

    TextSwitcher textSwitcher2;
    ImageButton btnNext2;
    ImageButton btnPrev2;

    TextSwitcher textSwitcher3;
    ImageButton btnNext3;
    ImageButton btnPrev3;


    String[] stringValues1 = {"hI mY NaMe iS hUh?", "mY nAmE Is WHaT?"};
    String[] stringValues2 = {"mY Name is hMM?", "My NaME is"};
    String[] stringValues3 = {"Chikachika", "Slim Shady"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textSwitcher1 = findViewById(R.id.txtSwitcher1);
        btnNext1 = findViewById(R.id.btnNext1);
        btnPrev1 = findViewById(R.id.btnPrev1);

        textSwitcher2 = findViewById(R.id.txtSwitcher2);
        btnNext2 = findViewById(R.id.btnNext2);
        btnPrev2 = findViewById(R.id.btnPrev2);

        textSwitcher3 = findViewById(R.id.txtSwitcher3);
        btnNext3 = findViewById(R.id.btnNext3);
        btnPrev3 = findViewById(R.id.btnPrev3);


        setAnimation(new TextSwitcher[]{textSwitcher1, textSwitcher2, textSwitcher3});
        addTexts(stringValues1, textSwitcher1);
        addTexts(stringValues2, textSwitcher2);
        addTexts(stringValues3, textSwitcher3);


        btnPrev1.setOnClickListener(this);
        btnNext1.setOnClickListener(this);
        btnPrev2.setOnClickListener(this);
        btnNext2.setOnClickListener(this);
        btnPrev3.setOnClickListener(this);
        btnNext3.setOnClickListener(this);


    }

    /*Sets Animation to textSwitcher*/

    private void setAnimation(TextSwitcher[] textSwitchers) {

        for (TextSwitcher textSwitcher : textSwitchers) {

            textSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
            textSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));

        }
    }




    /* Adds stringValues to the textSwitcher */

    private void addTexts(String[] stringValues, TextSwitcher textSwitcher) {

        for (String string : stringValues) {

            TextView textView = new TextView(this);
            textView.setText(string);
            textView.setTextSize(50);
            textView.setTextColor(Color.WHITE);
            textSwitcher.addView(textView);


        }
    }




    /* Set on Click events for all the buttons */

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnPrev1:
                textSwitcher1.showPrevious();
                break;

            case R.id.btnNext1:
                textSwitcher1.showNext();
                break;

            case R.id.btnPrev2:
                textSwitcher2.showPrevious();
                break;

            case R.id.btnNext2:
                textSwitcher2.showNext();
                break;

            case R.id.btnPrev3:
                textSwitcher3.showPrevious();
                break;

            case R.id.btnNext3:
                textSwitcher3.showNext();
                break;


        }


    }
}
