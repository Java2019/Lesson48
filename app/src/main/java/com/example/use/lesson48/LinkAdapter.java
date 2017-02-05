package com.example.use.lesson48;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by use on 05.02.17.
 */
public class LinkAdapter extends ArrayAdapter<Link> {

    private final Context context;
    private final Link[] resource;

    public LinkAdapter(Context context, Link[] resource) {
        super(context, 0, resource);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)  {
        Link link = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, null);
        }
        ((TextView)convertView.findViewById(R.id.text_view)).setText(Html.fromHtml(link.getLink()));
        ((ImageView)convertView.findViewById(R.id.ivImg)).setImageResource(link.getImage());
        return convertView;
    }
}
