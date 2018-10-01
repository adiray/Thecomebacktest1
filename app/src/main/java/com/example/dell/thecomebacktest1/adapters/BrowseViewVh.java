package com.example.dell.thecomebacktest1.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dell.thecomebacktest1.R;

public class BrowseViewVh extends RecyclerView.ViewHolder {

    TextView vh_price;
    ImageView vh_image;

    public BrowseViewVh(View itemView) {

        super(itemView);
        vh_image = itemView.findViewById(R.id.single_item_image);
        vh_price = itemView.findViewById(R.id.single_item_price);

    }


}
