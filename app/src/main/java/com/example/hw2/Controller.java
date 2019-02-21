package com.example.hw2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.blue;
import static android.graphics.Color.green;
import static android.graphics.Color.red;
import static android.graphics.Color.rgb;

/**
 * Controller class will be used to handle events.
 * @author Gabe Marcial
 * @version 20 February 2019
 */
public class Controller implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    private TextView drawingElement;
    private TextView redValue;
    private TextView greenValue;
    private TextView blueValue;
    private SeekBar redSeekBar;
    private SeekBar blueSeekbar;
    private SeekBar greenSeekbar;
    private CustomElement myElement;
    private customDrawing mySurfaceView;
    private int red;
    private int blue;
    private int green;

    /** This controller object requires four textview objects, three seekbar objects
     * and a surface view object. Initializes instance variables and
     * registers the object with there corresponding listeners.
     * @param current This textview refers to the name of the last touched element in the surfaceview.
     * @param redText The textview that displays the red color value.
     * @param greenText The textview that displays the green color value.
     * @param blueText The textview that displays the blue color value.
     * @param red The red seekbar.
     * @param green The green seekbar.
     * @param blue The blue seekbar.
     * @param ms A customDrawing object.
     */
    public Controller(TextView current, TextView redText, TextView greenText, TextView blueText, SeekBar red, SeekBar green,
                      SeekBar blue, customDrawing ms){
        /*setting values to my instance variables*/
        this.drawingElement = current;
        this.redValue = redText;
        this.greenValue = greenText;
        this.blueValue = blueText;
        this.redSeekBar = red;
        this.greenSeekbar = green;
        this.blueSeekbar = blue;
        this.mySurfaceView = ms;

        /*registering seekbar and surfaceview objects*/
        redSeekBar.setOnSeekBarChangeListener(this);
        greenSeekbar.setOnSeekBarChangeListener(this);
        blueSeekbar.setOnSeekBarChangeListener(this);
        ms.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event){
        int xTouch = (int)event.getX();
        int yTouch = (int)event.getY();

        /*if case for tree leaves*/
        if(mySurfaceView.treeLeaves.containsPoint(xTouch,yTouch)){
            myElement = mySurfaceView.treeLeaves;
            drawingElement.setText(mySurfaceView.treeLeaves.getName());

            /*getting the RGB values to display in textviews and progress bar to match*/
            red = red(mySurfaceView.treeLeaves.getColor());
            green = green(mySurfaceView.treeLeaves.getColor());
            blue = blue(mySurfaceView.treeLeaves.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

        /*if case for tree trunk*/
        if(mySurfaceView.treeTrunk.containsPoint(xTouch,yTouch-160)){
            myElement = mySurfaceView.treeTrunk;
            drawingElement.setText(mySurfaceView.treeTrunk.getName());

            red = red(mySurfaceView.treeTrunk.getColor());
            green = green(mySurfaceView.treeTrunk.getColor());
            blue = blue(mySurfaceView.treeTrunk.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

        /*if case for snowman head*/
        if(mySurfaceView.snowmanHead.containsPoint(xTouch,yTouch)){
            myElement = mySurfaceView.snowmanHead;
            drawingElement.setText(mySurfaceView.snowmanHead.getName());

            red = red(mySurfaceView.snowmanHead.getColor());
            green = green(mySurfaceView.snowmanHead.getColor());
            blue = blue(mySurfaceView.snowmanHead.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

        /*if case for snowman body*/
        if(mySurfaceView.snowmanBody.containsPoint(xTouch,yTouch-150)){
            myElement = mySurfaceView.snowmanBody;
            drawingElement.setText(mySurfaceView.snowmanBody.getName());

            red = red(mySurfaceView.snowmanBody.getColor());
            green = green(mySurfaceView.snowmanBody.getColor());
            blue = blue(mySurfaceView.snowmanBody.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

        /*if case for housebase*/
        if(mySurfaceView.houseBase.containsPoint(xTouch,yTouch)){
            myElement = mySurfaceView.houseBase;
            drawingElement.setText(mySurfaceView.houseBase.getName());

            red = red(mySurfaceView.houseBase.getColor());
            green = green(mySurfaceView.houseBase.getColor());
            blue = blue(mySurfaceView.houseBase.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

        /*if case for door*/
        if(mySurfaceView.door.containsPoint(xTouch,yTouch)){
            myElement = mySurfaceView.door;
            drawingElement.setText(mySurfaceView.door.getName());

            red = red(mySurfaceView.door.getColor());
            green = green(mySurfaceView.door.getColor());
            blue = blue(mySurfaceView.door.getColor());

            redValue.setText("Red: "+red);
            greenValue.setText("Green: "+green);
            blueValue.setText("Blue: "+blue);

            redSeekBar.setProgress(red);
            greenSeekbar.setProgress(green);
            blueSeekbar.setProgress(blue);
        }

       return true; //returns true unconditionally
    }
    /**
     External Citation
        Date: 19 February 2019
        Problem: Did not know how to access individual RGB values for a given color of an element.
        Resource:
            https://developer.android.com/reference/android/graphics/Color
        Solution: I imported the necessary resources for the color class and red(int), green(int),
            and blue(int) methods to extract the specific color components and be able to set the
            textview and progressbar to that specific color value.
     */

    @Override
    public void onClick(View v) {
        drawingElement.setText("no current drawing element selected");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        /* if case for tree leaves */
        if(mySurfaceView.treeLeaves == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.treeLeaves.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }

        /* if case for tree trunk */
        if(mySurfaceView.treeTrunk == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.treeTrunk.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }

        /* if case for the snow man head*/
        if(mySurfaceView.snowmanHead == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.snowmanHead.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }

        /* if case for snowman body */
        if(mySurfaceView.snowmanBody == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.snowmanBody.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }

        /*if case for houseBase*/
        if(mySurfaceView.houseBase == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.houseBase.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }

        /*if case for house door */
        if(mySurfaceView.door == myElement && fromUser == true) {
            if (seekBar == redSeekBar) {
                redValue.setText("Red: " + progress);
                red = progress;

            }
            if (seekBar == greenSeekbar) {
                greenValue.setText("Green: " + progress);
                green = progress;
            }
            if (seekBar == blueSeekbar) {
                blueValue.setText("Blue: " + progress);
                blue = progress;
            }
            mySurfaceView.door.setColor(rgb(red,green,blue));
            mySurfaceView.invalidate();
        }
    }
    /**
     External Citation
        Date: 20 February 2019
        Problem: I did not know how to set the general color value from the three individual
            color component values (red, green, blue).
        Resource:
            https://developer.android.com/reference/android/graphics/Color
        Solution: I used the color class android SDK again to find a useful method of combining
            all color components into what I needed for the setColor method in the CustomElement
            class.
     */

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) { /*ignore*/}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) { /*ignore*/}
}
