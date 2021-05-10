package com.example.mytripplanner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytripplanner.R;
import com.example.mytripplanner.model.RecentData;

import org.w3c.dom.Text;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecentsViewHolder> {

    Context context;

    public RecentsAdapter(Context context, List<RecentData> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    List<RecentData> recentDataList;

    @NonNull
    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recents_row_item,parent,false);
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewHolder holder, int position) {
        holder.countryname.setText(recentDataList.get(position).getCountryname());
        holder.placename.setText(recentDataList.get(position).getPlacename());
        holder.price.setText(recentDataList.get(position).getPrice());
        holder.placeimage.setImageResource(recentDataList.get(position).getImageurl());
    }

    @Override
    public int getItemCount() {
        return recentDataList.size();
    }

    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{

        ImageView placeimage;
        TextView placename,countryname,price;


        public RecentsViewHolder(@NonNull View itemView) {
            super(itemView);

            placeimage = itemView.findViewById(R.id.place_image);
            placename = itemView.findViewById(R.id.place_name);
            countryname = itemView.findViewById(R.id.country);
            price = itemView.findViewById(R.id.price);
        }
    }
}
