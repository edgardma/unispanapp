package com.example.miguel_pc.unispanproyect.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.miguel_pc.unispanproyect.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton = (Button)findViewById(R.id.btnIngresar);
        //final TextView registroLink = (TextView) findViewById(R.id.txtRegistrarAqui);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.txtUsuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.txtPassword)).getText().toString();

                if(usuario.equals("admin") && password.equals("admin") )
                {
                    Intent nuevoForm = new Intent(Login.this, MenuActivity.class);
                    startActivity(nuevoForm);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña incorrecta",Toast.LENGTH_SHORT).show();
                }
            }
        });

      //  registroLink.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View v) {
         //       Intent RegistroIntent = new Intent(Login.this,Registro.class);
          //      Login.this.startActivity(RegistroIntent);

         //   }
       // });


    }
}
