package android.salo.app.salomonvaldez.com.taller_programacion_android_salo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Ejercicio_N_27.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Ejercicio_N_27 extends Fragment{
        private EditText numero_a,numero_b,resultado_a,resultado_b;
        private Button calcular_a,calcular_b;

    private OnFragmentInteractionListener mListener;

    public Ejercicio_N_27() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_ejercicio__n_27, container, false);
        numero_a = (EditText) view.findViewById(R.id.txtNumeroa);
        numero_b = (EditText) view.findViewById(R.id.txtNumerob);
        resultado_a = (EditText) view.findViewById(R.id.txtResultadoa);
        resultado_b = (EditText) view.findViewById(R.id.txtResultadob);
        calcular_a = (Button) view.findViewById(R.id.btnVerificara);
        calcular_b = (Button) view.findViewById(R.id.btnVerificarb);

        calcular_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarConDosIf();
            }
        });

        calcular_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificarConUnIfElse();
            }
        });


        return view;
    }
    private void VerificarConDosIf(){
        int num_a;
        num_a = Integer.parseInt(numero_a.getText().toString().trim());
        if (num_a < 35){
            resultado_a.setText("Es Menor que 35");
        }
        if (num_a > 35){
            resultado_a.setText("Es Mayor que 35");
        }
        if (num_a ==35){
            resultado_a.setText("Es igual a 35");
        }
    }
    private void VerificarConUnIfElse(){

        int num_b;
        num_b = Integer.parseInt(numero_b.getText().toString().trim());

        if (num_b<35){
            resultado_b.setText("Es Menor que 35");
        }else if (num_b >35){
            resultado_b.setText("Es Mayor que 35");
        }else if (num_b == 35){
            resultado_b.setText("Es igual a 35");
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
