package com.a.listviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.a.listviewproject.bean.Fruit;

import java.util.List;

public class FruitApdapter extends ArrayAdapter<Fruit> {

    public FruitApdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit=getItem( position);
        View view= LayoutInflater.from(getContext()).inflate(R.layout.fiuit_item,parent,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.fruit_item_image_name);
        TextView textView= (TextView) view.findViewById(R.id.fruit_item_text_view);
        imageView.setImageResource(fruit.getmImageId());
        textView.setText(fruit.getmName());
        return view;
    }

}
