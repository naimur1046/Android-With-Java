package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter <RecyclerContactAdapter.ViewHolder>
{
    Context context;
    ArrayList<ContactModel> arrayContacts;

    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrayContacts)
    {
        this.context=context;
        this.arrayContacts=arrayContacts;

    }

    public class ViewHolder extends  RecyclerView.ViewHolder
    {
        TextView textName,textNumber;
        ImageView imageContact;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            textName=itemView.findViewById(R.id.textName);
            textNumber=itemView.findViewById(R.id.textNumber);
            imageContact=itemView.findViewById(R.id.imageContact);

        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageContact.setImageResource(arrayContacts.get(position).Image);
        holder.textName.setText(arrayContacts.get(position).contactName);
        holder.textNumber.setText(arrayContacts.get(position).contactNumber);

    }


    @Override
    public int getItemCount() {
        return arrayContacts.size();
    }
}
