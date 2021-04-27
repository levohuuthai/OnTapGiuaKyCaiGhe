package com.example.ongiuakycaighe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterGhe extends RecyclerView.Adapter<AdapterGhe.ViewHolder>{
    ArrayList<DataGhe> arrGhe;
    Context context;
    LayoutInflater layoutInflater;
    OnitemClickListener mListener;
    public interface OnitemClickListener{
        void onItemclick(int position);
    }

    public void setOnitemClick(OnitemClickListener listener){
        mListener = listener;
    }

    public AdapterGhe(ArrayList<DataGhe> arrGhe, Context context) {
        this.arrGhe = arrGhe;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view  = layoutInflater.inflate(R.layout.itemghe,parent,false);
        return new ViewHolder(view,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgGhe.setImageResource(arrGhe.get(position).getGhe());
        holder.tvPrice.setText(arrGhe.get(position).getPrice());
        holder.tvName.setText(arrGhe.get(position).getName());
        holder.btnAdd.setText(arrGhe.get(position).getAdd());
    }

    @Override
    public int getItemCount() {
        return arrGhe.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGhe;
        TextView tvPrice,tvName;
        Button btnAdd;
        public ViewHolder(@NonNull View itemView, OnitemClickListener listener) {
            super(itemView);
            imgGhe = itemView.findViewById(R.id.imgGhe);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvName = itemView.findViewById(R.id.tvName);
            btnAdd = itemView.findViewById(R.id.btnAdd);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemclick(position);
                        }
                    }
                }
            });


        }
    } {

    }


}
