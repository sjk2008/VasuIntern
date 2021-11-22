package com.imsjkumar.vasuintern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.imsjkumar.vasuintern.adapter.StoryAdapter;
import com.imsjkumar.vasuintern.fragment.EngageFragment;
import com.imsjkumar.vasuintern.fragment.ExploreFragment;
import com.imsjkumar.vasuintern.fragment.MainActivityFragment;
import com.imsjkumar.vasuintern.fragment.TrandingFragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import meow.bottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation meowBottomNavigation;
    private RecyclerView storyRecyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager recyclerViewManager;
    String[] item = {"jonas.noah", "tweetasm", "jonas.noah", "tweetasm", "jonas.noah", "tweetasm", "jonas.noah", "tweetasm"};
    int[] imageList = {R.drawable.exercise, R.drawable.swim, R.drawable.exercise, R.drawable.swim, R.drawable.exercise, R.drawable.swim};

    TextView  mainTV,trandingTV,exploreTV;
    ImageView exchangeIMG;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        meowBottomNavigation = findViewById(R.id.meowBottomNavigation);
//        meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
//        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_menu_book));
//        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_search));
//
//        meowBottomNavigation.show(1,true);
//        replace(new MainActivityFragment());
//        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
//            @Override
//            public Unit invoke(MeowBottomNavigation.Model model) {
//                switch (model.getId()){
//                    case 1:
//                        replace(new MainActivityFragment());
//
//                        break;
//
//                    case 2:
//                        replace(new TrandingFragment());
//                        break;
//
//                    case 3:
//                        replace(new EngageFragment());
//                        break;
//                }
//
//                return null;
//            }
//        });




        mainTV = findViewById(R.id.mainTV);
        trandingTV = findViewById(R.id.trendingTV);
        exploreTV = findViewById(R.id.exploreTV);
        linearLayout = findViewById(R.id.fragLinearLayout);
        exchangeIMG = findViewById(R.id.exchangeIMG);
        //set the onClickListener
        mainTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivityFragment mainActivityFragment = new MainActivityFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragLinearLayout, mainActivityFragment);
                transaction.commit();
            }
        });

        trandingTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TrandingFragment trandingFragment = new TrandingFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragLinearLayout,trandingFragment);
                transaction.commit();
            }
        });

        exploreTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExploreFragment exploreFragment = new ExploreFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragLinearLayout,exploreFragment);
                transaction.commit();
            }
        });

        exchangeIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EngageFragment engageFragment = new EngageFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragLinearLayout,engageFragment);
                transaction.commit();
                Log.d("IMG","You clicked me!...");
            }
        });

        storyRecyclerView = findViewById(R.id.storyRecyclerView);
        recyclerViewManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        storyRecyclerView.setLayoutManager(recyclerViewManager);
        recyclerViewAdapter = new StoryAdapter(item, imageList);
        storyRecyclerView.setAdapter(recyclerViewAdapter);
    }

//    private void replace(Fragment fragment) {
//
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragLinearLayout,fragment);
//        transaction.commit();
//
//    }
}