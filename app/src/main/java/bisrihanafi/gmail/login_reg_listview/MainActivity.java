package bisrihanafi.gmail.login_reg_listview;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //TODO 1 : mendeklarasikan objek
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    EditText t1;
    EditText t2;
    EditText t3;
    EditText t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2 : mengaitkan objek dengan komponen view
        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button5);
        bt4=(Button)findViewById(R.id.button7);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText5);
        t4=(EditText)findViewById(R.id.editText6);
        //TODO 3 : membuat OnClickListener untuk tombol Login dan Registrasi
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        //TODO 3.1 : namun ada masalah di bagian ini karena objek tidak bisa di-setOnClickListener dengan komponen view yang merupakan bagian dari view lannscape layout
        //bt3.setOnClickListener(this);
        //bt4.setOnClickListener(this);
        //TODO 4 : program ini menggunakan setOnClickListener(this) agar lebih mudah mengorganisir komponen
    }
    @Override
    public void onClick(View v) {
        //TODO 5 : didalam onClick dibuat swicth dimana v adalah untuk menentukan tombol mana yang telah diclick
        switch (v.getId()){
            case (R.id.button):
                //TODO 6 : contoh jika tombol yang diklik merupakan komponen tombol dengan id button maka program akan menjalankan baris kode pada case R.id.button
                if ((t1.getText().toString().trim().toLowerCase()).equals("Bisri".toLowerCase()) && (t2.getText().toString().toLowerCase()).equals("165410054".toLowerCase())){
                    //TODO 7 : mengambil nilai dari edit text nama dan passord kemudian menyamakan kedua value tersebut berturut turut dengan nama dan NIM mahasiswa secara HardCode
                    Intent log = new Intent(MainActivity.this, ListActivityMe.class);
                    //TODO 8 : membuat intent untuk menuju aktivity ListActivityMe
                    startActivity(log);
                    //TODO 9 : memulai intent yang membuatnya menjalankan ListActivityMe
                }else {
                    Toast.makeText(getApplicationContext(),"Maaf Nama dan Password tidak benar",Toast.LENGTH_LONG).show();
                }
                break;
            case (R.id.button2):
                //TODO 10 : cara kerja yang hampir sma untuk case lainya
                Intent reg = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(reg);
                break;
        }
    }
}
