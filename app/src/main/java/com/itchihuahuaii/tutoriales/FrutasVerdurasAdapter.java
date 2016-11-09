package com.itchihuahuaii.tutoriales;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by usuario1 on 10/22/2016.
 */

public class FrutasVerdurasAdapter extends ArrayAdapter<FrutasVerduras>{
    Context mycontext;
    int mylayoutResourceID;
    FrutasVerduras mydata[] = null;

    public FrutasVerdurasAdapter(Context context,int layoutResourceID,FrutasVerduras[] data){
        super(context,layoutResourceID,data);
        this.mycontext=context;
        this.mylayoutResourceID=layoutResourceID;
        this.mydata=data;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        FrutasVerdurasHolder holder = null;

        if(row==null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row=inflater.inflate(mylayoutResourceID,parent,false);

            holder = new FrutasVerdurasHolder();
            holder.imagen=(ImageView) row.findViewById(R.id.list_image);
            holder.textView =(TextView)row.findViewById(R.id.list_texto);
            row.setTag(holder);
        }else{
            holder=(FrutasVerdurasHolder)row.getTag();
        }
        FrutasVerduras frutasVerduras = mydata[position];
        holder.textView.setText(frutasVerduras.title);
        holder.imagen.setImageResource(frutasVerduras.icon);

        return row;
    }

    static class FrutasVerdurasHolder{
        ImageView imagen;
        TextView textView;
    }

}
