package com.example.gmail;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contactModelList;

    public ContactAdapter(List<ContactModel> contactModelList) {
        this.contactModelList = contactModelList;
    }

    @Override
    public int getCount() {
        return contactModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textFullName = convertView.findViewById(R.id.text_fullname);
            viewHolder.imageAvatar = convertView.findViewById(R.id.image_avatar);
            viewHolder.round = convertView.findViewById((R.id.round));
            viewHolder.imageFavourite = convertView.findViewById(R.id.image_favourite);
            viewHolder.textDes = convertView.findViewById(R.id.text_des);
            viewHolder.textTime = convertView.findViewById(R.id.text_time);
            convertView.setTag(viewHolder);
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            viewHolder.round.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
        else
            viewHolder = (ViewHolder) convertView.getTag();
//        ImageView imageAvatar = convertView.findViewById(R.id.image_avatar);
//        TextView textFullName = convertView.findViewById(R.id.text_fullname);

       final ContactModel contact = contactModelList.get(position);
        viewHolder.imageAvatar.setImageResource(contact.getAvatarResource());
        viewHolder.textFullName.setText(contact.getFullName());
        viewHolder.round.setText(contact.getFullName().substring(0,1).toUpperCase());
        viewHolder.textTime.setText(contact.getTime());
        viewHolder.textDes.setText(contact.getDescription());


        if(contact.isSelected()){
            viewHolder.imageFavourite.setImageResource(R.drawable.ic_star_favourite);
        }
        else
            viewHolder.imageFavourite.setImageResource(R.drawable.ic_star_normal);

            viewHolder.imageFavourite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isSelected = contactModelList.get(position).isSelected();
                    contactModelList.get(position).setSelected(!isSelected);
                    notifyDataSetChanged();

                }
            });

        return convertView;
    }
    class ViewHolder {
        ImageView imageAvatar;
        TextView round;
        TextView textFullName;
        ImageView imageFavourite;
        TextView textDes;
        TextView textTime;

    }
}
