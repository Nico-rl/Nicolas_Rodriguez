package cl.santotomas.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this,SegundoActivity.class);
        startActivity(siguiente);

    }






}