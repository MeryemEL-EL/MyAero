package com.example.myaero;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class singupTabFragment extends Fragment {

    EditText emaile, number,pass1, pass2;
    Button singup;
    float v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.singnup_tab_fragment, container, false);

        emaile = root.findViewById(R.id.email1);
        number= root.findViewById(R.id.number);
        pass1 = root.findViewById(R.id.pass1);
        pass2 = root.findViewById(R.id.pass2);
        singup = root.findViewById(R.id.button2);

        singup.setBackgroundColor(getResources().getColor(R.color.b));

        emaile.setTranslationX(800);
        number.setTranslationX(800);
        pass1.setTranslationX(800);
        pass2.setTranslationX(800);
        singup.setTranslationX(800);

        emaile.setAlpha(v);
        number.setAlpha(v);
        pass1.setAlpha(v);
        pass2.setAlpha(v);
        singup.setAlpha(v);

        emaile.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        number.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass1.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass2.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        singup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();


        return root;
    }
}
