package com.faz.sampleplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by PIRI on 1/29/2019.
 */
public class AudioAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<AudioModel> list = Arrays.asList();
    Context context;

    public AudioAdapter(List<AudioModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_layout, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}

class ViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    ImageButton play_pause;

    ViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title_text_view);
        play_pause = itemView.findViewById(R.id.play_pause_img_btn);
    }
}
