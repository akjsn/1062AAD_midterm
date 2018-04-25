package tw.edu.ntut.csie.app04_105590051;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button s1, s2, s3, s4, s5, s6,s7, s8, s9, s10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = (Button) findViewById(R.id.stu1);
        s1.setOnClickListener(btnstu1OnClick);

        private View.OnClickListener btnstu1OnClick = new View.OnClickListener() {
        
    }


}
