package cn.edu.ujn.bugmanagement.pojo;

import java.util.Date;

public class Revision {
    private Integer id;

    private Integer bug_id;

    private String revision_status;

    private Boolean test_result;

    private String description;

    private String test_suggestion;

    private String revise_file_url;

    private Integer return_times;

    private Integer revise_programmer;

    private Integer integrator;

    private Integer filing_person;

    private Integer sender;

    private Integer receiver;

    private Integer tester;

    private Date creat_time;

    private Date test_begin_time;

    private Date test_end_time;

    private Integer test_duration;

    private Date revise_begin_time;

    private Date revision_end_time;

    private Integer revise_duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBug_id() {
        return bug_id;
    }

    public void setBug_id(Integer bug_id) {
        this.bug_id = bug_id;
    }

    public String getRevision_status() {
        return revision_status;
    }

    public void setRevision_status(String revision_status) {
        this.revision_status = revision_status == null ? null : revision_status.trim();
    }

    public Boolean getTest_result() {
        return test_result;
    }

    public void setTest_result(Boolean test_result) {
        this.test_result = test_result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTest_suggestion() {
        return test_suggestion;
    }

    public void setTest_suggestion(String test_suggestion) {
        this.test_suggestion = test_suggestion == null ? null : test_suggestion.trim();
    }

    public String getRevise_file_url() {
        return revise_file_url;
    }

    public void setRevise_file_url(String revise_file_url) {
        this.revise_file_url = revise_file_url == null ? null : revise_file_url.trim();
    }

    public Integer getReturn_times() {
        return return_times;
    }

    public void setReturn_times(Integer return_times) {
        this.return_times = return_times;
    }

    public Integer getRevise_programmer() {
        return revise_programmer;
    }

    public void setRevise_programmer(Integer revise_programmer) {
        this.revise_programmer = revise_programmer;
    }

    public Integer getIntegrator() {
        return integrator;
    }

    public void setIntegrator(Integer integrator) {
        this.integrator = integrator;
    }

    public Integer getFiling_person() {
        return filing_person;
    }

    public void setFiling_person(Integer filing_person) {
        this.filing_person = filing_person;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getTester() {
        return tester;
    }

    public void setTester(Integer tester) {
        this.tester = tester;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Date getTest_begin_time() {
        return test_begin_time;
    }

    public void setTest_begin_time(Date test_begin_time) {
        this.test_begin_time = test_begin_time;
    }

    public Date getTest_end_time() {
        return test_end_time;
    }

    public void setTest_end_time(Date test_end_time) {
        this.test_end_time = test_end_time;
    }

    public Integer getTest_duration() {
        return test_duration;
    }

    public void setTest_duration(Integer test_duration) {
        this.test_duration = test_duration;
    }

    public Date getRevise_begin_time() {
        return revise_begin_time;
    }

    public void setRevise_begin_time(Date revise_begin_time) {
        this.revise_begin_time = revise_begin_time;
    }

    public Date getRevision_end_time() {
        return revision_end_time;
    }

    public void setRevision_end_time(Date revision_end_time) {
        this.revision_end_time = revision_end_time;
    }

    public Integer getRevise_duration() {
        return revise_duration;
    }

    public void setRevise_duration(Integer revise_duration) {
        this.revise_duration = revise_duration;
    }
}