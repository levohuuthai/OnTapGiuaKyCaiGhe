package com.example.ongiuakycaighe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterGhe3 extends RecyclerView.Adapter<AdapterGhe3.ViewHolder>{
    ArrayList<DataGhe> arrGheC;
    Context context;
    LayoutInflater layoutInflater;

    public AdapterGhe3(ArrayList<DataGhe> arrGheC, Context context) {
        this.arrGheC = arrGheC;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.itemghechonc,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgGheChonC.setImageResource(arrGheC.get(position).getGhe());
        holder.tvNameChonC.setText(arrGheC.get(position).getName());
        holder.tvGiaChonC.setText(arrGheC.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return arrGheC.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgGheChonC;
        TextView tvNameChonC;
        TextView tvGiaChonC;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgGheChonC = itemView.findViewById(R.id.imgGheChonC);
            tvNameChonC = itemView.findViewById(R.id.tvNameChonC);
            tvGiaChonC = itemView.findViewById(R.id.tvGiaChonC);
        }
    }

}
