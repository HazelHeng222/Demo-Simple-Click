package sg.edu.ep.c346.id20029318.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button butDisplay;
    TextView txtMsg;
    EditText edTxt;
    ToggleButton togEnable;
    RadioGroup radGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link Java w UI
        butDisplay = findViewById(R.id.buttonDisplay);
        txtMsg = findViewById(R.id.textViewDisplay);
        edTxt = findViewById(R.id.editTextTextPersonName);
        togEnable = findViewById(R.id.toggleButton);
        radGender = findViewById(R.id.rgGender);

        //behaviour
        butDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edTxt.getText().toString();
                txtMsg.setText(text);

                int id = radGender.getCheckedRadioButtonId();
                if (id == R.id.radioButtonGenderFemale){
                    text = "She said " + text;
                } else if (id ==R.id.radioButtonGenderMale){
                    text = "He said " + text;
                }
                txtMsg.setText(text);


                Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();
            }

        });
        togEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (togEnable.isChecked() == true){
                    edTxt.setEnabled(true);
                    edTxt.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    edTxt.setEnabled(false);
                    edTxt.setBackgroundColor(Color.RED);
                }
            }
        });

    }



}
