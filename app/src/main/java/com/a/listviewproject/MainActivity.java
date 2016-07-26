package com.a.listviewproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.a.listviewproject.bean.Fruit;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Fruit> fruitList=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FruitApdapter apdapter=new FruitApdapter(this,R.layout.fiuit_item,fruitList);
        listView= (ListView) findViewById(R.id.activity_main_list_view);
        listView.setAdapter(apdapter);
        InitFruit();
    }
    private void InitFruit(){
        String[] fruitName={"apple", "banana", "orange", "watermelon", "pear", "grape",
                "Pineapple", "strawberry", "cherry", "apple", "banana", "orange"};
        int[] fruitImages = {R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic,
                R.drawable.watermelon_pic, R.drawable.pear_pic, R.drawable.grape_pic,
                R.drawable.pineapple_pic, R.drawable.strawberry_pic, R.drawable.cherry_pic,
                R.drawable.apple_pic, R.drawable.banana_pic, R.drawable.orange_pic};
        for(int i=0;i<fruitName.length;i++){
            Fruit fruit=new Fruit(fruitName[i],fruitImages[i]);
            fruitList.add(fruit);

        }
    }

}


