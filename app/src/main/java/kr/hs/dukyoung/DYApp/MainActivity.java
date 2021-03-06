package kr.hs.dukyoung.DYApp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        EditText grade = (EditText)findViewById(R.id.grade_edit);
        EditText stuclass = (EditText)findViewById(R.id.stuclass_edit);

        button.setOnClickListener(view -> {
            String gradetext = grade.getText().toString();
            String stuclasstext = stuclass.getText().toString();
            Toast.makeText(getApplicationContext(),"어서오세요",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),MainViewActivity.class);
            intent.putExtra("gradetext",gradetext);
            intent.putExtra("stuclasstext",stuclasstext);
            startActivity(intent);
        });
    }
}