package fiap.com.br.primeiroaplicativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText        campo1;
    private EditText        campo2;
    private RatingBar       estrelas;
    private SeekBar         volume;
    private CheckBox        caixa;
    private ToggleButton    interruptor;
    private Switch          ligaDesliga;
    private RadioGroup      grupo;
    private Spinner         menu;
    private TextView        valoreSelecioado;
    private Button          botao;
    //lateinit var campo1: Edittext



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.editText2);
        campo2 = findViewById(R.id.editText3);
        estrelas = findViewById(R.id.ratingBar);
        volume = findViewById(R.id.seekBar);
        caixa = findViewById(R.id.checkBox);
        interruptor = findViewById(R.id.toggleButton2);
        ligaDesliga = findViewById(R.id.switch1);
        grupo = findViewById(R.id.radioGroup);
        menu = findViewById(R.id.spinner);
        valoreSelecioado = findViewById(R.id.textView2);
        botao = findViewById(R.id.button);

        estrelas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Estrela selecionada"+ rating,
                        Toast.LENGTH_SHORT).show();
            }
        });


        volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress,
                                          boolean fromUser) {
                valoreSelecioado.setText(""+progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Começou",
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Parou em" + seekBar.getProgress(),
                        Toast.LENGTH_SHORT).show();

            }
        });




        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ratingSlecionado = estrelas.getRating();
                Toast.makeText(MainActivity.this,
                        campo1.getText().toString() + ratingSlecionado,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
