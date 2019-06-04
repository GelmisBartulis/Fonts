package com.ge20070469.fonts;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> fonts;
    private TextView showFont;
    final private String[] fontNames = {
        "Roboto", "ZCOOL KuaiLe", "Gugi",
        "Raleway", "Noto Serif", "Inconsolata",
        "Anton", "Indie Flower", "Lobster",
        "Pacifico", "Varela Round", "Dancing Script",
        "Yanone Kaffeesatz", "Merriweather Sans", "Cormorant Unicase",
        "Abril Fatface", "Mukta", "Righteous"
    };

    private  Typeface custom_font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFont = findViewById(R.id.show_font_text);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, fontNames);
        ListView listView = (ListView) findViewById(R.id.font_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("tag", " " + adapterView.getItemAtPosition(i));
                switch (adapterView.getItemAtPosition(i) + "") {

                    case "Roboto":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Roboto-Regular.ttf");
                        showFont.setText("Roboto");
                        showFont.setTypeface(custom_font);
                        break;

                    case "ZCOOL KuaiLe":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ZCOOLKuaiLe-Regular.ttf");
                        showFont.setText("ZCOOL KuaiLe");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Gugi":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Gugi-Regular.ttf");
                        showFont.setText("Gugi");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Raleway":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Raleway-Regular.ttf");
                        showFont.setText("Raleway");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Noto Serif":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/NotoSerif-Regular.ttf");
                        showFont.setText("Noto Serif");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Inconsolata":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Inconsolata-Regular.ttf");
                        showFont.setText("Inconsolata");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Anton":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Anton-Regular.ttf");
                        showFont.setText("Anton");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Indie Flower":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/IndieFlower.ttf");
                        showFont.setText("Indie Flower");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Lobster":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Lobster-Regular.ttf");
                        showFont.setText("Lobster");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Pacifico":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Pacifico-Regular.ttf");
                        showFont.setText("Pacifico");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Varela Round":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/VarelaRound-Regular.ttf");
                        showFont.setText("Varela Round");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Dancing Script":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/DancingScript-Regular.ttf");
                        showFont.setText("Dancing Script");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Yanone Kaffeesatz":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/YanoneKaffeesatz-Regular.ttf");
                        showFont.setText("Yanone Kaffeesatz");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Merriweather Sans":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/MerriweatherSans-Regular.ttf");
                        showFont.setText("Merriweather Sans");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Cormorant Unicase":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/CormorantUnicase-Light.ttf");
                        showFont.setText("Cormorant Unicase");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Abril Fatface":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/AbrilFatface-Regular.ttf");
                        showFont.setText("Abril Fatface");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Mukta":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Mukta-Regular.ttf");
                        showFont.setText("Mukta");
                        showFont.setTypeface(custom_font);
                        break;

                    case "Righteous":
                        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Righteous-Regular.ttf");
                        showFont.setText("Righteous");
                        showFont.setTypeface(custom_font);
                        break;
                }
            }
        });
    }
}
