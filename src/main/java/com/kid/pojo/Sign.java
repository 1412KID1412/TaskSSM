package com.kid.pojo;

/**
 * 学生签到的实体类
 */
public class Sign {
    private Integer id;//唯一编号，没有什么实际意义
    private String name;//姓名
    private String sno;//学号
    private String classnumber;//班级编号
    private String cours;//课程名称
    private String datatime;//签到时间
    private String num;//座位号

    public Sign() {
    }

    public Sign(Integer id, String name, String sno, String classNumber, String cours, String datatime, String num) {
        this.id = id;
        this.name = name;
        this.sno = sno;
        this.classnumber = classNumber;
        this.cours = cours;
        this.datatime = datatime;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", classNumber='" + classnumber + '\'' +
                ", cours='" + cours + '\'' +
                ", datatime='" + datatime + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
