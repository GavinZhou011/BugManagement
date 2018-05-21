package cn.edu.ujn.bugmanagement.pojo;

public class Datadictionary {
    private Integer id;

    private String data_name;

    private Integer data_key;

    private String data_value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData_name() {
        return data_name;
    }

    public void setData_name(String data_name) {
        this.data_name = data_name == null ? null : data_name.trim();
    }

    public Integer getData_key() {
        return data_key;
    }

    public void setData_key(Integer data_key) {
        this.data_key = data_key;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value == null ? null : data_value.trim();
    }
}