package net.tucompualdia.app.calctablas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Creado por Jairo Fernández para Tu compu al día 20/07/15.
 */
public class menu2_fragment extends android.support.v4.app.Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.menu2_fragment, container, false);
        return rootview;
    }
}
