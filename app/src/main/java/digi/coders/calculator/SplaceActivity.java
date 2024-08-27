package digi.coders.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a=new Intent(SplaceActivity.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        },4000);
    }
}