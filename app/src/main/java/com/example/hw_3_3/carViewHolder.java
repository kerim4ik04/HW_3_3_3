package com.example.hw_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class carViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCar;

    public carViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }

    public void bind(String car) {
        tvCar.setText(car);
    }
}
