package com.example.mingming.fragmentbestpractice;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by mingming on 2016/4/13.
 */
public class NewsContentActivity extends Activity {

    public static void actionStart(Context context,String newsTitle,String newsContent){
        Intent intent = new Intent(context,NewsContentActivity.class);
        intent.putExtra("news_title",newsTitle);
        intent.putExtra("news_content",newsContent);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news_content);
        //获取传入的新闻标题
        String newsTitle = getIntent().getStringExtra("new_title");
        //获取传入的新闻内容
        String newsContent = getIntent().getStringExtra("new_content");
        NewsContentFragment newsContentFragment = (NewsContentFragment) getFragmentManager().findFragmentById(R.id.news_content);

        //刷新NewsContentFragemnt界面
        newsContentFragment.refresh(newsTitle,newsContent);
    }
}

















