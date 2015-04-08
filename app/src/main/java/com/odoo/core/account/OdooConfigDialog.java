/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 8/4/15 11:59 AM
 */
package com.odoo.core.account;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.odoo.R;

public class OdooConfigDialog {
    public static final String TAG = OdooConfigDialog.class.getSimpleName();
    private AlertDialog.Builder builder = null;
    private AlertDialog alertDialog = null;
    private Context mContext = null;

    public OdooConfigDialog(Context context) {
        mContext = context;
    }

    public AlertDialog build() {
        builder = new AlertDialog.Builder(mContext);
        builder.setView(getOdooConfigLayout());
        alertDialog = builder.create();
        return alertDialog;
    }

    private View getOdooConfigLayout() {
        LinearLayout layout = (LinearLayout) LayoutInflater.from(mContext)
                .inflate(R.layout.odoo_config_dialog, null, false);
        return layout;
    }
}
