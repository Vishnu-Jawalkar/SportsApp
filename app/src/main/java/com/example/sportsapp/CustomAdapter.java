package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportViewHolder> {

    private List<Sport> sportList;

    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener myListener){

        this.clickListener =myListener;
    }

    public CustomAdapter(List<Sport> sportList){
        this.sportList=sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout_items,parent,false);

        return new SportViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {

        Sport sport =sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public  class SportViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textView;
        ImageView imageView;

        public SportViewHolder(@NonNull View itemView) {
            super(itemView);

            textView= itemView.findViewById(R.id.textView);

            imageView= itemView.findViewById(R.id.imageviewcard);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            if(clickListener != null){
                clickListener.onClick(v,getAdapterPosition());
            }

        }
    }
}
