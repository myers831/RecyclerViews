package com.example.admin.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/4/2017.
 */

public class AnimalListAdapter extends RecyclerView.Adapter<AnimalListAdapter.ViewHolder> {

    List<Animal> animalList = new ArrayList<>();
    Context context;

    public AnimalListAdapter(Context context, List<Animal> animalList) {
        this.animalList = animalList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.tvAnimalName.setText(animal.getName());
        holder.tvAnimalType.setText(animal.getType());
        holder.tvAnimalWeight.setText(String.valueOf(animal.getWeight()));

        Glide.with(context).load(animal.getImageUrl()).into(holder.ivAnimal);

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private final ImageView ivAnimal;
        private final TextView tvAnimalName;
        private final TextView tvAnimalType;
        private final TextView tvAnimalWeight;

        public ViewHolder(View itemView) {
            super(itemView);

            ivAnimal = (ImageView) itemView.findViewById(R.id.ivAnimal);
            tvAnimalName = (TextView) itemView.findViewById(R.id.tvAnimalName);
            tvAnimalType = (TextView) itemView.findViewById(R.id.tvAnimalType);
            tvAnimalWeight = (TextView) itemView.findViewById(R.id.tvAnimalWeight);

        }
    }
}
