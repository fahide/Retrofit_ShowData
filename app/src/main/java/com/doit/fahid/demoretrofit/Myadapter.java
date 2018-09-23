package com.doit.fahid.demoretrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FAHID on 9/23/2018.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {
    private List<Model> modelList;

    public Myadapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {

       Model m=modelList.get(position);
        holder.id.setText(m.getId());
        holder.session.setText(m.getSession());
        holder.credits.setText(m.getCredits());
        holder.semester.setText(m.getSemester());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
    public class Myviewholder extends RecyclerView.ViewHolder{
        public TextView id,session,credits,semester;

        public Myviewholder(View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.idTV);
            session=itemView.findViewById(R.id.sessionTv);
            credits=itemView.findViewById(R.id.credit);
            semester=itemView.findViewById(R.id.sem);
        }
    }
}
