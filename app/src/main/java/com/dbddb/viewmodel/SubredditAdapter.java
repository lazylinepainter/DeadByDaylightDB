package com.dbddb.viewmodel;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dbddb.R;
import com.dbddb.model.dbdChildrenVO;

import java.util.List;

public class SubredditAdapter extends
        RecyclerView.Adapter<SubredditAdapter.ViewHolder> {

    private List<dbdChildrenVO> mSubreddit;

    public SubredditAdapter(List<dbdChildrenVO> dbdChildrenVO) {
        mSubreddit = dbdChildrenVO;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SubredditAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);

        return new ViewHolder(v);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull SubredditAdapter.ViewHolder viewHolder, int position) {
        dbdChildrenVO dbdChildrenVO = mSubreddit.get(position);

        String title = dbdChildrenVO.childData.getTitle().replaceAll("&amp;", "&").replaceAll("&", "&amp;");
        viewHolder.tituloPost.setText(title);

        //TODO PEGAR APENAS PREVIEW DE POST
        // viewHolder.previewPost.setText(dbdChildrenVO.childData.getSelftext());
    }

    @Override
    public int getItemCount() {
        return mSubreddit.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail;
        TextView tituloPost;
        TextView previewPost;

        ViewHolder(View itemView) {
            super(itemView);

            thumbnail = itemView.findViewById(R.id.iv_item_post_thumbnail);
            tituloPost = itemView.findViewById(R.id.tv_item_post_titulo);
            previewPost = itemView.findViewById(R.id.tv_item_post_preview_conteudo);

        }
    }
}