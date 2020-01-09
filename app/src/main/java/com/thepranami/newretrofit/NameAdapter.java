package com.thepranami.newretrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.MyViewHolder> {
    private List<Android> android;
    private ClickListener clickListener;

    public NameAdapter(List<Android> android, ClickListener clickListener){
        this.android = android;
        this.clickListener = clickListener;
    }

    @Override
    public NameAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.name, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameAdapter.MyViewHolder holder, int position) {
        Android model= android.get(position);
        holder.clickBind(model, clickListener);
        holder.name.setText(model.getName());
        holder.version.setText(model.getVer());
        holder.api.setText(model.getApi());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name, version, api;
        public MyViewHolder(View view){
            super(view);
            name=view.findViewById(R.id.name);
            version=view.findViewById(R.id.version);
            api=view.findViewById(R.id.api);
        }

        public void clickBind(final Android item, final ClickListener clickListener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.clickItem(item);
                }
            });
        }
    }
    public interface ClickListener{
        public void clickItem(Android item);
    }
}
