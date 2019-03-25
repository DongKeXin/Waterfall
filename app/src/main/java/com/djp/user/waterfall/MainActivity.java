package com.djp.user.waterfall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Beauty> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //使用瀑布流布局,第一个参数 spanCount 列数,第二个参数 orentation 排列方向
        StaggeredGridLayoutManager recyclerViewLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //线性布局Manager
//        LinearLayoutManager recyclerViewLayoutManager = new LinearLayoutManager(this);
//        recyclerViewLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //网络布局Manager
//        GridLayoutManager recyclerViewLayoutManager = new GridLayoutManager(this, 3);
        //给recyclerView设置LayoutManager
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        initData();

        BeautyAdapter adapter = new BeautyAdapter(data, this);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }

    /**
     * 生成一些数据添加到集合中
     */
    private void initData() {
        Beauty beauty;
        for (int i = 0; i < 10; i++) {
            beauty = new Beauty("美女" + i, R.mipmap.m1);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m2);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m3);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m4);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m5);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m6);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m7);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m8);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m9);
            data.add(beauty);
            beauty = new Beauty("美女" + i, R.mipmap.m10);
            data.add(beauty);
        }
    }
}