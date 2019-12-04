package com.example.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RecycleViewPager extends RecyclerView.Adapter<RecycleViewPager.ViewHolder> {
    ArrayList<ViewData> arrayList;
    public RecycleViewPager(ArrayList<ViewData>arrayList) {
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewPager.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView image_name,image_info,image_location;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            image_name=itemView.findViewById(R.id.image_name);
            image_info=itemView.findViewById(R.id.image_info);
            image_location=itemView.findViewById(R.id.image_location);
        }

        public void bind(int position ){
            ViewData current_view_data=arrayList.get(position);
            image.setImageResource(current_view_data.getImage_res());
            image_name.setText(current_view_data.getImage_name());
            image_info.setText(current_view_data.getImage_info());
            image_location.setText(current_view_data.getImage_location());
        }
    }
}
