/*
      Code by : Tiago Ribeiro Santos
      Date : 17/02/2021
      email : tiago.programador@hotmail.com
      WhatsApp : +55 27 99601-1693

      Classe principal do aplicativo com fragmentos e as mensagens de motivacao.
 */


package br.tiagoribeirosantos.app_frasesdodia.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import br.tiagoribeirosantos.app_frasesdodia.R;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]
            {R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};            //Array com nome de abas.
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {             //Retorna a quantidade de fragmentos (Páginas) no app
        return 3;
    }
}