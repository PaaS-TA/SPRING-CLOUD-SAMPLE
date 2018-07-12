package org.openpaas.paasta.portal.api.two.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity
 * 해당 클래스가 엔티티임을 알리기 위해 사용한다. 애플리케이션이 실행이 될 때 엔티티 자동검색을 통하여 이 어노테이션이 선언 된 클래스들은 엔티티 빈으로 등록한다.
 *
 * Table
 * 데이터 저장소인 테이블을 의미하며, name 값은 실제 데이터베이스의 테이블명이고, 생략하면 클레스의 이름을 테이블의 이름으로 자동 인식한다.
 */
@Entity
@Table(name = "servicepack_category")
public class ServicepackCategory {

    /**
     * Id
     * 엔티티빈의 기본키를 의미하며, 하나의 엔티티에는 반드시 존재해야 한다.
     *
     * Column
     * 필드와 테이블의 컬럼을 매핑시켜준다. 생략이 가능하며, 생략시 필드의 이름이 테이블의 컬럼으로 자동으로 매핑이된다.
     */
    @Id
    @Column(name = "no", nullable = false)
    private int no;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "classification", nullable = false)
    private String classification;

    @Column(name = "summary", nullable = false)
    private String summary;

    @Column(name = "description")
    private String description;

    @Column(name = "service_name", nullable = false)
    private String servicePackName;

    @Column(name = "thumb_img_name")
    private String thumbImgName;

    @Column(name = "thumb_img_path")
    private String thumbImgPath;

    @Column(name = "doc_file_url")
    private String docFileUrl;


    @Column(name = "use_yn", nullable = false)
    private String useYn;

    @Column(name = "user_id", nullable = false)
    private String userId;

    /**
     * CreationTimestamp
     * Insert 시 자동으로 시간을 입력해준다.
     *
     * Temporal
     * Date 를 DB 타입에 맞게 매핑할 수 있다.
     */
    @CreationTimestamp
    @Column(name = "created", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    /**
     * UpdateTimestamp
     * Update 시 자동으로 시간을 입력해준다.
     */
    @UpdateTimestamp
    @Column(name = "lastmodified", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastmodified;

    @Column(name = "parameter")
    private String parameter;

    @Column(name = "app_bind_parameter")
    private String appBindParameter;

    @Column(name = "dashboard_use_yn", nullable = false)
    private String dashboardUseYn;

    @Column(name = "app_bind_yn")
    private String appBindYn;

    /**
     * Transient
     * DB 테이블에 간섭하지 않고, 엔티티 클래스 내부에서만 사용하는 필드.
     */
    @Transient
    private String searchKeyword;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServicePackName() {
        return servicePackName;
    }

    public void setServicePackName(String servicePackName) {
        this.servicePackName = servicePackName;
    }

    public String getThumbImgName() {
        return thumbImgName;
    }

    public void setThumbImgName(String thumbImgName) {
        this.thumbImgName = thumbImgName;
    }

    public String getThumbImgPath() {
        return thumbImgPath;
    }

    public void setThumbImgPath(String thumbImgPath) {
        this.thumbImgPath = thumbImgPath;
    }

    public String getDocFileUrl() {
        return docFileUrl;
    }

    public void setDocFileUrl(String docFileUrl) {
        this.docFileUrl = docFileUrl;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * JsonFormat
     * 날짜를 Json 포멧 형식으로 나타낸다.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getAppBindParameter() {
        return appBindParameter;
    }

    public void setAppBindParameter(String appBindParameter) {
        this.appBindParameter = appBindParameter;
    }

    public String getDashboardUseYn() {
        return dashboardUseYn;
    }

    public void setDashboardUseYn(String dashboardUseYn) {
        this.dashboardUseYn = dashboardUseYn;
    }

    public String getAppBindYn() {
        return appBindYn;
    }

    public void setAppBindYn(String appBindYn) {
        this.appBindYn = appBindYn;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Override
    public String toString() {
        return "ServicepackCategory{" + "no=" + no + ", name='" + name + '\'' + ", classification='" + classification + '\'' + ", summary='" + summary + '\'' + ", description='" + description + '\'' + ", servicePackName='" + servicePackName + '\'' + ", thumbImgName='" + thumbImgName + '\'' + ", thumbImgPath='" + thumbImgPath + '\'' + ", docFileUrl='" + docFileUrl + '\'' + ", useYn='" + useYn + '\'' + ", userId='" + userId + '\'' + ", created=" + created + ", lastmodified=" + lastmodified + ", parameter='" + parameter + '\'' + ", appBindParameter='" + appBindParameter + '\'' + ", dashboardUseYn='" + dashboardUseYn + '\'' + ", appBindYn='" + appBindYn + '\'' + ", searchKeyword='" + searchKeyword + '\'' + '}';
    }
}
