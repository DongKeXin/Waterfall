package com.djp.user.waterfall;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mr.Dong on 2019/3/10.
 */

public class BeautyAdapter extends RecyclerView.Adapter<BeautyAdapter.BeautyViewHolder> {
    /**
     * 上下文
     */
    private Context mContext;
    /**
     * 数据集合
     */
    private List<Beauty> data;

    public BeautyAdapter(List<Beauty> data, Context context) {
        this.data = data;
        this.mContext = context;
    }

    @Override
    public BeautyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //加载item 布局文件
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.beauty_item, parent, false);
        return new BeautyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BeautyViewHolder holder, int position) {
        //将数据设置到item上
        Beauty beauty = data.get(position);
        holder.beautyImage.setImageResource(beauty.getImageId());
        holder.nameTv.setText(beauty.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class BeautyViewHolder extends RecyclerView.ViewHolder {
        ImageView beautyImage;
        TextView nameTv;

        public BeautyViewHolder(View itemView) {
            super(itemView);
            beautyImage = itemView.findViewById(R.id.image_item);
            nameTv = itemView.findViewById(R.id.name_item);
        }
    }
}