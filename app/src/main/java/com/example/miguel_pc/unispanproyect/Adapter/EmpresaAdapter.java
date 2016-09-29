package com.example.miguel_pc.unispanproyect.Adapter;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miguel_pc.unispanproyect.Model.ListEmpresa;
import com.example.miguel_pc.unispanproyect.R;

import java.util.List;

/**
 * Created by Miguel-PC on 25/09/2016.
 */

public class EmpresaAdapter extends RecyclerView.Adapter<EmpresaAdapter.ViewHolder> {

    private List<ListEmpresa> empresa;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.obra,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.NombreEmpresaTextView.setText(empresa.get(position).getNombreEmpresa());
        holder.NumeroTextView.setText(empresa.get(position).getNumero());
        holder.EstadoTextView.setText(empresa.get(position).getEstado());
        holder.PictureImageView.setImageResource(Integer.parseInt(empresa.get(position).getPictureEmpresa()));

    }

    @Override
    public int getItemCount() { return empresa.size();}

    public List<ListEmpresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(List<ListEmpresa> empresa) {
        this.empresa = empresa;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView obraCardView;
        TextView NombreEmpresaTextView;
        TextView NumeroTextView;
        TextView EstadoTextView;
        ImageView PictureImageView;

        public ViewHolder(View itemView){
            super(itemView);

            obraCardView = (CardView) itemView.findViewById(R.id.obraCardView);
            NombreEmpresaTextView = (TextView) itemView.findViewById(R.id.empresaTextView);
            NumeroTextView = (TextView) itemView.findViewById(R.id.numeroTextView);
            EstadoTextView = (TextView) itemView.findViewById(R.id.EstadoPendienteTextView);
            PictureImageView = (ImageView) itemView.findViewById(R.id.pictureEmpresa);

        }
    }
}
