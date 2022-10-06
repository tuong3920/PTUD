package GUI;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CongNhanChamCong extends JPanel{
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JLabel lblNgySinh;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JTextField textField_4;
	private JLabel lblaCh;
	private JLabel lblSinThoai;
	private JLabel lblTnCngNhn;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblSLng;
	private JTextField textField_6;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_4;
public CongNhanChamCong() {
	setFont(new Font("Times New Roman", Font.PLAIN, 18));
	setLayout(null);
	setSize(1330, 722);
	
	scrollPane = new JScrollPane();
	scrollPane.setBounds(0, 432, 1320, 235);
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
	String[] columnNames = {"Mã Chấm Công", "Mã Công Nhân", "Tên Công Nhân", "Mã Sản Phẩm","Mã Công Đoạn","Số Lượng Hoàn Thành","Ngày Chấm" };
	
	table = new JTable(data,columnNames);
	table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
	scrollPane.setViewportView(table);
	
	lblNewLabel = new JLabel("Mã Công Nhân:");
	lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel.setBounds(14, 277, 124, 35);
	add(lblNewLabel);
	
	btnNewButton = new JButton("Thêm");
	btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton.setBounds(790, 389, 100, 33);
	add(btnNewButton);
	
	btnNewButton_1 = new JButton("Sửa");
	btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_1.setBounds(900, 389, 100, 33);
	add(btnNewButton_1);
	
	btnNewButton_2 = new JButton("Xóa");
	btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_2.setBounds(1010, 389, 100, 33);
	add(btnNewButton_2);
	
	btnNewButton_3 = new JButton("Tìm kiếm");
	btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	btnNewButton_3.setBounds(1206, 677, 114, 28);
	add(btnNewButton_3);
	
	lblNewLabel_1 = new JLabel("Nhập mã công nhân:");
	lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_1.setBounds(10, 166, 158, 28);
	add(lblNewLabel_1);
	
	textField = new JTextField();
	textField.setBounds(165, 166, 198, 33);
	add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(152, 277, 214, 33);
	add(textField_1);
	textField_1.setColumns(10);
	
	lblTnCngNhn = new JLabel("Tên Công Nhân:");
	lblTnCngNhn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblTnCngNhn.setBounds(414, 277, 124, 35);
	add(lblTnCngNhn);
	
	lblSinThoai = new JLabel("Mã Sản Phẩm");
	lblSinThoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblSinThoai.setBounds(435, 222, 149, 35);
	add(lblSinThoai);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(565, 280, 750, 33);
	add(textField_2);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(565, 222, 233, 33);
	add(textField_3);
	
	lblaCh = new JLabel("Mã Công Đoạn:");
	lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblaCh.setBounds(868, 221, 124, 35);
	add(lblaCh);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(997, 224, 318, 33);
	add(textField_4);
	
	btnNewButton_4 = new JButton("<");
	btnNewButton_4.setBounds(549, 677, 85, 25);
	add(btnNewButton_4);
	
	btnNewButton_5 = new JButton("<<");
	btnNewButton_5.setBounds(467, 677, 85, 25);
	add(btnNewButton_5);
	
	btnNewButton_6 = new JButton(">");
	btnNewButton_6.setBounds(632, 677, 85, 25);
	add(btnNewButton_6);
	
	btnNewButton_7 = new JButton(">>");
	btnNewButton_7.setBounds(713, 677, 85, 25);
	add(btnNewButton_7);
	
	lblNgySinh = new JLabel("Ngày Chấm:");
	lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNgySinh.setBounds(644, 323, 100, 35);
	add(lblNgySinh);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(754, 326, 392, 33);
	add(textField_5);
	
	lblNewLabel_2 = new JLabel("");
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
	lblNewLabel_2.setBounds(1183, 323, 45, 35);
	add(lblNewLabel_2);
	
	lblSLng = new JLabel("Số Lượng Hoàn Thành:");
	lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblSLng.setBounds(14, 323, 192, 35);
	add(lblSLng);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	textField_6.setBounds(216, 327, 364, 33);
	add(textField_6);
	
	String[] columnNames1 = { "Mã Công Nhân", "Tên Công Nhân","Ngày Sinh" };
	
	table = new JTable(data,columnNames1);
	scrollPane_1 = new JScrollPane(table);
	scrollPane_1.setBounds(0, 0, 528, 156);
	add(scrollPane_1);
	
	String[] columnNames2 = { "Mã Công Đoạn","Mã Sản Phẩm","Tên Sản Phẩm","Đơn Giá","Số Lượng Cần Hoàn Thành" };
	
	table = new JTable(data,columnNames2);
	scrollPane_2 = new JScrollPane(table);
	scrollPane_2.setBounds(578, 0, 742, 156);
	add(scrollPane_2);
	
	lblNewLabel_3 = new JLabel("Nhập mã công đoạn:");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_3.setBounds(713, 165, 158, 28);
	add(lblNewLabel_3);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	textField_7.setBounds(875, 166, 198, 33);
	add(textField_7);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(4, 209, 1316, 2);
	add(separator);
	
	JButton btnNewButton_8 = new JButton("Tìm");
	btnNewButton_8.setBounds(381, 170, 85, 25);
	add(btnNewButton_8);
	
	JButton btnNewButton_8_1 = new JButton("Tìm");
	btnNewButton_8_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton_8_1.setBounds(1087, 171, 85, 25);
	add(btnNewButton_8_1);
	
	JLabel lblMChmCng = new JLabel("Mã Chấm Công");
	lblMChmCng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblMChmCng.setBounds(14, 222, 124, 35);
	add(lblMChmCng);
	
	textField_8 = new JTextField();
	textField_8.setEnabled(false);
	textField_8.setColumns(10);
	textField_8.setBounds(152, 222, 219, 33);
	add(textField_8);
	
	textField_9 = new JTextField();
	textField_9.setColumns(10);
	textField_9.setBounds(998, 677, 198, 28);
	add(textField_9);
	
	lblNewLabel_4 = new JLabel("Nhập mã chấm công:");
	lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
	lblNewLabel_4.setBounds(842, 677, 158, 28);
	add(lblNewLabel_4);
	
	String[] columnNames3 = { "Mã Công Đoạn", "Tên Sản Phẩm","Số Lượng" };
	
	table = new JTable(data,columnNames2);
	

}

}
