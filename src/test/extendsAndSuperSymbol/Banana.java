/*
 * Copyright (C), 2013-2019, 
 * FileName: Banana.java
 * Author:   liyizhen
 * Date:     2019年6月11日 上午10:44:48
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test.extendsAndSuperSymbol;

public class Banana extends Fruit {
    private String color;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Banana [color=" + color + "]";
    }
}
