package GUI;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NhanVienChamCong extends JPanel {

	/**
	 * Create the panel.
	 */
	private JTable table;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JLabel lblNgySinh;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JScrollPane scrollPaneCenter;
	private JLabel lblNewLabel_3;
	private JTextField textField_7;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
public NhanVienChamCong() {
	setFont(new Font("Times New Roman", Font.PLAIN, 18));
	setLayout(null);
	setSize(1330,755);
	
	String[][] data = {
//          {"4031", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4032", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4033", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4034", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4035", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4036", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4037", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//          {"4038", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
  };
	String[] tbtop = {"Mã Nhân Viên","Tên Nhân Viên","Trạng Thái","Ngày Chấm Công" , "Số Giờ Tăng Ca",};
	String[] ds = {"Mã Chấm Công","Ngày Chấm Công","Tổng Người Vắng","Tổng Người Có Mặt" , "Tổng Người Tăng Ca"};
	
	scrollPaneCenter = new JScrollPane();
	scrollPaneCenter.setBounds(0, 380, 1330, 253);
	add(scrollPaneCenter);

	table_2 = new JTable(data,ds);
	scrollPaneCenter.setViewportView(table_2);
	
	JScrollPane scrollPaneTop = new JScrollPane();
	scrollPaneTop.setBounds(0, 0, 1330, 229);
	add(scrollPaneTop);
	table_1 = new JTable(data,tbtop);
	scrollPaneTop.setViewportView(table_1);
	
	
	table = new JTable(data,ds);
	table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	scrollPaneCenter.setViewportView(table);
	
	
	
	btnNewButton = new JButton("Lưu Danh Sách");
	btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton.setBounds(688, 335, 174, 35);
	add(btnNewButton);
	
	btnNewButton_1 = new JButton("Sửa Danh Sách");
	btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_1.setBounds(888, 335, 158, 35);
	add(btnNewButton_1);
	
	btnNewButton_2 = new JButton(" Xóa Danh Sách");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_2.setBounds(1162, 701, 158, 30);
	add(btnNewButton_2);
	
	btnNewButton_3 = new JButton("Tìm Danh Sách");
	btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_3.setBounds(987, 701, 165, 30);
	add(btnNewButton_3);
	
	btnNewButton_4 = new JButton("<");
	btnNewButton_4.setBounds(618, 659, 85, 21);
	add(btnNewButton_4);
	
	btnNewButton_5 = new JButton("<<");
	btnNewButton_5.setBounds(536, 659, 85, 21);
	add(btnNewButton_5);
	
	btnNewButton_6 = new JButton(">");
	btnNewButton_6.setBounds(701, 659, 85, 21);
	add(btnNewButton_6);
	
	btnNewButton_7 = new JButton(">>");
	btnNewButton_7.setBounds(782, 659, 85, 21);
	add(btnNewButton_7);
	
	lblNgySinh = new JLabel("Ngày Chấm:");
	lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNgySinh.setBounds(566, 278, 100, 35);
	add(lblNgySinh);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(676, 281, 392, 33);
	add(textField_5);
	
	lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
	lblNewLabel_2.setBounds(1068, 278, 59, 35);
	add(lblNewLabel_2);
	
	
	String[] columnNames2 = { "Mã Nhân Viên", "Tên Nhân Viên","Chức vụ"};
	
	lblNewLabel_3 = new JLabel("Nhập mã nhân viên:");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_3.setBounds(845, 239, 158, 28);
	add(lblNewLabel_3);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(1013, 243, 174, 25);
	add(textField_7);
	
	JButton btnNewButton_8_1 = new JButton("Tìm");
	btnNewButton_8_1.setBounds(1221, 242, 99, 27);
	add(btnNewButton_8_1);
	
	
	
	
	JButton btnNewButton_5_1 = new JButton("<<");
	btnNewButton_5_1.setBounds(492, 242, 85, 21);
	add(btnNewButton_5_1);
	
	JButton btnNewButton_4_1 = new JButton("<");
	btnNewButton_4_1.setBounds(574, 242, 85, 21);
	add(btnNewButton_4_1);
	
	JButton btnNewButton_6_1 = new JButton(">");
	btnNewButton_6_1.setBounds(657, 242, 85, 21);
	add(btnNewButton_6_1);
	
	JButton btnNewButton_7_1 = new JButton(">>");
	btnNewButton_7_1.setBounds(738, 242, 85, 21);
	add(btnNewButton_7_1);
	
	JLabel lblNewLabel_3_1 = new JLabel("Nhập mã nhân viên:");
	lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_3_1.setBounds(635, 701, 158, 28);
	add(lblNewLabel_3_1);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(803, 705, 174, 25);
	add(textField);
	
	table = new JTable(data,columnNames2);

}
}
