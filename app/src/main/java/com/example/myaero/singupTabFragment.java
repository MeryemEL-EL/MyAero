package com.example.myaero;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class singupTabFragment extends Fragment {
    private  OnButtonClickListener mlistener;

    EditText emaile, number,pass1, pass2;
    Button singup;
    float v;

    @Override
    public void onAttach (@NonNull Context context){
        super.onAttach(context);
        if(context instanceof OnButtonClickListener){
            mlistener = (OnButtonClickListener) context;
        }
        else {
            throw new ClassCastException(context.toString()+"must implement OnButtonClickListener");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.singnup_tab_fragment, container, false);

        emaile = root.findViewById(R.id.email1);
        number= root.findViewById(R.id.number);
        pass1 = root.findViewById(R.id.pass1);
        pass2 = root.findViewById(R.id.pass2);
        singup = root.findViewById(R.id.signup);

        singup.setBackgroundColor(getResources().getColor(R.color.b));
  //      singup.setOnClickListener(new View.OnClickListener() {
     //       @Override
        //    public void onClick(View v) {
           //     Intent inten = new Intent(singupTabFragment.this, MainActivity3.class);
            //    startActivity(inten);
      //      }
       // });
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSignupButtonClick();
            }
        });

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
    public interface OnButtonClickListener{
        void onButtonClick();
    }
    private void onSignupButtonClick(){
        if(mlistener != null){
            mlistener.onButtonClick();
        }
    }
}
