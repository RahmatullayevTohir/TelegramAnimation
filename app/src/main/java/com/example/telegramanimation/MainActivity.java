package com.example.telegramanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.telegramanimation.adapter.ViewPagerAdapter;
import com.example.telegramanimation.fragment.PageFive;
import com.example.telegramanimation.fragment.PageFour;
import com.example.telegramanimation.fragment.PageOne;
import com.example.telegramanimation.fragment.PageSix;
import com.example.telegramanimation.fragment.PageThree;
import com.example.telegramanimation.fragment.PageTwo;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private DotsIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        lottieAnimationView = findViewById(R.id.lottieAnimation);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new PageOne());
        viewPagerAdapter.add(new PageTwo());
        viewPagerAdapter.add(new PageThree());
        viewPagerAdapter.add(new PageFour());
        viewPagerAdapter.add(new PageFive());
        viewPagerAdapter.add(new PageSix());

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 1:{
                        lottieAnimationView.setAnimation("fast.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    case 2:{
                        lottieAnimationView.setAnimation("free.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    case 3:{
                        lottieAnimationView.setAnimation("infinity.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    case 4:{
                        lottieAnimationView.setAnimation("secure.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    case 5:{
                        lottieAnimationView.setAnimation("clouds.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                    default:{
                        lottieAnimationView.setAnimation("telegram.json");
                        lottieAnimationView.playAnimation();
                        break;
                    }
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setAdapter(viewPagerAdapter);

        indicator = findViewById(R.id.dots_indicator);
        indicator.setViewPager(viewPager);

    }
}