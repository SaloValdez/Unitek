package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_01.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_01 extends Fragment {

    private OnFragmentInteractionListener mListener;

    EditText num, resultado;
    Button verificar;


    List<String> item = null;


    public Ejercicio_N_01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view   = inflater.inflate(R.layout.fragment_ejercicio__n_01,container,false);

        num = (EditText) view.findViewById(R.id.txtNumero);
        resultado =(EditText) view.findViewById(R.id.txtResultado);
        verificar = (Button) view.findViewById(R.id.btnVerificar);
        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NumeroPrimo();
            }
        });
        return view;

    }
    private  void  NumeroPrimo(){
        String numer;
        int n,i,a =0 ;
        numer  = num.getText().toString();
        n = Integer.parseInt(numer);
        if ( n <= 5){
            try {
                for(i=1;i < (n+1);i++){
                    if(n%i==0){
                        a++;
                    }
                }
                if(a!=2){
                    resultado.setText("No es primo");
                    //  System.out.println("No es Primo");
                }else{
                    resultado.setText("Si es primo");
                }
            }catch (Exception e){
                Activity Actividad;
                Actividad = getActivity();
                Toast.makeText(Actividad,"Hay algun Error. Comuniquese con el adminstrador",Toast.LENGTH_LONG).show();
            }
        }else {
            Activity Actividad;
            Actividad = getActivity();
            Toast.makeText(Actividad,"El numero ingresado es mayor que 5",Toast.LENGTH_LONG).show();
        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
