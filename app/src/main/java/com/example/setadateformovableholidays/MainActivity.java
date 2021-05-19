package com.example.setadateformovableholidays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import android.widget.ArrayAdapter;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Spinner holidays,years;
    int year0;
    ImageButton imgbtnc,imgbtne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializecomponents();
    }

    private void initializecomponents(){
        holidays=findViewById(R.id.sh);
        years=findViewById(R.id.sy);
        imgbtnc=findViewById(R.id.imgbtnc);
        imgbtne=findViewById(R.id.imgbtne);

        List<String> list = new ArrayList<String>();
        list.add("All");
        list.add("Feast of the Baptism of the Lord");
        list.add("The number of carnival days");
        list.add("Fat Thursday");
        list.add("Shrovetide, \"herring\"");
        list.add("Ash Wednesday");
        list.add("Palm Sunday");
        list.add("The Solemnity of the Lord's Resurrection");
        list.add("The Solemnity of Divine Mercy");
        list.add("The Ascension of the Lord");
        list.add("The Solemnity of Pentecost");
        list.add("Feast of the Blessed Virgin Mary, Mother of the Church");
        list.add("Feast of Jesus Christ, the High and Eternal Priest");
        list.add("Solemnity of the Holy Trinity");
        list.add("Solemnity of Corpus Christi");
        list.add("Solemnity of the Sacred Heart of Jesus");
        list.add("Immaculate Heart of the Blessed Virgin Mary");
        list.add("The Solemnity of Jesus Christ, King of the Universe");
        list.add("Feast of the Holy Family");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holidays.setAdapter(dataAdapter);

        List<String> list2 = new ArrayList<String>();
        for(int i=30;i<3000;i++) list2.add(Integer.toString(i));
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list2);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        years.setAdapter(dataAdapter2);
        years.setSelection(Calendar.getInstance().get(Calendar.YEAR)-30);

        imgbtnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
        imgbtne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void calculate(){
        Intent i = new Intent(this, Result.class);
        year0=Integer.parseInt(years.getSelectedItem().toString());
        i.putExtra("year", year0);
        switch (String.valueOf(holidays.getSelectedItem())) {
            case "All":
                i.putExtra("option", 0);
                break;
            case "Feast of the Baptism of the Lord":
                i.putExtra("option", 1);
                break;
            case "The number of carnival days":
                i.putExtra("option", 2);
                break;
            case "Fat Thursday":
                i.putExtra("option", 3);
                break;
            case "Shrovetide, \"herring\"":
                i.putExtra("option", 4);
                break;
            case "Ash Wednesday":
                i.putExtra("option", 5);
                break;
            case "Palm Sunday":
                i.putExtra("option", 6);
                break;
            case "The Solemnity of the Lord's Resurrection":
                i.putExtra("option", 7);
                break;
            case "The Solemnity of Divine Mercy":
                i.putExtra("option", 8);
                break;
            case "The Ascension of the Lord":
                i.putExtra("option", 9);
                break;
            case "The Solemnity of Pentecost":
                i.putExtra("option", 10);
                break;
            case "Feast of the Blessed Virgin Mary, Mother of the Church":
                i.putExtra("option", 11);
                break;
            case "Feast of Jesus Christ, the High and Eternal Priest":
                i.putExtra("option", 12);
                break;
            case "Solemnity of the Holy Trinity":
                i.putExtra("option", 13);
                break;
            case "Solemnity of Corpus Christi":
                i.putExtra("option", 14);
                break;
            case "Solemnity of the Sacred Heart of Jesus":
                i.putExtra("option", 15);
                break;
            case "Immaculate Heart of the Blessed Virgin Mary":
                i.putExtra("option", 16);
                break;
            case "The Solemnity of Jesus Christ, King of the Universe":
                i.putExtra("option", 17);
                break;
            case "Feast of the Holy Family":
                i.putExtra("option", 18);
                break;
            default:
                break;
        }
        startActivity(i);
    }
}
