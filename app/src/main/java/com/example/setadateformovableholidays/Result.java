package com.example.setadateformovableholidays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView tv;
    ImageButton imgbtne;
    int year0;
    int option;
    CharSequence buffer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        initializecomponents();
    }

    private void initializecomponents() {
        tv = findViewById(R.id.tv);
        imgbtne=findViewById(R.id.imgbtne);
        imgbtne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        year0 = getIntent().getIntExtra("year", year0);
        option = getIntent().getIntExtra("option", option);
        Easter easter;
        Day day;
        String screen = "";
        switch (option) {
            case 0: {
                day = new Day();
                easter = new Easter();
                screen = screen + "" + "--------------------------------------------------" + "\r\n";
                screen = "Feast of the Baptism of the Lord\r\n\r\n";
                screen = screen + (13 - day.dayOfWeek(6, 1, year0)) + " January " + year0;
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The number of carnival days \t" + year0 + "\r\n\r\n";
                screen = screen + easter.dataldk(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Fat Thursday\r\n\r\n";
                screen = screen + easter.datatc(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Shrovetide, \"herring\"\r\n\r\n";
                screen = screen + easter.datao(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Ash Wednesday\r\n\r\n";
                screen = screen + easter.datasp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Palm Sunday\r\n(Passion Sunday, April Sunday)\r\n\r\n";
                screen = screen + easter.datanmp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The Solemnity of the Lord's Resurrection\r\n(Easter Sunday, Easter, Passover)\r\n\r\n";
                screen = screen + easter.data(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The Solemnity of Divine Mercy\r\n(White Sunday, Guiding Sunday)\r\n\r\n";
                screen = screen + easter.databn(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The Ascension of the Lord\r\n\r\n";
                screen = screen + easter.datawp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The Solemnity of Pentecost\r\n\r\n";
                screen = screen + easter.datazsp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Feast of the Blessed Virgin Mary, Mother of the Church\r\n\r\n";
                screen = screen + easter.datanmpmk(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Feast of Jesus Christ, the High and Eternal Priest\r\n\r\n";
                screen = screen + easter.datajcniwk(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Solemnity of the Holy Trinity\r\n\r\n";
                screen = screen + easter.datatp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Solemnity of Corpus Christi\r\n(Solemnity of the Most Holy Body and Blood of Christ)\r\n\r\n";
                screen = screen + easter.databc(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Solemnity of the Sacred Heart of Jesus\r\n\r\n";
                screen = screen + easter.datanspj(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Immaculate Heart of the Blessed Virgin Mary\r\n\r\n";
                screen = screen + easter.datansnmp(year0);
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "The Solemnity of Jesus Christ, King of the Universe\r\n\r\n";//20-26 November
                screen = screen + (26 - day.dayOfWeek(25, 12, year0)) + " November " + year0;
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "\r\n";
                screen = screen + "Feast of the Holy Family\r\n\r\n";
                if (day.dayOfWeek(25, 12, year0) == 6)
                    screen = screen + "30 December " + year0;
                else
                    screen = screen + (31 - day.dayOfWeek(25, 12, year0)) + " December " + year0;
                screen = screen + "\r\n\r\n" + "--------------------------------------------------" + "";
                break;
            }
            case 1:
                day = new Day();
                screen = screen + "Feast of the Baptism of the Lord\r\n\r\n";
                screen = screen + (13 - day.dayOfWeek(6, 1, year0)) + " January " + year0;
                break;
            case 2:
                easter = new Easter();
                screen = screen + "The number of carnival days \t" + year0 + "\r\n\r\n";
                screen = screen + easter.dataldk(year0);
                break;
            case 3:
                easter = new Easter();
                screen = screen + "Fat Thursday\r\n\r\n";
                screen = screen + easter.datatc(year0);
                break;
            case 4:
                easter = new Easter();
                screen = screen + "Shrovetide, \"herring\"\r\n\r\n";
                screen = screen + easter.datao(year0);
                break;
            case 5:
                easter = new Easter();
                screen = screen + "Ash Wednesday\r\n\r\n";
                screen = screen + easter.datasp(year0);
                break;
            case 6:
                easter = new Easter();
                screen = screen + "Palm Sunday\r\n(Passion Sunday, April Sunday)\r\n\r\n";
                screen = screen + easter.datanmp(year0);
                break;
            case 7:
                easter = new Easter();
                screen = screen + "The Solemnity of the Lord's Resurrection\r\n(Easter Sunday, Easter, Passover)\r\n\r\n";
                screen = screen + easter.data(year0);
                break;
            case 8:
                easter = new Easter();
                screen = screen + "The Solemnity of Divine Mercy\r\n(White Sunday, Guiding Sunday)\r\n\r\n";
                screen = screen + easter.databn(year0);
                break;
            case 9:
                easter = new Easter();
                screen = screen + "The Ascension of the Lord\r\n\r\n";
                screen = screen + easter.datawp(year0);
                break;
            case 10:
                easter = new Easter();
                screen = screen + "The Solemnity of Pentecost\r\n\r\n";
                screen = screen + easter.datazsp(year0);
                break;
            case 11:
                easter = new Easter();
                screen = screen + "Feast of the Blessed Virgin Mary, Mother of the Church\r\n\r\n";
                screen = screen + easter.datanmpmk(year0);
                break;
            case 12:
                easter = new Easter();
                screen = screen + "Feast of Jesus Christ, the High and Eternal Priest\r\n\r\n";
                screen = screen + easter.datajcniwk(year0);
                break;
            case 13:
                easter = new Easter();
                screen = screen + "Solemnity of the Holy Trinity\r\n\r\n";
                screen = screen + easter.datatp(year0);
                break;
            case 14:
                easter = new Easter();
                screen = screen + "Solemnity of Corpus Christi\r\n(Solemnity of the Most Holy Body and Blood of Christ)\r\n\r\n";
                screen = screen + easter.databc(year0);
                break;
            case 15:
                easter = new Easter();
                screen = screen + "Solemnity of the Sacred Heart of Jesus\r\n\r\n";
                screen = screen + easter.datanspj(year0);
                break;
            case 16:
                easter = new Easter();
                screen = screen + "Immaculate Heart of the Blessed Virgin Mary\r\n\r\n";
                screen = screen + easter.datansnmp(year0);
                break;
            case 17:
                day = new Day();
                screen = screen + "The Solemnity of Jesus Christ, King of the Universe\r\n\r\n";//20-26 November
                screen = screen + (26 - day.dayOfWeek(25, 12, year0)) + " November " + year0;
                break;
            case 18:
                day = new Day();
                screen = screen + "Feast of the Holy Family\r\n\r\n";
                if (day.dayOfWeek(25, 12, year0) == 6)
                    screen = screen + "30 December " + year0;
                else
                    screen = screen + (31 - day.dayOfWeek(25, 12, year0)) + " December " + year0;
                break;
            default:
                break;
        }
        buffer = screen;
        tv.setText(buffer);
    }
}
