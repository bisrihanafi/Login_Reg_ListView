package bisrihanafi.gmail.login_reg_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivityMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_me);
        //TODO 1 : Mendeklarasikan isi list  title dan sub title
        ListView list;
        String[]maintitle={"Isnanto Budi","Bagas Antuk P.","Puja Laksono","Alfian Adi","Daus Nur"};
        String[]subtitle={"isnantobudi0@gmail.com","bagas.antuk@gmail.com","mplaksana27@gmail.com","adiwalfian22@gmail.com","firdaussnur@gmail.com"};

        //TODO 2 : Mengambil gambar dari sumber daya drawable "meskipun gambarnya semua sama sih"
        Integer[]imgid={
                R.drawable.download_4,
                R.drawable.download_3,
                R.drawable.download_1,
                R.drawable.download_5,
                R.drawable.download_2
        };
        //TODO 3 : Mendeklarasikan objek adapter dari klas MylistAdapter dengan disertai parameter maintitle,subtitle, dan imgid
        MyListAdapter adapter=new MyListAdapter(this,maintitle,subtitle,imgid);

        //TODO 4 : mengaitkan object list dengan komponen list pada layout
        list=(ListView)findViewById(R.id.list);

        //TODO 5 : meng-set adapter list dengan adapter
        list.setAdapter(adapter);

        //TODO 6 : membuat event agar item pada list dapat dipilih/diclick
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //TODO method ini merupana overide OnItemClickListener
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO 7 : program akan menampilkan Toast sesuai dengan item yang dipilih, namun disini hanya sebatas text sderhana
                if(position==0){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Pertama",Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Kedua",Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Ketiga",Toast.LENGTH_SHORT).show();
                }else if(position==3){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Keempat",Toast.LENGTH_SHORT).show();
                }else if(position==4){
                    //codespecifictofirstlistitem
                    Toast.makeText(getApplicationContext(),"Teman Kelima",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
