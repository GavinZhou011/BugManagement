package cn.edu.ujn.bugmanagement.pojo;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Bug {
    private Integer id;

    private Integer project_id;

    private Integer moduleId;

    private Integer revision_id;

    private String bug_status;

    private String process_result;

    private String serious_level;

    private String bug_type;

    private String discovery_stage;

    private String title;

    private String description;

    private Integer test_case_id;

    private Integer receiver;

    private Integer creator;

    @NotNull(message="{bug.create_time.isNUll}")
    private Date create_time;

    @NotNull(message="{bug.close_time.isNUll}")
    private Date close_time;


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

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getRevision_id() {
        return revision_id;
    }

    public void setRevision_id(Integer revision_id) {
        this.revision_id = revision_id;
    }

    public String  getBug_status() {
        return bug_status;
    }

    public void setBug_status(String bug_status) {
        this.bug_status = bug_status == null ? null :bug_status.trim();
    }

    public String getProcess_result() {
        return process_result;
    }

    public void setProcess_result(String process_result) {
        this.process_result = process_result == null ? null:process_result.trim();
    }

    public String getSerious_level() {
        return serious_level;
    }

    public void setSerious_level(String serious_level) {
        this.serious_level = serious_level == null ? null : serious_level.trim();
    }

    public String getBug_type() {
        return bug_type;
    }

    public void setBug_type(String bug_type) {
        this.bug_type = bug_type == null ? null : bug_type.trim();
    }

    public String getDiscovery_stage() {
        return discovery_stage;
    }

    public void setDiscovery_stage(String discovery_stage) {
        this.discovery_stage = discovery_stage == null ? null : discovery_stage.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getClose_time() {
        return close_time;
    }

    public void setClose_time(Date close_time) {
        this.close_time = close_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getTest_case_id() {
        return test_case_id;
    }

    public void setTest_case_id(Integer test_case_id) {
        this.test_case_id = test_case_id;
    }
}