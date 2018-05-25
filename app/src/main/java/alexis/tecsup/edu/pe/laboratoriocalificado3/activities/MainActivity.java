package alexis.tecsup.edu.pe.laboratoriocalificado3.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import alexis.tecsup.edu.pe.laboratoriocalificado3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void gotoLogin(View view){

        startActivity(new Intent(this, Bienvenido.class));
        finish();

    }

}