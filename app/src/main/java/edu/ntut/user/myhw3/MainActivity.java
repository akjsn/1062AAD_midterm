package edu.ntut.user.myhw3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText score;
    private Button mBtnOK;
    private TextView mTxtGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score= (EditText) findViewById(R.id.editScore);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        mTxtGrade= findViewById(R.id.txtGrade);
        mBtnOK.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            letterGrade ms = new letterGrade();
            int s=Integer.parseInt(score.getText().toString());
            mTxtGrade.setText(ms.doGrade(s));
        }
    };
}
