package umn.ac.id;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolder> {
    private final ArrayList<Data> data;

    public AdapterData(ArrayList<Data> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String textUid = "UID: " + data.get(position).getUserId();
        String textId = "ID: " + data.get(position).getId();

        holder.Title.setText(data.get(position).getTitle());
        holder.Body.setText(data.get(position).getBody());
        holder.Uid.setText(textUid);
        holder.Id.setText(textId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView Title, Body, Uid, Id;

        public ViewHolder(View view) {
            super(view);

            Title = view.findViewById(R.id.textViewTitle);
            Body = view.findViewById(R.id.textViewBody);
            Uid = view.findViewById(R.id.textViewUid);
            Id = view.findViewById(R.id.textViewId);
        }
    }
}
