package digi.coders.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.udojava.evalex.Expression;



public class MainActivity extends AppCompatActivity {

    TextView edtText,txtResult;
    String Data;
    private String expression = "";

    CardView cardClear,cardModule,cardMul,cardDiv,card7,card8,card9,cardMulti;
    CardView card4,card5,card6,cardMai,card1,card2,card3,cardSum,card00,card0,cardDat,cardEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtText=findViewById(R.id.edtText);
        txtResult=findViewById(R.id.txtResult);
        cardClear=findViewById(R.id.cardClear);
        cardModule=findViewById(R.id.cardModule);
        cardMul=findViewById(R.id.cardMul);
        cardDiv=findViewById(R.id.cardDiv);
        card7=findViewById(R.id.card7);
        card8=findViewById(R.id.card8);
        card9=findViewById(R.id.card9);
        cardMulti=findViewById(R.id.cardMulti);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        cardMai=findViewById(R.id.cardMai);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        cardSum=findViewById(R.id.cardSum);
        card00=findViewById(R.id.card00);
        card0=findViewById(R.id.card0);
        cardDat=findViewById(R.id.cardDat);
        cardEqual=findViewById(R.id.cardEqual);



        cardModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"%");

            }
        });

        cardDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"/");
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"7");
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"8");
            }
        });
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"9");
            }
        });
        cardMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"*");
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"4");
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"5");
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"6");
            }
        });
        cardMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"-");
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"1");
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"2");
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"3");
            }
        });
        cardSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"+");
            }
        });
        card00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"00");
            }
        });
        card0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+"0");
            }
        });
        cardDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data=edtText.getText().toString();
                edtText.setText(Data+".");
            }
        });
        cardEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = edtText.getText().toString();
                edtText.setText(data + "=");
            }
        });

        cardEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eq = edtText.getText().toString();

                try {
                    Expression expression = new Expression(eq);
                    String ans = expression.eval(false).toString();
                    txtResult.setText(ans);
                } catch (Exception e) {
                    txtResult.setText("Error");
                }
            }
        });
        cardClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtText.setText("");
                txtResult.setText("");
            }
        });
        cardMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  try {
                      String num=edtText.getText().toString();
                      String number=num.substring(0,num.length()-1);
                      edtText.setText(number);

                  }catch (Exception e){

                  }
            }
        });

    }


}