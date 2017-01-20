package net.cattaka.android.adaptertoolbox.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.cattaka.android.adaptertoolbox.example.adapter.SimpleStringAdapter;
import net.cattaka.android.adaptertoolbox.example.logic.SnackbarLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Created by cattaka on 16/05/02.
 */
public class FastScrollByInitialExampleActivity extends AppCompatActivity {
    SnackbarLogic mSnackbarLogic = new SnackbarLogic();

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_scroll_example);

        // find views
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);

        { // set adapter
            Random random = new Random();
            String initials = "ABCDEFGHJKLMNOPQRSTUVWXYZ";
            List<String> items = new ArrayList<>();
            for (int i = 0; i < initials.length(); i++) {
                char ch = initials.charAt(i);
                int n = random.nextInt(100);
                for (int j = 0; j < n; j++) {
                    items.add(String.format(Locale.ROOT, "%c%02d", ch, j));
                }
            }
            SimpleStringAdapter adapter = new SimpleStringAdapter(this, items, null);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            mRecyclerView.setAdapter(adapter);
        }
    }
}