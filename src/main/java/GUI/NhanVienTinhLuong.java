package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class NhanVienTinhLuong extends JPanel {


	private JTable table;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_7;
	private JTextField textField_9;
	private JLabel lblNewLabel_4;
public NhanVienTinhLuong() {
	setFont(new Font("Times New Roman", Font.PLAIN, 18));
	setLayout(null);
	setSize(1330, 722);
	
	scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 343, 1320, 290);
	add(scrollPane);
	String[][] data = {
//            {"4031", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4032", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4033", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4034", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4035", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4036", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4037", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//            {"4038", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
    };
	String[] columnNames = {"Mã Lương", "Tên Nhân Viên", "Phụ cấp", "Ứng Trước","Tổng Lương","Lương nhận thực tế"};
	
	table = new JTable(data,columnNames);
	table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	scrollPane.setViewportView(table);
	
	btnNewButton = new JButton("Tính lương");
	btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton.setBounds(947, 276, 127, 47);
	add(btnNewButton);
	
	btnNewButton_1 = new JButton("Sửa bảng tính lương");
	btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_1.setBounds(1084, 276, 198, 47);
	add(btnNewButton_1);
	
	btnNewButton_2 = new JButton("Xóa bảng tính lương");
	btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_2.setBounds(812, 682, 185, 40);
	add(btnNewButton_2);
	
	btnNewButton_3 = new JButton("Tìm kiếm");
	btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_3.setBounds(1206, 643, 114, 28);
	add(btnNewButton_3);
	
	btnNewButton_4 = new JButton("<");
	btnNewButton_4.setBounds(548, 643, 85, 25);
	add(btnNewButton_4);
	
	btnNewButton_5 = new JButton("<<");
	btnNewButton_5.setBounds(466, 643, 85, 25);
	add(btnNewButton_5);
	
	btnNewButton_6 = new JButton(">");
	btnNewButton_6.setBounds(631, 643, 85, 25);
	add(btnNewButton_6);
	
	btnNewButton_7 = new JButton(">>");
	btnNewButton_7.setBounds(712, 643, 85, 25);
	add(btnNewButton_7);
	
	String[] columnNames1 = { "Mã Công Nhân", "Tên Công Nhân","Ngày Sinh" };
	
	String[] columnNames2 = {"Mã Nhân Viên", "Tổng vắng:", "Tổng giờ tăng ca","Trạng thái"};
	
	table = new JTable(data,columnNames2);
	scrollPane_2 = new JScrollPane(table);
	scrollPane_2.setBounds(0, 0, 1320, 222);
	add(scrollPane_2);
	
	lblNewLabel_3 = new JLabel("Nhập mã chấm công:");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_3.setBounds(665, 232, 158, 28);
	add(lblNewLabel_3);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(827, 233, 198, 33);
	add(textField_7);
	
	JButton btnNewButton_8_1 = new JButton("Tìm");
	btnNewButton_8_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton_8_1.setBounds(1039, 238, 85, 25);
	add(btnNewButton_8_1);
	
	textField_9 = new JTextField();
	textField_9.setColumns(10);
	textField_9.setBounds(998, 643, 198, 28);
	add(textField_9);
	
	lblNewLabel_4 = new JLabel("Nhập mã chấm công:");
	lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_4.setBounds(842, 643, 158, 28);
	add(lblNewLabel_4);
	
	String[] columnNames3 = { "Mã Công Đoạn", "Tên Sản Phẩm","Số Lượng" };
	
	table = new JTable(data,columnNames2);
	

}

}
