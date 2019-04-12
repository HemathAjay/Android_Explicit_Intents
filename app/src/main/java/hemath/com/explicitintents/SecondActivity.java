package hemath.com.explicitintents;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class SecondActivity extends AppCompatActivity {

    Button B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extra = getIntent().getExtras();
        String value = extra.getString("V1");
        Toast.makeText(getApplicationContext(), "Value = "+value,Toast.LENGTH_SHORT).show();

        B2 = (Button) findViewById(R.id.button_2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}
