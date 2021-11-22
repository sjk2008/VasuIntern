package com.imsjkumar.vasuintern.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.imsjkumar.vasuintern.R;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {

    private final String[] item;
    private final int[] imageList;

    public StoryAdapter(String[] item, int[] imageList) {
        this.item = item;
        this.imageList = imageList;
    }




    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.colum_item, parent, false);
        return new StoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        holder.txt.setText(item[position]);
        holder.image2.setImageResource(imageList[position]);
    }


    @Override
    public int getItemCount() {
        return item.length;
    }

    public static class StoryViewHolder extends RecyclerView.ViewHolder {
        TextView txt;
        ImageView  image2;

        public StoryViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.textView7);
            image2 = itemView.findViewById(R.id.imageView12);
        }
    }
}
