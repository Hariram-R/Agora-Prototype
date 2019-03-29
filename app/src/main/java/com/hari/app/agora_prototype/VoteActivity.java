package com.hari.app.agora_prototype;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Pair;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.woxthebox.draglistview.DragItem;
import com.woxthebox.draglistview.DragItemRecyclerView;
import com.woxthebox.draglistview.DragListView;

import java.util.ArrayList;

public class VoteActivity extends AppCompatActivity {


    DragListView recyclerView;
    private ArrayList<Pair<Long, String>> mItemArray;
    Button cast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        cast = findViewById(R.id.cast);
        recyclerView = findViewById(R.id.drag_item_recycler_view);
        recyclerView.setDragListListener(new DragListView.DragListListenerAdapter() {
            @Override
            public void onItemDragStarted(int position) {
                super.onItemDragStarted(position);
            }

            @Override
            public void onItemDragEnded(int fromPosition, int toPosition) {
                super.onItemDragEnded(fromPosition, toPosition);
                Toast.makeText(VoteActivity.this, "Position: " + (toPosition+1), Toast.LENGTH_SHORT).show();
            }
        });
        mItemArray = new ArrayList<>();
        mItemArray.add(new Pair<>((long) 0, "Donald Trump"));
        mItemArray.add(new Pair<>((long) 1, "Barack Obama"));
        mItemArray.add(new Pair<>((long) 2, "George w. Bush"));
        mItemArray.add(new Pair<>((long) 3, "Bill Clinton"));
        mItemArray.add(new Pair<>((long) 4, "Ronald Reagan"));
        mItemArray.add(new Pair<>((long) 5, "Jimmy Carter"));

        setupListRecyclerView();

        cast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VoteActivity.this,"Vote registered successfully",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private void setupListRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        VoteAdapter listAdapter = new VoteAdapter(mItemArray, R.layout.item_candidate, R.id.drag, false);
        recyclerView.setAdapter(listAdapter, true);
        recyclerView.setCanDragHorizontally(false);
    }
}
