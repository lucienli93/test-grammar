/*
 * Copyright (C), 2013-2019, 
 * FileName: Banana.java
 * Author:   liyizhen
 * Date:     2019��6��11�� ����10:44:48
 * Description: //ģ��Ŀ�ġ���������      
 * History: //�޸ļ�¼
 * <author>      <time>      <version>    <desc>
 * �޸�������             �޸�ʱ��            �汾��                  ����
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
