package com.example.myaero;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class loginTabFragment extends Fragment{
    private OnButtonClickListener mlistener;
    EditText email, pass;
   // TextView forgetPass;
    Button login;
    float v=0;

    @Override
    public void onAttach (@NonNull Context context){
        super.onAttach(context);
        if (context instanceof OnButtonClickListener){
            mlistener = (OnButtonClickListener) context;
        }
        else {
            throw new ClassCastException(context.toString()+"must implement OnButtonClickListener");
        }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        //forgetPass = root.findViewById(R.id.forget_pass);
        login= root.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });

        email.setTranslationX(800);
        pass.setTranslationX(800);
        //forgetPass.setTranslationX(800);
        login.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        //forgetPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        //forgetPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }
    public interface OnButtonClickListener{
        void onButtonClick();
    }
    private void onLoginButtonClick(){
        //call the intarface method to notify the activity
        if (mlistener != null){
            mlistener.onButtonClick();
        }
    }
}
