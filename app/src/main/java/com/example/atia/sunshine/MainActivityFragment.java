package com.example.atia.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String [] forecastArray = {
            "Today - 1 - 2",
            "Today - 1 - 2",
            "Today - 1 - 2",
            "Today - 1 - 2",
            "Today - 1 - 2",
            "Today - 1 - 2",
            "Today - 1 - 2",
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);

        ListView listview = (ListView) root.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        return root;
    }
}
