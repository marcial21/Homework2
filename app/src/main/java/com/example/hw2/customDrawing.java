package com.example.hw2;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * customDrawing will be my surface view class that will provide
 * the drawing on the surface view and create customElement objects.
 * @author Gabe Marcial
 * @version 20 February 2019
 */
public class customDrawing extends SurfaceView {

    protected CustomRect houseBase = new CustomRect("House Base", 0xFF3fa4d3, 200,400,500,700);
    protected CustomRect secondStory = new CustomRect("Second Story",0xFFd17112, 200,200,500,400);
    protected CustomRect stripe = new CustomRect("Stripe", 0xFF000000, 340, 400,360,700);
    protected CustomRect treeTrunk = new CustomRect("Tree Trunk", 0xFF5b3030, 1200, 300, 1300, 700);
    protected CustomRect door = new CustomRect("House door", 0xFF9e1919, 300, 550, 400, 700);
    protected CustomRect hatBase = new CustomRect("Hat base", 0xFF000000, 800,270,900,290);
    protected CustomRect hatTop = new CustomRect("Hat top", 0xFF000000, 815,210,885,270);

    protected CustomCircle snowmanBody = new CustomCircle("Snow man body", 0xFFFFFFFF, 850, 600, 150);
    protected CustomCircle snowmanHead = new CustomCircle("Snow man head", 0xFFFFFFFF, 850, 400, 120);
    protected CustomCircle snowmanRightEye = new CustomCircle("Right eye", 0xFF2767ce, 910, 400, 10);
    protected CustomCircle snowmanLefttEye = new CustomCircle("Left eye", 0xFF2767ce, 790, 400, 10);
    protected CustomCircle button1 = new CustomCircle("Button1", 0xFF000000, 850, 540, 8);
    protected CustomCircle button2 = new CustomCircle("Button2", 0xFF000000, 850, 580, 8);
    protected CustomCircle button3 = new CustomCircle("Button3", 0xFF000000, 850, 620, 8);
    protected CustomCircle treeLeaves = new CustomCircle("Tree leaves", 0xFF3baa2c,1250, 325, 135);
    protected CustomCircle doorKnob = new CustomCircle("Door knob", 0xFFe5c910, 375, 625, 5);


    public customDrawing(Context context) {
        super(context);
        init();
    }

    public customDrawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public customDrawing(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setWillNotDraw(false);
        /*
        yellowPaint.setColor(0xFFe5c910);
        greenPaint.setColor(0xFF3baa2c);
        brownPaint.setColor(0xFF5b3030);
        redPaint.setColor(0xFF9e1919);
        bluePaint.setColor(0xFF3fa4d3);
        orangePaint.setColor(0xFFd17112);
        whitePaint.setColor(0xFFFFFFFF);
        */
    }
    /**
     External Citation
        Date: 17 February 2019
        Problem: I needed the code from lecture regarding the surfaceView parent class and
            what to put on the constructors.
        Resource:
            Week 3: SurfaceViewExample.zip File
        Solution: I copied the code from the beefJerky.java file in this folder in this
            class but changed the name from beefJerky to customDrawing.
     */

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(0xFF87ceeb); //set canvas to sky blue.

        houseBase.drawMe(canvas);
        secondStory.drawMe(canvas);
        stripe.drawMe(canvas);
        snowmanBody.drawMe(canvas);
        snowmanHead.drawMe(canvas);
        snowmanLefttEye.drawMe(canvas);
        snowmanRightEye.drawMe(canvas);
        hatBase.drawMe(canvas);
        hatTop.drawMe(canvas);
        button1.drawMe(canvas);
        button2.drawMe(canvas);
        button3.drawMe(canvas);
        treeTrunk.drawMe(canvas);
        treeLeaves.drawMe(canvas);
        door.drawMe(canvas);
        doorKnob.drawMe(canvas);
    }
    /**
     External Citation
        Date: 17 February 2019
        Problem: My surface view was not displaying my drawing when running the program.
        Resource:
            Dr. Nuxoll
        Solution: I added the alpha values in the hex number when setting the color of
            the customElement objects.
     */
}
