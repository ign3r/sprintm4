package com.example.sprintm4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.sprintm4.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;
    FragmentTransaction transaction;
    Fragment videoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding= ActivitySecondBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        videoFragment=new VideoFragment();
        transaction= getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentContainerView,videoFragment).commit();

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
    }
}

