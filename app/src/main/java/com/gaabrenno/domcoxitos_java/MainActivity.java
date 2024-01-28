package com.gaabrenno.domcoxitos_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gaabrenno.domcoxitos_java.adapter.FoodAdapter;
import com.gaabrenno.domcoxitos_java.databinding.ActivityMainBinding;
import com.gaabrenno.domcoxitos_java.model.DomCoxitos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<DomCoxitos> foodList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewDomCoxitos = binding.RecyclerViewDomCoxitos;
        recyclerViewDomCoxitos.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewDomCoxitos.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewDomCoxitos.setAdapter(foodAdapter);
        getFood();

    }

    private void getFood(){

        DomCoxitos coxinhacongelada20g = new DomCoxitos(
        R.drawable.coxinhacongelada20g,
                "Coxinha Congelada 20g",
                "1 Kg da melhor Coxinha de frango congelada com 20 gramas, a melhor para suas festas!",
                "R$ 25,00"
        );
        foodList.add(coxinhacongelada20g);


        DomCoxitos coxinha20g = new DomCoxitos(
                R.drawable.coxinha20g,
                        "Coxinha 65g",
                        "A melhor coxinha para seu lanche da tarde!!",
                        "R$ 3,00"
                );
        foodList.add(coxinha20g);

        DomCoxitos kibefrito20g = new DomCoxitos(
                R.drawable.kibefrito20g,
                        "Quibe Frito 20g",
                        "Um quibe saboroso e irresistivel, que não pode faltar na sua mesa!",
                        "R$ 25,00"
                );
        foodList.add(kibefrito20g);

        DomCoxitos bolinhadequeijocongelada = new DomCoxitos(
                R.drawable.bolinhadequeijocongelada,
                "Bolinha de Queijo",
                "A mais saborosa do mercado, você não pode ficar sem experimentar!",
                "R$ 25,00"
        );
        foodList.add(bolinhadequeijocongelada);

        DomCoxitos americano = new DomCoxitos(
                R.drawable.americano,
                        "Coxinha Congelada 20g",
                        "Saboroso e bem recheado, sem contar que não é cru, como o da concorrencia!",
                        "R$ 5,00"
                );
        foodList.add(americano);

    }
}