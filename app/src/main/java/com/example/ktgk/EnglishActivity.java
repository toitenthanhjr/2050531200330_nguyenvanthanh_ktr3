package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<English> arrayBaiHat;
    EnglishAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        adapter = new EnglishAdapter(this, R.layout.layoutbaihat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myIntent = new Intent(EnglishActivity.this, a_english1.class);
                    startActivity(myIntent);
                }
                if(position==1){
                    Intent myIntent = new Intent(EnglishActivity.this, b_english2.class);
                    startActivity(myIntent);
                }
                if(position==2){
                    Intent myIntent = new Intent(EnglishActivity.this, c_english3.class);
                    startActivity(myIntent);
                }
                if(position==3){
                    Intent myIntent = new Intent(EnglishActivity.this, d_english4.class);
                    startActivity(myIntent);
                }
                if(position==4){
                    Intent myIntent = new Intent(EnglishActivity.this, e_english5.class);
                    startActivity(myIntent);
                }
                if(position==5){
                    Intent myIntent = new Intent(EnglishActivity.this, f_english6.class);
                    startActivity(myIntent);
                }
                if(position==6){
                    Intent myIntent = new Intent(EnglishActivity.this, g_english7.class);
                    startActivity(myIntent);
                }
                if(position==7){
                    Intent myIntent = new Intent(EnglishActivity.this, h_english8.class);
                    startActivity(myIntent);
                }
                if(position==8){
                    Intent myIntent = new Intent(EnglishActivity.this, i_english9.class);
                    startActivity(myIntent);
                }
                if(position==9){
                    Intent myIntent = new Intent(EnglishActivity.this, j_english10.class);
                    startActivity(myIntent);
                }

            }
        });
    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new English("Th?? hi???n t???i ????n", "S + am/is/are + O",R.drawable.english1));
        arrayBaiHat.add(new English("Th?? qu?? kh??? ho??n th??nh", "S + v_ed + O",R.drawable.english2));
        arrayBaiHat.add(new English("Th?? t????ng lai ????n", "S + was/were + O",R.drawable.english3));
        arrayBaiHat.add(new English("Th?? hi???n t???i ti???p di???n ", "S + will/shall + have + O",R.drawable.english4));
        arrayBaiHat.add(new English("Th?? hi???n t???i ho??n th??nh", "S + had + v_ed + O",R.drawable.english5));
        arrayBaiHat.add(new English("Th?? qu?? kh??? ????n", "S + have/has + O",R.drawable.english6));
        arrayBaiHat.add(new English("Th?? qu?? kh??? ti???p di???n", "S + am/is/are + O",R.drawable.english7));
        arrayBaiHat.add(new English("Th?? t????ng lai ti???p di???n", "S + was/were + O",R.drawable.english8));
        arrayBaiHat.add(new English("Th?? t????ng lai ho??n th??nh ", "S + will/shall + have + O",R.drawable.english9));
        arrayBaiHat.add(new English("Th?? qu?? kh??? ho??n th??nh", "S + have/has + O",R.drawable.english1));
    }


}
