package com.bbl.bmerchant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("OPEN BUALUANG APP");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "bualuangmbanking://mbanking.BeMerchantAuthen?Token={Token}";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivityForResult(intent,121);


            }
        });
        setContentView(button);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(getApplicationContext(),"SUMID",Toast.LENGTH_LONG).show();
    }
}
