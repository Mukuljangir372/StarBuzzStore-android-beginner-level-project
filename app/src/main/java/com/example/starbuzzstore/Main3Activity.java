package com.example.starbuzzstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {
    Intent intent;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView = (ImageView) findViewById(R.id.imageView1);
        textView = (TextView) findViewById(R.id.textView1);

        intent = getIntent();
        String getItem = intent.getStringExtra("EXTRA_MESSAGE");
        if (getItem.equals("Coca cola")) {
            setViewForItem("Coca cola");
        } else if (getItem.equals("Red Bull")) {
            setViewForItem("Red Bull");
        } else if (getItem.equals("Appy Fizz")) {
            setViewForItem("Appy Fizz");
        } else if (getItem.equals("chocolate N' chips")) {
            setViewForItem("chocolate N' chips");
        } else if (getItem.equals("Vanilla")) {
            setViewForItem("Vanilla");
        } else if (getItem.equals("chocolate chip cookie")) {
            setViewForItem("chocolate chip cookie");
        } else if (getItem.equals("Miller")) {
            setViewForItem("Miller");
        } else if (getItem.equals("Corona")) {
            setViewForItem("Corona");
        } else if (getItem.equals("Fosters")) {
            setViewForItem("Fosters");
        }
    }

    public void setViewForItem(String item) {
        String item1 = item;
        if (item1.equals("Coca cola")) {
            imageView.setImageResource(R.drawable.cocacola);
            textView.setText("Energy: 140 Calories (Per 360 mL)\n" +
                    "Manufacturer: The Coca-Cola Company\n" +
                    "Introduced: 8 May 1886\n" +
                    "Color: Caramel E-150d\n" +
                    "Variants: Caffeine-Free Coca-Cola, Coca-Cola Zero Sugar, MORE\n" +
                    "Related products: Cavan Cola, Postobón, Afri-Cola");
        } else if (item1.equals("Red Bull")) {
            imageView.setImageResource(R.drawable.redbull);
            textView.setText("Depending on the country Red Bull contains caffeine, taurine, B vitamins (B3, B5, B6, B12) and simple sugars (sucrose and glucose) in a buffer solution of carbonated water, baking soda and magnesium carbonate.To produce Red Bull Sugarfree, sugars sucrose and glucose have been replaced by the sweeteners acesulfame K and aspartame/sucralose.");
        } else if (item1.equals("Appy Fizz")) {
            imageView.setImageResource(R.drawable.appyfizz);
            textView.setText("Appy Fizz is a product by Parle Agro, introduced in India in 2005. Appy Fizz consists of carbonated apple juice, and can be used as the basis for cocktails. After the success of Appy which was clean apple juice, Parle launched its sequel product as Grappo Fizz, which is a carbonated grape juice.");

        } else if (item1.equals("chocolate N' chips")) {
            imageView.setImageResource(R.drawable.chocolatenchip);
            textView.setText("Chocolate ice cream is generally made by blending cocoa powder along with the eggs, cream, vanilla and sugar used to make vanilla ice cream.");

        } else if (item1.equals("Vanilla")) {
            imageView.setImageResource(R.drawable.vanilla);
            textView.setText("Soft-scoop vanilla ice-creams from Wall's and Ms Molly's, which is exclusively sold at Tesco, were the other two products missing the three key ingredients. Vanilla ice-cream is traditionally made from fresh milk, cream, egg yolks, sugar and vanilla, which are frozen and aerated.");

        } else if (item1.equals("chocolate chip cookie")) {
            imageView.setImageResource(R.drawable.chocolatechip);
            textView.setText("he key to these chocolate chip cookie ice cream sandwiches is the cookie. In order to keep this dessert as simple and stress-free as possible, we need to be able to assemble and freeze them in advance. So I’ve made this recipe to be just barely soft and chewy when frozen so that you can enjoy the goods without fussing in the kitchen all week long.");
        }
        else if(item1.equals("Miller")) {
        imageView.setImageResource(R.drawable.miller);
        textView.setText("The Miller Brewing Company is an American beer brewing company headquartered in Milwaukee, Wisconsin, that was owned until October 11, 2016 by the MillerCoors division of the SABMiller–Molson Coors joint venture.");
       }else if(item1.equals("Corona")) {
        imageView.setImageResource(R.drawable.corona);
        textView.setText("Corona Extra is a pale lager produced by Cervecería Modelo in Mexico for domestic distribution and export to all other countries besides the United States, and by Constellation Brands in Mexico for export to the United States. The Corona brand is one of the top-selling beers.");
       }else if(item1.equals("Fosters")) {
            imageView.setImageResource(R.drawable.fosters);
            textView.setText("Foster's Group was an Australian beer group with interests in brewing and soft drinks. Foster's Group Limited was based in Melbourne, Victoria and was renamed Carlton & United Breweries prior to sale to British-South African multinational SABMiller in 2011. Foster's Group was the brewer of Foster's Lager.");
        }
    }
}

