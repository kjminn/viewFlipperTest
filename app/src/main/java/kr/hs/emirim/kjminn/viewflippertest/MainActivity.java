package kr.hs.emirim.kjminn.viewflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{
    ViewFlipper viewFlip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this);
        viewFlip=(ViewFlipper)findViewById(R.id.view_flip);
        viewFlip.setOnTouchListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.but_prev:
                viewFlip.showPrevious();
                break;
            case R.id.but_next:
                viewFlip.showNext();
                break;
        }

    }

    /**
     * Called when a touch event is dispatched to a view. This allows listeners to
     * get a chance to respond before the target view.
     *
     * @param v     The view the touch event has been dispatched to.
     * @param event The MotionEvent object containing full information about
     *              the event.
     * @return True if the listener has consumed the event, false otherwise.
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        viewFlip.showNext();
        return true;
    }
}
