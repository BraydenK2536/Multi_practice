package Nova.domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener{
    private String name;
    private boolean up;
    private boolean canClick = false;
    private boolean clicked = false;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Poker(String name, boolean up,int id) {
        this.name = name;
        this.up = up;
        this.id = id;
        if (this.up) {
            turnFront();
        } else {
            turnBack();
        }
        this.setSize(71, 96);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    public void turnFront() {
        this.setIcon(new ImageIcon("image\\poker\\" + name + ".png"));
        this.up = true;
    }
    public void turnBack() {
        this.setIcon(new ImageIcon("image\\poker\\" + name + ".png"));
        this.up = false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int step = 0;
        if(canClick) {
            if(clicked) {
                step = 20;
            }else{
                step = -20;
            }
            clicked = !clicked;
            Point from = this.getLocation();
            Point to = new Point(from.x,from.y + step);
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     *
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     *
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     *
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     *
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     *
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
