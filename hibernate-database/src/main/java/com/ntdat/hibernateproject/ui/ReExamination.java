/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ntdat.hibernateproject.ui;

import com.ntdat.hibernateproject.ui.customcomponent.RoundedPanel;
import com.ntdat.hibernateproject.ui.customcomponent.FlatButton;
import com.ntdat.hibernateproject.ui.customcomponent.FlatTextArea;
import com.ntdat.hibernateproject.ui.customcomponent.FlatTextInput;
import com.ntdat.hibernateproject.ui.customcomponent.RoundedJFrame;
import com.ntdat.hibernateproject.ui.customcomponent.MyScrollbarUI;
import com.ntdat.hibernateproject.ui.customcomponent.HeaderRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author tuand
 */
public class ReExamination extends RoundedJFrame {

    /**
     * Creates new form Home
     */
    public ReExamination() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        btnClose = new RoundedPanel(10);
        txtClose = new JLabel();
        btnMinimize = new RoundedPanel(10);
        txtMinimize = new JLabel();
        jLabel3 = new JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnClassroom = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        btnClassroom1 = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        btnClassroom2 = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        btnClassroom3 = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        btnClassroom4 = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        btnClassroom5 = new FlatButton(new Color(36,55,114), new Color(36,55,114), new Color(88,102,146));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnSearch = new FlatButton(new Color(58,66,129), new Color(30,34,82), new Color(36,55,114));
        btnImportCSV = new FlatButton(new Color(58,66,129), new Color(30,34,82), new Color(36,55,114));
        btnConfirm = new FlatButton(new Color(58,66,129), new Color(30,34,82), new Color(36,55,114));
        btnCancel = new FlatButton(new Color(58,66,129), new Color(30,34,82), new Color(71,83,114));
        jLabel2 = new JLabel();
        edtSearch1 = new FlatTextInput();
        jLabel4 = new JLabel();
        edtSearch2 = new FlatTextInput();
        jPanel1 = new RoundedPanel(10);
        jLabel5 = new JLabel();
        edtSearch3 = new FlatTextInput();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        edtSearch4 = new FlatTextInput();
        jLabel8 = new JLabel();
        edtSearch5 = new FlatTextInput();
        edtSearch6 = new FlatTextInput();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        edtSearch7 = new FlatTextInput();
        edtSearch8 = new FlatTextInput();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new FlatTextArea();
        edtSearch9 = new FlatTextInput();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1280, 768));

        background.setBackground(new Color(88, 102, 146));

        titleBar.setBackground(new Color(58, 66, 129));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveFrame(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                getPosition(evt);
            }
        });

        btnClose.setBackground(new Color(77, 89, 159));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterHandle(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitHandle(evt);
            }
        });

        txtClose.setFont(new Font("Roboto", 1, 28)); // NOI18N
        txtClose.setForeground(new Color(255, 255, 255));
        txtClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClose.setText("×");
        txtClose.setAlignmentY(0.0F);

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        btnMinimize.setBackground(new Color(77, 89, 159));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnterHandle(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitHandle(evt);
            }
        });

        txtMinimize.setFont(new Font("Roboto", 1, 28)); // NOI18N
        txtMinimize.setForeground(new Color(255, 255, 255));
        txtMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMinimize.setText("-");
        txtMinimize.setAlignmentY(0.0F);

        javax.swing.GroupLayout btnMinimizeLayout = new javax.swing.GroupLayout(btnMinimize);
        btnMinimize.setLayout(btnMinimizeLayout);
        btnMinimizeLayout.setHorizontalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        btnMinimizeLayout.setVerticalGroup(
            btnMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel3.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Hibernate Project v1.0");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new Color(30, 34, 82));

        jLabel1.setFont(new Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GIÁO VỤ");

        jSeparator1.setBackground(new Color(88, 102, 146));
        jSeparator1.setForeground(new Color(88, 102, 146));

        btnClassroom.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom.setText("Danh sách lớp");

        btnClassroom1.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom1.setText("Thời khóa biểu");

        btnClassroom2.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom2.setText("Tra cứu điểm");

        btnClassroom3.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom3.setText("QL phúc khảo");

        btnClassroom4.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom4.setText("Đổi mật khẩu");

        btnClassroom5.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnClassroom5.setText("Đăng xuất");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClassroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(btnClassroom1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btnClassroom2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btnClassroom3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btnClassroom4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btnClassroom5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnClassroom5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());

        jTable2.getTableHeader().setDefaultRenderer(new HeaderRenderer());
        jTable2.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1712025", "Nguyễn Tuấn Đạt", "9.0", "9.0", "2.0", "9.5"},
                {"2", "1712000", "Nguyễn Văn B", "8.5", "8.5", "0.0", "8.5"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ và tên", "Điểm GK", "Điểm CK", "Điểm khác", "Điểm tổng"
            }
        ));
        //jTable2.getColumnModel().getColumn(0).setPreferredWidth(120);
        //jTable2.getColumnModel().getColumn(1).setPreferredWidth(210);
        //jTable2.getColumnModel().getColumn(2).setPreferredWidth(470);
        //jTable2.getColumnModel().getColumn(3).setPreferredWidth(260);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        //jTable2.setDefaultRenderer(String.class, centerRenderer);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        jTable2.setDragEnabled(true);
        jTable2.setFocusable(false);
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new Color(129, 150, 204));
        jTable2.setSelectionForeground(new Color(0, 0, 0));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(85);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(290);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(128);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(128);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(128);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(128);
        }

        btnSearch.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnSearch.setText("Tìm kiếm");

        btnImportCSV.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnImportCSV.setText("Cập nhật");

        btnConfirm.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnConfirm.setText("Xác nhận");

        btnCancel.setFont(new Font("Roboto", 0, 18)); // NOI18N
        btnCancel.setText("Hủy bỏ");

        jLabel2.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Thời gian phúc khảo:");

        edtSearch1.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch1.setToolTipText("");

        jLabel4.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("-");

        edtSearch2.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch2.setToolTipText("");

        jPanel1.setBackground(new Color(239, 239, 239));

        jLabel5.setFont(new Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thông tin chi tiết");

        edtSearch3.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch3.setToolTipText("");

        jLabel6.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("MSSV");

        jLabel7.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Họ và tên");

        edtSearch4.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch4.setToolTipText("");

        jLabel8.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Môn phúc khảo");

        edtSearch5.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch5.setToolTipText("");

        edtSearch6.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch6.setToolTipText("");

        jLabel9.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Cột điểm phúc khảo");

        jLabel10.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Điểm hiện tại");

        edtSearch7.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch7.setToolTipText("");

        edtSearch8.setFont(new Font("Roboto", 0, 18)); // NOI18N
        edtSearch8.setToolTipText("");

        jLabel11.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Điểm mong muốn");

        jLabel12.setFont(new Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Lí do");

        jScrollPane3.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane3.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        //jTextArea2.setBorder(BorderFactory.createCompoundBorder(jTextArea2.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        Border border = BorderFactory.createLineBorder(new Color(23,55,212));
        jTextArea2.setBorder(BorderFactory.createCompoundBorder(border,
            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    jTextArea2.setColumns(20);
    jTextArea2.setFont(new Font("Roboto", 0, 18)); // NOI18N
    jTextArea2.setLineWrap(true);
    jTextArea2.setRows(5);
    jTextArea2.setToolTipText("");
    jScrollPane3.setViewportView(jTextArea2);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addComponent(edtSearch4)
                .addComponent(edtSearch6)
                .addComponent(edtSearch8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(edtSearch7)
                .addComponent(edtSearch5)
                .addComponent(edtSearch3)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel6)
            .addGap(4, 4, 4)
            .addComponent(edtSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel7)
            .addGap(4, 4, 4)
            .addComponent(edtSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel8)
            .addGap(4, 4, 4)
            .addComponent(edtSearch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel9)
            .addGap(4, 4, 4)
            .addComponent(edtSearch6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel10)
            .addGap(4, 4, 4)
            .addComponent(edtSearch7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel11)
            .addGap(4, 4, 4)
            .addComponent(edtSearch8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel12)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
            .addContainerGap())
    );

    edtSearch9.setFont(new Font("Roboto", 0, 18)); // NOI18N
    edtSearch9.setToolTipText("");

    javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
    background.setLayout(backgroundLayout);
    backgroundLayout.setHorizontalGroup(
        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(titleBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(backgroundLayout.createSequentialGroup()
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(edtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(edtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnImportCSV)
                    .addGap(63, 63, 63)
                    .addComponent(edtSearch9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSearch)
                    .addGap(21, 21, 21))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnConfirm)
                    .addGap(22, 22, 22))
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12))))
    );
    backgroundLayout.setVerticalGroup(
        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(backgroundLayout.createSequentialGroup()
            .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnImportCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(edtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(edtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edtSearch9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(9, 9, 9)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirm)
                        .addComponent(btnCancel))
                    .addGap(9, 9, 9))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    setSize(new Dimension(1280, 768));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_close

    private void moveFrame(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrame
        // TODO add your handling code here:
        setLocation(getLocation().x + evt.getX() - this.pX, getLocation().y + evt.getY() - this.pY);
    }//GEN-LAST:event_moveFrame

    private void getPosition(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getPosition
        // TODO add your handling code here:
        this.pX = evt.getX();
        this.pY = evt.getY();
    }//GEN-LAST:event_getPosition

    private void mouseEnterHandle(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnterHandle
        // TODO add your handling code here:
        if (evt.getSource() == this.btnClose) {
            this.txtClose.setForeground(Color.red);
        };
        if (evt.getSource() == this.btnMinimize) {
            this.txtMinimize.setForeground(Color.red);
        };
    }//GEN-LAST:event_mouseEnterHandle

    private void mouseExitHandle(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitHandle
        // TODO add your handling code here:
        if (evt.getSource() == this.btnClose) {
            this.txtClose.setForeground(Color.white);
        };
        if (evt.getSource() == this.btnMinimize) {
            this.txtMinimize.setForeground(Color.white);
        };
    }//GEN-LAST:event_mouseExitHandle

    private void minimize(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReExamination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClassroom;
    private javax.swing.JButton btnClassroom1;
    private javax.swing.JButton btnClassroom2;
    private javax.swing.JButton btnClassroom3;
    private javax.swing.JButton btnClassroom4;
    private javax.swing.JButton btnClassroom5;
    private javax.swing.JPanel btnClose;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnImportCSV;
    private javax.swing.JPanel btnMinimize;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField edtSearch1;
    private javax.swing.JTextField edtSearch2;
    private javax.swing.JTextField edtSearch3;
    private javax.swing.JTextField edtSearch4;
    private javax.swing.JTextField edtSearch5;
    private javax.swing.JTextField edtSearch6;
    private javax.swing.JTextField edtSearch7;
    private javax.swing.JTextField edtSearch8;
    private javax.swing.JTextField edtSearch9;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel titleBar;
    private JLabel txtClose;
    private JLabel txtMinimize;
    // End of variables declaration//GEN-END:variables
    private int pX;
    private int pY;
}
