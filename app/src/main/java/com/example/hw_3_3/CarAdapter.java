package com.example.hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter <carViewHolder> {

    private ArrayList <String> carList;

    public CarAdapter(ArrayList<String> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public carViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new carViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull carViewHolder holder, int position) {
        holder.bind(carList.get(position));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
