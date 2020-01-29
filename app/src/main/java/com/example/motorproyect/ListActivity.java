package com.example.motorproyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    List<OrdenTrabajo> ordenTrabajoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orden_trabajo);

        recyclerView  =(RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        initData();
        initRecyclerView();

    }



    private void initRecyclerView() {
        OrdenTrabajoAdapter ordenTrabajoAdapter = new OrdenTrabajoAdapter(ordenTrabajoList);
        recyclerView.setAdapter(ordenTrabajoAdapter);

    }

    private void initData() {
        ordenTrabajoList = new ArrayList<>();

        ordenTrabajoList.add(new OrdenTrabajo("123", "Fernando", "Consorcio C&A", "Nissan",
                "V8U041", "ABRIL", "MAYO"));
        ordenTrabajoList.add(new OrdenTrabajo("124", "Jose", "Tecsup", "Audi",
                "V1U538", "ENERO", "MAYO"));
        ordenTrabajoList.add(new OrdenTrabajo("125", "Edwin", "Peru Motor", "Toyota",
                "V8U568", "SEPTIEMBRE", "ABRIL"));
        ordenTrabajoList.add(new OrdenTrabajo("126", "Yadhira", "Gloria", "Subaru",
                "V8U008", "FEBRERO", "JULIO"));
        ordenTrabajoList.add(new OrdenTrabajo("127", "Sebastian", "Sebastian", "Volvo",
                "V5U58 8", "ABRIL", "JUNIO"));
    }
}
