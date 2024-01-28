package com.gaabrenno.domcoxitos_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gaabrenno.domcoxitos_java.databinding.FoodItemBinding;
import com.gaabrenno.domcoxitos_java.model.DomCoxitos;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

        private final ArrayList<DomCoxitos> foodList;
        private final Context context;

    public FoodAdapter(ArrayList<DomCoxitos> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodItemBinding listItem;
        listItem = FoodItemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new FoodViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.binding.imgCoxinha60g.setBackgroundResource(foodList.get(position).getImgFood());
        holder.binding.txtFoodName.setText(foodList.get(position).getFoodName());
        holder.binding.txtFoodDescription.setText(foodList.get(position).getFoodDescription());
        holder.binding.txtPrice.setText(foodList.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder{

        FoodItemBinding binding;

        public FoodViewHolder(FoodItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
