package Nova.game;

import Nova.domain.Poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GameJFrame extends JFrame implements ActionListener {

    public static Container container = null;

    JButton[] landlord = new JButton[2];
    JButton[] publishCard = new JButton[2];
    JLabel dizhu;
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();
    JTextField[] time = new JTextField[3];

    static ArrayList<Poker> pokerList = new ArrayList<Poker>();
    // 玩家手牌，地主牌牌盒初始化
    static ArrayList<Poker> player0 = new ArrayList<>();
    static ArrayList<Poker> player1 = new ArrayList<>();
    static ArrayList<Poker> player2 = new ArrayList<>();
    static ArrayList<Poker> lordList = new ArrayList<>();

    public GameJFrame() {
        // 设置任务栏的图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("image\\poker\\dizhu.png"));
        // 设置界面
        initJframe();
        // 添加组件
        initView();
        // 界面显示出来
        this.setVisible(true);

        // 初始化牌（洗牌、发牌、排序）
        initCard();
        // 打牌之前的准备工作
        initGame();
    }

    // 初始化牌（洗牌、发牌）
    public void initCard() {
        int serialNumber = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Poker poker = new Poker(i + "-" + j, false, serialNumber);
                poker.setLocation(350, 150);
                pokerList.add(poker);
                container.add(poker);
                serialNumber++;
            }
        }
        Poker poker = new Poker("5-1", false, ++serialNumber);
        poker.setLocation(350, 150);
        pokerList.add(poker);
        container.add(poker);
        Poker poker1 = new Poker("5-2", false, ++serialNumber);
        poker1.setLocation(350, 150);
        pokerList.add(poker1);
        container.add(poker1);
        // 洗牌
        Collections.shuffle(pokerList);
        // 发牌
        dealCards();
        //排序
        playerList.add(player0);
        playerList.add(player1);
        playerList.add(player2);
        for (int i = 0; i < playerList.size(); i++) {
            order(playerList.get(i));
            Common.rePosition(this, playerList.get(i), i);
        }

    }

    private void order(ArrayList<Poker> pokerList) {
        Collections.sort(pokerList, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    private void dealCards() {
        player0.clear();
        player1.clear();
        player2.clear();
        lordList.clear();

        for (int i = 0; i < pokerList.size(); i++) {
            Poker poker = pokerList.get(i);
            if (i <= 2) {
                //把底牌添加到集合中
                lordList.add(poker);
                Common.move(poker, poker.getLocation(), new Point(270 + (75 * i), 10));
                continue;
            }

            //给三个玩家发牌
            if (i % 3 == 0) {
                //给左边的电脑发牌
                Common.move(poker, poker.getLocation(), new Point(50, 60 + i * 5));
                player0.add(poker);
            } else if (i % 3 == 1) {
                //给中间的自己发牌
                Common.move(poker, poker.getLocation(), new Point(180 + i * 7, 450));
                player1.add(poker);
                //把自己的牌展示正面
                poker.turnFront();
            } else if (i % 3 == 2) {
                //给右边的电脑发牌
                Common.move(poker, poker.getLocation(), new Point(700, 60 + i * 5));
                player2.add(poker);
            }
            container.setComponentZOrder(poker, 0);
        }
    }

    // 打牌之前的准备工作
    private void initGame() {
        // 创建三个集合用来装三个玩家准备要出的牌
        for (int i = 0; i < 3; i++) {
            ArrayList<Poker> list = new ArrayList<>();
            currentList.add(list);
        }

        // 展示抢地主和不抢地主两个按钮
        landlord[0].setVisible(true);
        landlord[1].setVisible(true);

        // 展示自己前面的倒计时文本
        for (JTextField field : time) {
            field.setText("倒计时30秒");
            field.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 按钮事件处理逻辑
    }

    // 添加组件
    public void initView() {
        // 创建抢地主的按钮
        JButton robBut = new JButton("抢地主");
        robBut.setBounds(320, 400, 75, 20);
        robBut.addActionListener(this);
        robBut.setVisible(false);
        landlord[0] = robBut;
        container.add(robBut);

        // 创建不抢的按钮
        JButton noBut = new JButton("不     抢");
        noBut.setBounds(420, 400, 75, 20);
        noBut.addActionListener(this);
        noBut.setVisible(false);
        landlord[1] = noBut;
        container.add(noBut);

        // 创建出牌的按钮
        JButton outCardBut = new JButton("出牌");
        outCardBut.setBounds(320, 400, 60, 20);
        outCardBut.addActionListener(this);
        outCardBut.setVisible(false);
        publishCard[0] = outCardBut;
        container.add(outCardBut);

        // 创建不要的按钮
        JButton noCardBut = new JButton("不要");
        noCardBut.setBounds(420, 400, 60, 20);
        noCardBut.addActionListener(this);
        noCardBut.setVisible(false);
        publishCard[1] = noCardBut;
        container.add(noCardBut);

        // 创建三个玩家前方的提示文字：倒计时
        for (int i = 0; i < 3; i++) {
            time[i] = new JTextField("倒计时:");
            time[i].setEditable(false);
            time[i].setVisible(false);
            container.add(time[i]);
        }
        time[0].setBounds(140, 230, 60, 20);
        time[1].setBounds(374, 360, 60, 20);
        time[2].setBounds(620, 230, 60, 20);

        // 创建地主图标
        dizhu = new JLabel(new ImageIcon("images/dizhu.png"));
        dizhu.setVisible(false);
        dizhu.setSize(40, 40);
        container.add(dizhu);
    }

    // 设置界面
    public void initJframe() {
        // 设置标题
        this.setTitle("斗地主");
        // 设置大小
        this.setSize(830, 620);
        // 设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口无法进行调节
        this.setResizable(false);
        // 界面居中
        this.setLocationRelativeTo(null);
        // 获取界面中的隐藏容器，以后直接用无需再次调用方法获取了
        container = this.getContentPane();
        // 取消内部默认的居中放置
        container.setLayout(null);
        // 设置背景颜色
        container.setBackground(Color.LIGHT_GRAY);
    }
}