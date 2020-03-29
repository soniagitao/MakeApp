package com.example.makeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.makeapp.BlushActivity;
import com.example.makeapp.EyeshadowActivity;
import com.example.makeapp.FoundationActivity;
import com.example.makeapp.LipstickActivity;
import com.example.makeapp.MainActivity;
import com.example.makeapp.MascaraActivity;
import com.example.makeapp.R;
import com.example.makeapp.models.MakeupLogo;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context context;
    private List<MakeupLogo> items;

    public MainAdapter(Context context, List<MakeupLogo> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, final int position) {
        final MakeupLogo item = items.get(position);
        holder.nameText.setText(item.getName());
        Glide.with(context).load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID() == 1){
                    Intent gotoproduct = new Intent(context, MascaraActivity.class);
                    context.startActivity(gotoproduct);
                } else if (items.get(position).getRowID() == 2){
                    Intent gotoproduct = new Intent(context, EyeshadowActivity.class);
                    context.startActivity(gotoproduct);
                } else if (items.get(position).getRowID() == 3){
                    Intent gotoproduct = new Intent(context, BlushActivity.class);
                    context.startActivity(gotoproduct);
                } else if (items.get(position).getRowID() == 4){
                    Intent gotoproduct = new Intent(context, FoundationActivity.class);
                    context.startActivity(gotoproduct);
                } else if (items.get(position).getRowID() == 5){
                    Intent gotoproduct = new Intent(context, LipstickActivity.class);
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
