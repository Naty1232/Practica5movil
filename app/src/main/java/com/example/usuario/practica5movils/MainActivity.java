package com.example.usuario.practica5movils;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.opcionLogin:

                //se agrega dialogo en un item del menu
                Dialog dialogoLogin=new Dialog(MainActivity.this);
                dialogoLogin.setContentView(R.layout.dlg_login);
                Button botonAutenticar=(Button)dialogoLogin.findViewById(R.id.btnAutenticar);
                final EditText cajaUsuario=(EditText)dialogoLogin.findViewById(R.id.txtUser);
                final EditText cajaClave=(EditText)dialogoLogin.findViewById(R.id.txtPassword);
                botonAutenticar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       Toast.makeText(MainActivity.this,cajaUsuario.getText().toString()+ " "+cajaClave.getText().toString(),Toast.LENGTH_SHORT).show();


                    }
                });

                dialogoLogin.show();

                break;
            case R.id.opcionRegistrar:


                break;
        }
        return true;

}
}
