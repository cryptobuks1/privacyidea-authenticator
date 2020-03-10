/*
  privacyIDEA Authenticator

  Authors: Nils Behlen <nils.behlen@netknights.it>

  Copyright (c) 2017-2019 NetKnights GmbH

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/

package it.netknights.piauthenticator.viewcontroller;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import it.netknights.piauthenticator.R;
import it.netknights.piauthenticator.utils.AppConstants;

import static it.netknights.piauthenticator.R.color.PIBLUE;

public class AboutActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.AboutTitle);
        setContentView(R.layout.activity_about);
        setupViews();
        paintStatusbar();
        setupActionBar();
        setupList();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    }

    private void setupList() {
        ArrayList<String> acknowledgements = new ArrayList<>();

        acknowledgements.add(getString(R.string.license_apache_20));
        acknowledgements.add(getString(R.string.license_otpauth));
        acknowledgements.add(getString(R.string.license_zxing_embed));
        acknowledgements.add(getString(R.string.license_android_code_sample));
        acknowledgements.add(getString(R.string.license_gson));
        acknowledgements.add(getString(R.string.license_firebase));

        AboutListAdapter adapter = new AboutListAdapter();
        listView.setAdapter(adapter);
        adapter.setAcknowledgements(acknowledgements);
        adapter.notifyDataSetChanged();
    }

    private void setupViews() {
        listView = findViewById(R.id.listView_about);
        TextView textViewVersion = findViewById(R.id.textView_version);
        PackageInfo info = null;

        try {
            info = getPackageManager().getPackageInfo(AppConstants.PACKAGE_NAME, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (info != null) {
            String str = getString(R.string.version) + " "+ info.versionName;
            textViewVersion.setText(str);
        } else {
            textViewVersion.setText(R.string.version);
        }
    }

    public void paintStatusbar() {
        //------------------ try to paint the statusbar -------------------------------
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(PIBLUE));
        }
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar.
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(PIBLUE)));
        }
    }
}
