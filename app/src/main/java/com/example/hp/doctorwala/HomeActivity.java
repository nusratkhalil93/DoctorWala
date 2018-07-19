package com.example.hp.doctorwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

Button btnDoc1,btnDoc2,btnDoc3,btnDoc4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDoc1=findViewById(R.id.btn_doc1);
        btnDoc2=findViewById(R.id.btn_doc2);
        btnDoc3=findViewById(R.id.btn_doc3);
        btnDoc4=findViewById(R.id.btn_doc4);

        btnDoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("doc_name","one");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnDoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("doc_name","two");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnDoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("doc_name","three");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnDoc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("doc_name","four");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
