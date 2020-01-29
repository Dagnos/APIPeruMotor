package com.example.motorproyect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class OrdenTrabajoAdapter extends RecyclerView.Adapter<OrdenTrabajoAdapter.OrdenTrabajoVH>  {

    private static final String TAG = "OrdenTrabajoAdapter";

    List<OrdenTrabajo> ordenTrabajoList;

    public OrdenTrabajoAdapter(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }



    @NonNull
    @Override
    public OrdenTrabajoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orden_trabajo, parent, false);
        return new OrdenTrabajoVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdenTrabajoAdapter.OrdenTrabajoVH holder, int position) {
        OrdenTrabajo ordenTrabajo = ordenTrabajoList.get(position);
        holder.txtOrdenTrabajo.setText(ordenTrabajo.getOrdenTrabajo());
        holder.txtPropietario.setText(ordenTrabajo.getPropietario());
        holder.txtFacturaA.setText(ordenTrabajo.getFacturaa());
        holder.txtVehiculo.setText(ordenTrabajo.getVehiculo());
        holder.txtPlaca.setText(ordenTrabajo.getPlaca());
        holder.txtFechaInicio.setText(ordenTrabajo.getFechaini());
        holder.txtFechaFin.setText(ordenTrabajo.setFechafin());

    }

    @Override
    public int getItemCount() {
        return ordenTrabajoList.size();
    }

    public static class OrdenTrabajoVH extends RecyclerView.ViewHolder {
        private  static final String TAG = "OrdenTrabajoVH";

        TextView txtOrdenTrabajo, txtPropietario, txtFacturaA, txtVehiculo, txtPlaca, txtFechaInicio, txtFechaFin;


        public OrdenTrabajoVH(View itemView) {
            super(itemView);

            this.txtOrdenTrabajo = (TextView) itemView.findViewById(R.id.txtOrdenTrabajo);
            this.txtPropietario = (TextView) itemView.findViewById(R.id.txtPropietario);
            this.txtFacturaA = (TextView) itemView.findViewById(R.id.txtFacturaA);
            this.txtVehiculo = (TextView) itemView.findViewById(R.id.txtVehiculo);
            this.txtPlaca = (TextView) itemView.findViewById(R.id.txtPlaca);
            this.txtFechaInicio = (TextView) itemView.findViewById(R.id.txtFechaInicio);
            this.txtFechaFin = (TextView) itemView.findViewById(R.id.txtFechaFin);



        }
    }
}
