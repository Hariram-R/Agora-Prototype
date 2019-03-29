package com.hari.app.agora_prototype;

import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.woxthebox.draglistview.DragItemAdapter;

import java.util.ArrayList;

public class VoteAdapter extends DragItemAdapter<Pair<Long, String>, VoteAdapter.ViewHolder> {

    private int mLayoutId;
    private int mGrabHandleId;
    private boolean mDragOnLongPress;

    public VoteAdapter(ArrayList<Pair<Long, String>> list,int mLayoutId, int mGrabHandleId, boolean mDragOnLongPress) {
        this.mLayoutId = mLayoutId;
        this.mGrabHandleId = mGrabHandleId;
        this.mDragOnLongPress = mDragOnLongPress;
        setItemList(list);
    }

    @Override
    public long getUniqueItemId(int position) {
        return mItemList.get(position).first;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_candidate, viewGroup, false);
        return new ViewHolder(view,R.id.drag,false);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        String text = mItemList.get(position).second;
        holder.populateItem(text);
        holder.itemView.setTag(mItemList.get(position));
    }

    public class ViewHolder extends DragItemAdapter.ViewHolder {
        TextView mText;
        ImageView dragger;

        public ViewHolder(View itemView, int handleResId, boolean dragOnLongPress) {
            super(itemView, handleResId, dragOnLongPress);
            mText = itemView.findViewById(R.id.name);
            dragger=itemView.findViewById(R.id.drag);
        }

        void populateItem(String text){
            mText.setText(text);
        }
    }

}

