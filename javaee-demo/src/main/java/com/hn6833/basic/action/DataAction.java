package com.hn6833.basic.action;

import com.hn6833.basic.Service.DataService;
import com.opensymphony.xwork2.ActionSupport;

public class DataAction extends ActionSupport {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
