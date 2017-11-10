package com.example.jorge.clashroyale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPrimeraLista extends BaseAdapter {

        Context context;
        List<String> listCalidad;

        public AdaptadorPrimeraLista(Context context, List<String> lista) {
                this.context = context;
                this.listCalidad = lista;
        }


        @Override
        public int getCount() {
                return listCalidad.size();
        }

        @Override
        public Object getItem(int i) {
                return listCalidad.get(i);
        }

        @Override
        public long getItemId(int i) {
                return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View vista = view;
            LayoutInflater inflate = LayoutInflater.from(context);
            vista = inflate.inflate(R.layout.lista_tipo_item, null);
            TextView tvCalidad = vista.findViewById(R.id.tvCalidad);
            tvCalidad.setText(listCalidad.get(i).toString());
            return vista;

        }
}

