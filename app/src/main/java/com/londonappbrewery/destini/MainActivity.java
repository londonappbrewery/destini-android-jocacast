package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex == 1 || mIndex == 2){
                    mIndex = 3;
                    updateStory( mIndex);
                }else if (mIndex == 3){
                    mIndex = 6;
                    updateStory( mIndex);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex == 1){
                    mIndex = 2;
                    updateStory(mIndex);
                }else if(mIndex == 2){
                    mIndex = 4;
                    updateStory(mIndex);
                }else if (mIndex == 3 ) {
                    mIndex = 5;
                    updateStory(mIndex);
                }
            }
        });

    }

    public void updateStory(int storyIndex){
        if(storyIndex == 2){
            mTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        }else if(storyIndex == 3){
            mTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        }else if (storyIndex == 4){
            mTextView.setText(R.string.T4_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }else if (storyIndex == 5){
            mTextView.setText(R.string.T5_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }else if (storyIndex == 6){
            mTextView.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }

}
