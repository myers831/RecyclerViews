package com.example.admin.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnimalListActivity extends AppCompatActivity {

    List<Animal> animalList = new ArrayList<>();

    RecyclerView rvAnimalList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    AnimalListAdapter animalListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        String imageUrl = "https://s3-us-west-1.amazonaws.com/powr/defaults/image-slider2.jpg";

        initAnimals(imageUrl);


        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        animalListAdapter = new AnimalListAdapter(this, animalList);


        rvAnimalList = (RecyclerView) findViewById(R.id.rvAnimalList);
        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setItemAnimator(itemAnimator);
        rvAnimalList.setAdapter(animalListAdapter);

    }

    private void initAnimals(String imageUrl) {
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));
        animalList.add(new Animal("Reptile", "Dragon", 670, imageUrl));

    }
}
