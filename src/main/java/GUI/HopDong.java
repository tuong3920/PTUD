package GUI;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HopDong extends JPanel {

	/**
	 * Create the panel.
	 */
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
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JButton btnNewButton_8;
	private JLabel lblNgySinh_1;
	private JTextField textField_6;
	private JLabel lblNewLabel_5;

	/**
	 * Create the panel.
	 */
	public HopDong() {
		setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setLayout(null);
		setSize(1330,755);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 340, 1330, 324);
		add(scrollPane);
		String[][] data = {
//                {"4031", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4032", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4033", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4034", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4035", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4036", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4037", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4038", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
        };
		String[] columnNames = { "Mã Hợp Đồng", "Mã Nhân Viên Lập","Nhân Viên Lập","Ngày Bắt Đầu","Ngày Kết Thúc","Tiền Đặt Cọc" };
		
		table = new JTable(data,columnNames);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("Mã Nhân Viên:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(665, 31, 114, 35);
		add(lblNewLabel);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(826, 296, 100, 30);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(936, 296, 100, 30);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(1046, 296, 100, 30);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(1216, 674, 114, 30);
		add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Nhập mã hợp đồng:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(821, 675, 148, 28);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(993, 676, 198, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(819, 34, 363, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblTnCngNhn = new JLabel("Tên Công Nhân:");
		lblTnCngNhn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnCngNhn.setBounds(665, 93, 144, 35);
		add(lblTnCngNhn);
		
		lblSinThoai = new JLabel("Mã Hợp Đồng:");
		lblSinThoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSinThoai.setBounds(10, 164, 124, 35);
		add(lblSinThoai);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(819, 96, 501, 33);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(144, 167, 494, 33);
		add(textField_3);
		
		lblaCh = new JLabel("Tiền Đặt Cọc:");
		lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblaCh.setBounds(665, 164, 114, 35);
		add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(819, 167, 501, 33);
		add(textField_4);
		
		btnNewButton_4 = new JButton("<");
		btnNewButton_4.setBounds(538, 674, 85, 21);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("<<");
		btnNewButton_5.setBounds(456, 674, 85, 21);
		add(btnNewButton_5);
		
		btnNewButton_6 = new JButton(">");
		btnNewButton_6.setBounds(621, 674, 85, 21);
		add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(">>");
		btnNewButton_7.setBounds(702, 674, 85, 21);
		add(btnNewButton_7);
		
		lblNgySinh = new JLabel("Ngày Bắt Đầu:");
		lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgySinh.setBounds(10, 226, 124, 35);
		add(lblNgySinh);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(144, 229, 439, 33);
		add(textField_5);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_2.setBounds(593, 226, 45, 35);
		add(lblNewLabel_2);
		
		String[] columnNames1 = { "Mã Nhân Viên", "Tên Nhân Viên"};
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 628, 144);
		add(scrollPane_1);
		
		table_1 = new JTable(data,columnNames1);
		scrollPane_1.setViewportView(table_1);
		
		btnNewButton_8 = new JButton("Tìm theo mã");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_8.setBounds(1206, 31, 114, 35);
		add(btnNewButton_8);
		
		lblNgySinh_1 = new JLabel("Ngày Bắt Đầu:");
		lblNgySinh_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgySinh_1.setBounds(665, 226, 124, 35);
		add(lblNgySinh_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(823, 229, 439, 33);
		add(textField_6);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(1275, 226, 45, 35);
		add(lblNewLabel_5);
		
		
	
	}

}
