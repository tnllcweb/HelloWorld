package tw.org.tnllc.helloworld;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView = null;
    private Button button = null;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        textView.setText("GitHub");
        textView.setBackgroundColor(Color.BLUE);

        ButtonListener buttonListener = new ButtonListener();
        button.setOnClickListener(buttonListener);

    }

    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            count++;
            textView.setText(String.valueOf(count));
        }
    }
}
