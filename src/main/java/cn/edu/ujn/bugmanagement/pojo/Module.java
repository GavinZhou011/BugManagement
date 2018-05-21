package cn.edu.ujn.bugmanagement.pojo;

public class Module {
    private Integer id;

    private Integer project_id;

    private String module_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name == null ? null : module_name.trim();
    }
}