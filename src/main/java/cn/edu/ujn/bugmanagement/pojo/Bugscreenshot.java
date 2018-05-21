package cn.edu.ujn.bugmanagement.pojo;

public class Bugscreenshot {
    private Integer id;

    private Integer bug_id;

    private String screenshot_name;

    private String screenshot_url;

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

    public String getScreenshot_name() {
        return screenshot_name;
    }

    public void setScreenshot_name(String screenshot_name) {
        this.screenshot_name = screenshot_name == null ? null : screenshot_name.trim();
    }

    public String getScreenshot_url() {
        return screenshot_url;
    }

    public void setScreenshot_url(String screenshot_url) {
        this.screenshot_url = screenshot_url == null ? null : screenshot_url.trim();
    }
}