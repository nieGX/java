package com.self.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        this.map.put(id,entity);
    }
    public void delete(String id){
        map.remove(id);
    }
    public List<T> list(){
        return new ArrayList<>(map.values());
    }
}
