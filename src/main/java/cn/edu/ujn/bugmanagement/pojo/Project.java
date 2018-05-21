package cn.edu.ujn.bugmanagement.pojo;

public class Project {
    private Integer id;

    private Integer develop_branch_id;

    private Integer test_branch_id;

    private String project_name;

    private String history_version;

    private String current_version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDevelop_branch_id() {
        return develop_branch_id;
    }

    public void setDevelop_branch_id(Integer develop_branch_id) {
        this.develop_branch_id = develop_branch_id;
    }

    public Integer getTest_branch_id() {
        return test_branch_id;
    }

    public void setTest_branch_id(Integer test_branch_id) {
        this.test_branch_id = test_branch_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name == null ? null : project_name.trim();
    }

    public String getHistory_version() {
        return history_version;
    }

    public void setHistory_version(String history_version) {
        this.history_version = history_version == null ? null : history_version.trim();
    }

    public String getCurrent_version() {
        return current_version;
    }

    public void setCurrent_version(String current_version) {
        this.current_version = current_version == null ? null : current_version.trim();
    }
}