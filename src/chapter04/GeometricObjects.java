package chapter04;

import java.util.Date;

/**
 * Created by Peng on 2016/1/23
 * GeometricObjects..
 */
public class GeometricObjects {
    private String color;
    private boolean filled;
    private Date dateCreated;


    /**
     * 创建一个默认几何图形，颜色为 white ，填充为 false 。
     */
    public GeometricObjects() {
        this("white", false);
    }

    /**
     * @param color  颜色
     * @param filled 填充
     */
    public GeometricObjects(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    /**
     * @return 创建时间
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @return 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return 是否填充
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled 是否填充
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * @return 几何图形信息
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
