package com.example.mylayoutsactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class A1 extends AppCompatActivity {

    private Spinner spinner;
    private RadioButton r1, r2;
    private Button btnVerificarRadioButtons;

    final String[] datos = new String[]{"Elige Una Opcion","Elemento1", "Elemento2"};

    private void validarRadioButtons() {
        String cad = "Seleccionado: \n";
        if (r1.isChecked()) {
            cad += "Opcion1\n";
        }
        if (r2.isChecked()) {
            cad += "Opcion2\n";
        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button=findViewById(R.id.button);
//        Button botonA1= findViewById(R.id.button);
//        Button botonA6= findViewById(R.id.button6);

        Button botonA7 = findViewById(R.id.button7);
        spinner = findViewById(R.id.spinner);

        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        btnVerificarRadioButtons = findViewById(R.id.btnVerificarRadioButtons);

        btnVerificarRadioButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnVerificarRadioButtons) ;
                validarRadioButtons();
            }
        });

        botonA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                share.putExtra(Intent.EXTRA_SUBJECT, "Night Movies");
                share.putExtra(Intent.EXTRA_TEXT, "https://www.netflix.com");
                startActivity(Intent.createChooser(share, "Compartir Enlace"));
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, datos);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener
                (new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (position==1){
                            Intent intent = new Intent(getApplicationContext(), A2.class);
                            startActivity(intent);
                        }
                        if (position==2){
                            Intent intent = new Intent(getApplicationContext(), A3.class);
                            startActivity(intent);
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        //textView.setText("");
                    }
                });

        //        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(A1.this,"A2",Toast.LENGTH_SHORT).show();
//            }
//        });
//   Si se presiona el boton1 se va al activity2
//        botonA1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pasarA2=new Intent(A1.this,A2.class);
//                startActivity(pasarA2);
//            }
//        });
//   Si se presiona el boton2 se va al activity3
//        Button botonA2= findViewById(R.id.button2);
//        botonA2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pasarA3=new Intent(A1.this,A3.class);
//                startActivity(pasarA3);
//                Intent share=new Intent(Intent.ACTION_SEND);
//                share.setType("text/plain");
//                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
//
//                share.putExtra(Intent.EXTRA_SUBJECT,"Pizza Time");
//                share.putExtra(Intent.EXTRA_TEXT,"https://www.netflix.com/es/title/80014749");
//                startActivity(Intent.createChooser(share,"Compartir Enlace"));
//            }
//        });
//        botonA6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri gmmIntentUri=Uri.parse("geo:37.7749,-122.4194");
//                Intent mapIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                if(mapIntent.resolveActivity(getPackageManager())!=null){
//                    startActivity(mapIntent);
//                }
//            }
//        });
        // verifica si la opcion esta marcada
//        radioGroup = findViewById(R.id.gruporb);
//        radioGroup.clearCheck(); // desmarca las opciones
//        radioGroup.check(R.id.radio1); // marca una opcion determinada
//        int idSeleccionado = radioGroup.getCheckedRadioButtonId(); // devuelve el id de la opcion
//
//        textView = findViewById(R.id.textView);
//        radioGroup = findViewById(R.id.gruporb);
//
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                textView.setText("ID opcion selecionada:" + checkedId);
//            }
//        });
        //   Si se presiona el boton3 se va al activity4
//        Button botonA3= findViewById(R.id.button3);
//        botonA3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pasarA4=new Intent(A1.this,A4.class);
//                startActivity(pasarA4);
//            }
//        });
//
    }
//    public void selectionLayouts(View m){
//        switch(m.getTag().toString()){
//            case 1
//        }
//    }
}
