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
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

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

        //url img thumbnail to image view
        Picasso.get().load(dbdChildrenVO.childData.getThumbnail()).into(viewHolder.thumbnail);

        //title post
        String title = dbdChildrenVO.childData.getTitle().replaceAll("&amp;", "&").replaceAll("&", "&amp;");
        viewHolder.tituloPost.setText(title);

        //preview text post
        viewHolder.previewPost.setText(dbdChildrenVO.childData.getSelftext());

        //upvote count
        viewHolder.upvoteCount.setText(String.format(Locale.getDefault(), "%d", dbdChildrenVO.childData.getUps()));

        //comments count
        viewHolder.commentCount.setText(String.format(Locale.getDefault(), "%d", dbdChildrenVO.childData.getNumComments()));
    }

    @Override
    public int getItemCount() {
        return mSubreddit.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail;
        TextView tituloPost;
        TextView previewPost;
        TextView upvoteCount;
        TextView commentCount;

        ViewHolder(View itemView) {
            super(itemView);

            thumbnail = itemView.findViewById(R.id.iv_item_post_thumbnail);
            tituloPost = itemView.findViewById(R.id.tv_item_post_title);
            previewPost = itemView.findViewById(R.id.tv_item_post_preview_content);
            upvoteCount = itemView.findViewById(R.id.tv_item_post_upvotes_number);
            commentCount = itemView.findViewById(R.id.tv_item_post_comment_number);
        }
    }
}