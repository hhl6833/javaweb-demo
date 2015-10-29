package com.hn6833.basic.model;


import com.hn6833.basic.entity.Data;
import com.hn6833.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class DataModel extends HibernateUtil {

    public boolean saveData() {
        Session session = getCurrentSession();
        Data data = new Data();
        data.setComment("demo-data");
        session.save(data);
        session.flush();
        return true;
    }
}
