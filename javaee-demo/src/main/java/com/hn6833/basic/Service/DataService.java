package com.hn6833.basic.Service;

import com.hn6833.basic.model.DataModel;

public class DataService {
    private DataModel dataModel;

    public DataModel getDataModel() {
        return dataModel;
    }

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public String getData() {
        return dataModel.getData();
    }
}
