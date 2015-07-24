package net.tucompualdia.app.calctablas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

/**
 * Creado por Jairo Fernández para Tu compu al día 20/07/15.
 */
public class menu1_fragment extends android.support.v4.app.Fragment {
    View rootview;
    Spinner spiner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu1_fragment, container, false);
        spiner = (Spinner)container.findViewById(R.id.spinner);
        return rootview;
    }
}
