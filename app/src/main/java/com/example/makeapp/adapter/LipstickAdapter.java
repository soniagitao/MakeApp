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

public class LipstickAdapter extends RecyclerView.Adapter<LipstickAdapter.ViewHolder> {
    private Context context;
    private List<Product> items;

    public LipstickAdapter(Context context, List<Product> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_product, parent, false);
        return new LipstickAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Product item = items.get(position);
        holder.nameText.setText(item.getName());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID() == 1){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/EHZyKQ2TonU"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 2){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/sABAIj25KyE"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 3){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/H87PzahYG78"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 4){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/9iXuWmpUGDQ"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 5){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/p_SdrOI5MIE"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 6){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/9YNlSSoQjIw"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 7){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kJTy2gxdl0s"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 8){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ZANKRtynElU"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 9){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8zDTFe1mrjU"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 10){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yuTihlmXpTw"));
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
