package com.example.myapplication22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {
        private ArrayList<Game> gamesList;
        private Context context;
        public GameAdapter(Context context, ArrayList<Game> gamesList) {
            this.context = context;
            this.gamesList = gamesList;
        }
        @NonNull
        @Override
        public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new GameViewHolder(view);
        }

        @Override
        public void onBindViewHolder(GameViewHolder holder, int position) {
            Game game = gamesList.get(position);
            holder.gameNameTv.setText(game.getName());
            holder.imageView.setImageResource(game.getImageResource());
        }

        @Override
        public int getItemCount() {
            return gamesList.size();
        }

        public static class GameViewHolder extends RecyclerView.ViewHolder {
            TextView gameNameTv;
            ImageView imageView;

            public GameViewHolder(View itemView) {
                super(itemView);
                gameNameTv = itemView.findViewById(R.id.group_name);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }


