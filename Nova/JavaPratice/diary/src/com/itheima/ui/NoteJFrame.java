package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Pattern;

public class NoteJFrame extends JFrame implements ActionListener {


    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //定义表格的标题
    Object[] tableTitles = {"编号", "标题", "正文"};
    //定义表格的内容
    //二维数组中的每一个一维数组，是表格里面的一行数据
    Object[][] tabledatas = {
            {"编号1", "标题1", "正文1"},
            {"编号2", "标题2", "正文2"},
            {"编号3", "标题3", "正文3"},
            {"编号4", "标题4", "正文4"},
            {"编号5", "标题5", "正文5"},
            {"编号6", "标题6", "正文6"},
            {"编号7", "标题7", "正文7"},
            {"编号8", "标题8", "正文8"},
            {"编号9", "标题9", "正文9"},
            {"编号10", "标题10", "正文10"},
            {"编号11", "标题11", "正文11"},
            {"编号12", "标题12", "正文12"},
            {"编号13", "标题13", "正文13"},
            {"编号14", "标题14", "正文14"},
            {"编号15", "标题15", "正文15"},
            {"编号16", "标题16", "正文16"},
            {"编号17", "标题17", "正文17"},
            {"编号18", "标题18", "正文18"},
            {"编号19", "标题19", "正文19"},
            {"编号20", "标题20", "正文20"},
            {"编号21", "标题21", "正文21"},
            {"编号22", "标题22", "正文22"},
            {"编号23", "标题23", "正文23"},
            {"编号24", "标题24", "正文24"},
            {"编号25", "标题25", "正文25"},
            {"编号26", "标题26", "正文26"},
            {"编号27", "标题27", "正文27"},
            {"编号28", "标题28", "正文28"},
            {"编号29", "标题29", "正文29"},
            {"编号30", "标题30", "正文30"},
    };

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");

    public NoteJFrame() {
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    public NoteJFrame(Object[][] tabledatas) {
        this.tabledatas = tabledatas;
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if (obj == add) {
            System.out.println("添加按钮被点击");
            this.setVisible(false);
            new AddJFrame(this.tabledatas);

        } else if (obj == update) {
            System.out.println("修改按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，跳转添加界面


            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据
            int i = table.getSelectedRow();
            System.out.println(i);
            if (i < 0) {
                showJDialog("未选择");
                return;
            } else {
                new UpdateJFrame(i, table, tabledatas);
            }


        } else if (obj == delete) {
            System.out.println("删除按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，弹框提示：是否确定删除。此时提示的弹框用showChooseJDialog方法


            //作用：展示一个带有确定和取消按钮的弹框
            //方法的返回值：0 表示用户点击了确定
            //             1 表示用户点击了取消
            //该弹框用于用户删除时候，询问用户是否确定删除
            int i = showChooseJDialog();
            System.out.println(i);
            if (i < 0) {
                showJDialog("未选择");
                return;
            } else if (i == 0) {
                int j = table.getSelectedRow();
                for (int k = 1; k < 3; k++) {
                    table.setValueAt(null, j, k);
                }
            }

        } else if (obj == exportItem) {
            System.out.println("菜单的导出功能");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("diary\\diary.txt"));
                for (int i = 0; i < tabledatas.length; i++) {
                    bw.write(Arrays.toString(tabledatas[i]));
                    bw.newLine();
                }
                bw.close();
                showJDialog("导出成功");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (obj == importItem) {
            System.out.println("菜单的导入功能");
            try {
                BufferedReader br = new BufferedReader(new FileReader("diary\\diary.txt"));
                String line;
                List<String> diaryLines = new ArrayList<>(); // 日记中的行
                while ((line = br.readLine()) != null) {
                    diaryLines.add(line);
                }
                br.close();

                String regex = "\\[[^,]+(,[^,]+){2}\\]"; // 正则表达式匹配如 "[item1,item2,item3]" 的格式
                Pattern pattern = Pattern.compile(regex);

                // 过滤符合正则表达式的行
                List<String> matchedLines = diaryLines.stream()
                        .filter(s -> pattern.matcher(s).matches())
                        .toList();

                // 创建二维数组
                tabledatas = new String[matchedLines.size()][];

                // 遍历每个匹配的行，提取内容并存储到二维数组
                for (int i = 0; i < matchedLines.size(); i++) {
                    String currentLine = matchedLines.get(i);
                    // 去掉首尾的方括号
                    // 例如："[data1, data2, data3]" -> "data1, data2, data3"
                    String content = currentLine.substring(1, currentLine.length() - 1);

                    String[] parts = content.split(",\\s*");
                    // 检查每个分割后的部分，如果它是字符串 "null"，则替换为空字符串
                    for (int j = 0; j < parts.length; j++) {
                        if (parts[j] != null && "null".equalsIgnoreCase(parts[j].trim())) {
                            parts[j] = ""; // 替换为 ""，JTable 会显示为空白
                        }
                    }
                    tabledatas[i] = parts;
                }

                this.setVisible(false);
                new NoteJFrame(tabledatas);
                showJDialog("导入成功");
            } catch (FileNotFoundException ex) {
                System.out.println("文件不存在");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    //初始化组件
    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义表格组件
        //并给表格设置标题和内容
        table = new JTable(tabledatas, tableTitles);
        table.setBounds(40, 70, 504, 380);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40, 70, 504, 380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230, 230, 230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212, 212, 212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();

    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    /*
     *  作用：展示一个带有确定和取消按钮的弹框
     *
     *  方法的返回值：
     *       0 表示用户点击了确定
     *       1 表示用户点击了取消
     *       该弹框用于用户删除时候，询问用户是否确定删除
     * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？", "删除信息确认", JOptionPane.YES_NO_OPTION);
    }
}
