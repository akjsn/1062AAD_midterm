package edu.ntut.user.myhw3;

/**
 * Created by user on 2018/3/20.
 */

public class letterGrade {

    public String doGrade(int score) {

        String strGrade = "Grade： ";

        if (score>=90 && score<=100) strGrade += "A";
        else if (score>=80 && score<=100) strGrade+= "B";
        else if (score>=70 && score<=100) strGrade+= "C";
        else if (score>=60 && score<=100) strGrade+= "D";
        else if (score>=0 && score<=100) strGrade+= "F";
        else strGrade+= "Input score must be from 0 to 100";

        return strGrade;
    }
}
