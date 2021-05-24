package pl.edu.ug.konwerter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickMethod(View view) {
        EditText money = findViewById(R.id.moneyEditText);

        Log.i("wpisano liczbe", money.getText().toString());

        double d = Double.parseDouble(money.getText().toString());
        d=d/5.22;

        String s=String.valueOf(d);

        Toast.makeText(this, "£ " + s, Toast.LENGTH_LONG).show();

    }
}