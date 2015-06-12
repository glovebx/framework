package com.odoo.addons.projects.providers;

import com.odoo.addons.projects.models.ProjectTask;
import com.odoo.core.orm.provider.BaseModelProvider;

/**
 * Created by sla on 12/6/15.
 */
public class ProjectTaskProvider extends BaseModelProvider {

    @Override
    public String authority() {
        return ProjectTask.AUTHORITY;
    }
}
