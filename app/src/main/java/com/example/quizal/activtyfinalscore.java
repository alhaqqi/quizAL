package com.example.quizal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class activtyfinalscore extends AppCompatActivity {

    private TextView result;
    private TextView txscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_activtyfinalscore);

        String score = getIntent().getExtras().getString("score");
        result = findViewById(R.id.txscore);
        result.setText(score);
    }
}