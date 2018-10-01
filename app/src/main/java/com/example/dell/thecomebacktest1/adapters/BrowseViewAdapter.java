package com.example.dell.thecomebacktest1.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.dell.thecomebacktest1.R;
import com.example.dell.thecomebacktest1.View_item;
import com.example.dell.thecomebacktest1.utility.Response;

import java.util.ArrayList;

public class BrowseViewAdapter extends RecyclerView.Adapter<BrowseViewVh> {

ArrayList<Response> dataSource;
Context context;

    public BrowseViewAdapter(ArrayList<Response> dataSource, Context context) {
        this.dataSource = dataSource;
        this.context = context;
    }





    @NonNull
    @Override
    public BrowseViewVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_recycler_element, parent, false);
        return new BrowseViewVh(v);
    }


    @Override
    public void onBindViewHolder(@NonNull BrowseViewVh holder, int position) {

        holder.vh_price.setText(dataSource.get(position).getPRODUCTPRICE());
        Glide.with(context).load(dataSource.get(position).getPRODUCTIMAGEREFERENCE()).apply(RequestOptions.noTransformation()).into(holder.vh_image);


        holder.vh_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,View_item.class);
                // intent.putExtra("imageReference", data);
                context.startActivity(intent);

            }
        });





    }


    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
