package com.example.project1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.project1.Adapter.PopularAdapter;
import com.example.project1.R;
import com.example.project1.databinding.ActivityMainBinding;
import com.example.project1.domain.PopularDomain;
import com.example.project1.mercedes.merce;
import com.example.project1.morePage;
import com.example.project1.peugeot;
import com.example.project1.renault;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

Button moreback;
Button mercedes;

Button Renault;
Button peugeot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusBarColor();
        initRecyclerView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,CartActivity.class)));
        binding.profileBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,ProfActivity.class)));

        moreback=(Button) findViewById(R.id.moreback);
        mercedes=(Button) findViewById(R.id.mercedes);
        Renault=(Button) findViewById(R.id.Renault);
        peugeot=(Button) findViewById(R.id.peugeot);
    }

    private void statusBarColor() {
        Window window = MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.orange_light));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Retroviseur Renault Clio 4","offer_1",15,4,12000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation. "));

        items.add(new PopularDomain("Porte Volswagen Golf 7 ","offer_2",10,4.5,57000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation. "));

        items.add(new PopularDomain("Calandre Seat Leon","offer_3",3,4.9,23000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Phare Megane Berre","offer_20",10,3.8,20000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Feu Arriere Symbol","offer_21",4,3.2,15000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Pare-Choc Renault Clio ","offer_22",5,4.6,25000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Calander Peugeot 207","offer_8",14,2.9,23000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Retroviseur Mercedes w204","offer_4",11,4.1,13000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Pare-choc mercedes c250","offer_5",6,4.9,30000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Pare-choc Peugeot 207","offer_6",8,3.1,28000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));

        items.add(new PopularDomain("Phare Peugeot 3008 ","offer_7",4,3.6,20000,"La pièce est en bon état et ne présente aucun dommage. Vous pouvez vérifier sa sécurité avant l'achat. Il a été minutieusement inspecté pour s'assurer qu'il n'y a aucun problème affectant ses performances. Obtenez une pièce de qualité garantie et une performance fiable pour assurer votre sécurité et votre confort lors de l'utilisation."));


        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.PopularView.setAdapter(new PopularAdapter(items));    }
    public void onclick1 (View view){
        Intent moreback = new Intent(this, morePage.class);
        startActivity(moreback);
    }
    public void onclick2 (View view){
        Intent mercedes = new Intent(this, merce.class);
        startActivity(mercedes);
    }
    public void onclick3 (View view){
        Intent Renault = new Intent(this, renault.class);
        startActivity(Renault);
    }
    public void onclick4 (View view){
        Intent peugeot= new Intent(this,peugeot.class);
        startActivity(peugeot);
    }

}