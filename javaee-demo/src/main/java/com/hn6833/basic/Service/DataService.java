package com.hn6833.basic.Service;

import com.hn6833.basic.model.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataService {
    private DataModel dataModel;

    @Autowired
    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public boolean saveData() {
        return dataModel.saveData();
    }
}
