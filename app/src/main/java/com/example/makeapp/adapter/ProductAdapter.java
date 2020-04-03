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

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private Context context;
    private List<Product> items;

    public ProductAdapter(Context context, List<Product> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_product, parent, false);
        return new ProductAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, final int position) {
        Product item = items.get(position);
        holder.nameText.setText(item.getName());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID() == 1){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/gDNlUhRDMqM"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 2){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/uLw7jF-LvUg"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 3){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WiJbLbkfFRI"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 4){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/GpRTYDPxrzA"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 5){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rH2bLjPZsS8"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 6){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Cy5d6cTI_oA"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 7){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PicS_VXX_ow"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 8){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Y8i7FoNv6XQ"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 9){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/YQlMRlfgBhs"));
                    context.startActivity(gotoproduct);
                }else if (items.get(position).getRowID() == 10){
                    Intent gotoproduct = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/xMnE-YzMsko"));
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
