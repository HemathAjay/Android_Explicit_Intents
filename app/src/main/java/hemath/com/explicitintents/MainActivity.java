package hemath.com.explicitintents;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    public static String PACKAGE_NAME;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PACKAGE_NAME = getApplicationContext().getPackageName();

        final Class c = this.getClass();

        b1 = (Button) findViewById(R.id.button_1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent();
                i.setComponent(new ComponentName(PACKAGE_NAME,"hemath.com.explicitintents.SecondActivity"));
                i.putExtra("V1","FROM HOME");
                startActivity(i);
            }
        });
    }
}
