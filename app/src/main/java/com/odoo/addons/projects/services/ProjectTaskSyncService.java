package com.odoo.addons.projects.services;

import android.content.Context;
import android.os.Bundle;

import com.odoo.addons.projects.models.ProjectTask;
import com.odoo.core.service.OSyncAdapter;
import com.odoo.core.service.OSyncService;
import com.odoo.core.support.OUser;

/**
 * Created by sla on 12/6/15.
 */
public class ProjectTaskSyncService extends OSyncService {
    @Override
    public OSyncAdapter getSyncAdapter(OSyncService service, Context context) {
        return new OSyncAdapter(getApplicationContext(), ProjectTask.class, service, true);
    }

    @Override
    public void performDataSync(OSyncAdapter adapter, Bundle extras, OUser user) {
        adapter.syncDataLimit(30);
    }
}
