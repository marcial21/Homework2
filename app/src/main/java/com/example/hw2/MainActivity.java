package com.example.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * MainActivity is the main class for this program.
 * @author Gabe Marcial
 * @version 20 February 2019
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Getting a reference to my GUI objects*/
        customDrawing mySurfaceView = findViewById(R.id.surfaceView);
        TextView drawingElement = findViewById(R.id.drawingElementName);
        TextView redValue = findViewById(R.id.RedText);
        TextView greenValue = findViewById(R.id.GreenText);
        TextView blueValue = findViewById(R.id.blueText);
        SeekBar redSeekBar = findViewById(R.id.redSeekbar);
        SeekBar greenSeekBar = findViewById(R.id.greenSeekbar);
        SeekBar blueSeekBar = findViewById(R.id.blueSeekbar);

        Controller myController = new Controller(drawingElement, redValue, greenValue, blueValue, redSeekBar,
                greenSeekBar, blueSeekBar, mySurfaceView);

        /*registering the controller object made above*/
        redSeekBar.setOnSeekBarChangeListener(myController);
        blueSeekBar.setOnSeekBarChangeListener(myController);
        greenSeekBar.setOnSeekBarChangeListener(myController);
        mySurfaceView.setOnTouchListener(myController);
    }
}
