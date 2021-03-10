package com.example.quizal;

public class questios {
    private String mQuestions[] = {
            "5 x 2? ",
            "5 x 5? ",
            "5 x 6? ",
            "2 x 2? ",
            "4 x 4? "

    };

    private  String mChoices[][]= {
            {"10", "9", "22", "100"},
            {"23", "10", "25", "23"},
            {"3", "12", "32", "30"},
            {"4", "8", "7", "6"},
            {"7", "16", "7", "9"}
    };

    private String mCorrectAnswer[] = {
            "10", "25", "30", "4","16"
    };

    public int getLength(){
        return mQuestions.length;
    }

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0 = mChoices[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
