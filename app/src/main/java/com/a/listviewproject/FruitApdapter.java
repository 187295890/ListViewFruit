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
//现在该方法基本能实现功能，但是效率较低，因为每次都要通过方法来获取控件实例。我们添加一个新类ViewHolder
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){

            view= LayoutInflater.from(getContext()).inflate(R.layout.fiuit_item,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage= (ImageView) view.findViewById(R.id.fruit_item_image_name);
            viewHolder.fruitName= (TextView) view.findViewById(R.id.fruit_item_text_view);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getmImageId());
        viewHolder.fruitName.setText(fruit.getmName());
        return view;
    }

}
     class ViewHolder{
         ImageView fruitImage;
         TextView fruitName;
   }
