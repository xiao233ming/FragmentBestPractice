package com.example.mingming.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mingming.fragmentbestpractice.R;

import java.util.List;

/**
 * Created by mingming on 2016/4/13.
 */
public class NewsAdapter extends ArrayAdapter<News> {
    private int resourceId;

    public NewsAdapter(Context context, int textViewResourceId, List<News> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;;
    }

    //在 getView()方法中，我们获取到了相应位置上的 News 类，并让新闻的标题在列表中显示
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        }else{
            view = convertView;
        }
        TextView newTitleText = (TextView) view.findViewById(R.id.news_title);
        return view;
    }
}
