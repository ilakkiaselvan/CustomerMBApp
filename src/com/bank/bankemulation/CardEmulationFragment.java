package com.bank.bankemulation;


import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CardEmulationFragment extends Fragment {

	public static final String TAG="CardEmulationFragment";
	
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.main_fragment, container, false);
        EditText account = (EditText) v.findViewById(R.id.card_account_field);
        account.setText(AccountStorage.GetAccount(getActivity()));
        account.addTextChangedListener(new AccountUpdater());
        return v;
		
		
	}
	
	
	
	private class AccountUpdater implements TextWatcher{

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			// Not implemented
			
		}

		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			// Not implemented
			
		}

		@Override
		public void afterTextChanged(Editable s) {
			String account=s.toString();
			AccountStorage.SetAccount(getActivity(), account);
			
		}
		
	}
	
}
