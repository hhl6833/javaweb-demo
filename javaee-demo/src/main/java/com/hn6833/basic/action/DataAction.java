package com.hn6833.basic.action;

import com.hn6833.basic.Service.DataService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataAction extends ActionSupport {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
