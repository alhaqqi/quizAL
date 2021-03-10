package com.example.quizal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answer1, answer2, answer3, answer4;
    private TextView jumlahsoal, question, score;

    private questios mQuestions = new questios();

    private String mAnswer;
    private int mscore = 0;
    private int jmlsoal = 0;
    private int mQuestionsNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        jumlahsoal = (TextView) findViewById(R.id.jumlahsoal);
        question = (TextView) findViewById(R.id.question);
        updateQuestion();

        updatescore(mscore);
        updatejumlahsoal(jmlsoal);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mAnswer) {
                    mscore++;
                    updatescore(mscore);
                    jmlsoal++;
                    updatejumlahsoal(jmlsoal);
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mAnswer) {
                    mscore++;
                    updatescore(mscore);
                    jmlsoal++;
                    updatejumlahsoal(jmlsoal);
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mAnswer) {
                    mscore++;
                    updatescore(mscore);
                    jmlsoal++;
                    updatejumlahsoal(jmlsoal);
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mAnswer) {
                    mscore++;
                    updatescore(mscore);
                    jmlsoal++;
                    updatejumlahsoal(jmlsoal);
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

    }

    private void updateQuestion() {
        if (mQuestionsNumber < mQuestions.getLength()) {
            question.setText(mQuestions.getQuestion(mQuestionsNumber));
            answer1.setText(mQuestions.getChoice(mQuestionsNumber, 1));
            answer2.setText(mQuestions.getChoice(mQuestionsNumber, 2));
            answer3.setText(mQuestions.getChoice(mQuestionsNumber, 3));
            answer4.setText(mQuestions.getChoice(mQuestionsNumber, 4));
            mAnswer = mQuestions.getCorrectAnswer(mQuestionsNumber);
            mQuestionsNumber++;
        } else {
            Toast.makeText(MainActivity.this, "Pertanyaan telah habis", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, activtyfinalscore.class);
            intent.putExtra("score", score.getText().toString());
            startActivity(intent);
        }
    }

    public void updatescore(int point) {
        score.setText("" + mscore * 20);
    }

    public void updatejumlahsoal(int point) {
        jumlahsoal.setText("" + jmlsoal + "/" + mQuestions.getLength());
    }

}