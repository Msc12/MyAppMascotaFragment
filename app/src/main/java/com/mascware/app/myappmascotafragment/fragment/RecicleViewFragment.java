package com.mascware.app.myappmascotafragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mascware.app.myappmascotafragment.R;
import com.mascware.app.myappmascotafragment.adapters.MascotaAdapter;
import com.mascware.app.myappmascotafragment.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by MASC on 17-05-2016.
 */
public class RecicleViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascota;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v= inflater.inflate(R.layout.recicleview_fragment,container,false);

        listaMascota= (RecyclerView) v.findViewById(R.id.recycleviewMascotasPrin);
        LinearLayoutManager llm =new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascota.setLayoutManager(llm);
        inicializarListaMascota();
        inicializarAdapter();
        return v;

    }

    MascotaAdapter adapter;
    public void inicializarAdapter(){
         adapter= new MascotaAdapter(mascotas,getActivity());
        listaMascota.setAdapter(adapter);

    }
    public void inicializarListaMascota(){
        mascotas =new ArrayList<Mascota>();
        mascotas.add(new Mascota("Lucas","3",R.drawable.perro1));
        mascotas.add(new Mascota("Brook","2",R.drawable.perro2));
        mascotas.add(new Mascota("Luna","4",R.drawable.gatapato));
        mascotas.add(new Mascota("Peke","1",R.drawable.chihuahua));
        mascotas.add(new Mascota("Rhyno","2",R.drawable.hamster));
        mascotas.add(new Mascota("Linda","3",R.drawable.perrita));

    }

}
