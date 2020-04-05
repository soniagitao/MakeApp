package com.example.makeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.makeapp.R;
import com.example.makeapp.models.Product;

import java.util.List;

public class BlushAdapter extends RecyclerView.Adapter<BlushAdapter.ViewHolder> {
    private Context context;
    private List<Product> items;

    public BlushAdapter(Context context, List<Product> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BlushAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_product, parent, false);
        return new BlushAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlushAdapter.ViewHolder holder, final int position) {
        Product item = items.get(position);
        holder.nameText.setText(item.getName());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID() == 1){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/JfxdNOVjGeY"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 2){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/QoFJJCsa41U"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 3){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PlJ7wbJXbio"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 4){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-Ys4UacEtKg"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 5){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/uIf8V1hQ99Q"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 6){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/eoj_fzGt48U"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 7){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/EEQiOpVwstQ"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 8){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/FdcDnta76oQ"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 9){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/crLm0EFGO3E"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 10){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PAgZgM1Q4hQ"));
                    context.startActivity(gotoproduct);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
