package com.usemalloc.jabdam;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by ujjawalpathak on 19/10/17.
 */

public class MessageAdapter extends ArrayAdapter<MessageModel> {
    public MessageAdapter(Context context, int resource, List<MessageModel> objects) {
        super(context,resource,objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message,parent,false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView  messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView  authorTextView = (TextView)  convertView.findViewById(R.id.nameTextView);

        MessageModel message = getItem(position);

        boolean isPhoto = message.getPhotoUrl() != null;

        if (isPhoto) {
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext()).load(message.getPhotoUrl()).into(photoImageView);
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(message.getText());
        }

        authorTextView.setText(message.getName());

        return convertView;

    }

}
