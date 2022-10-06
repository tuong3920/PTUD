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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

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
	private JLabel lblNewLabel_3;
	private JTextField textField_7;
	private JSeparator separator;

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
		lblNewLabel.setBounds(853, 118, 114, 35);
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
		btnNewButton_3.setBounds(1191, 673, 114, 30);
		add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Nhập mã hợp đồng:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(815, 674, 148, 28);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(972, 679, 198, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1007, 121, 179, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblTnCngNhn = new JLabel("Tên nhân viên:");
		lblTnCngNhn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnCngNhn.setBounds(373, 237, 136, 35);
		add(lblTnCngNhn);
		
		lblSinThoai = new JLabel("Mã Hợp Đồng:");
		lblSinThoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSinThoai.setBounds(10, 180, 114, 35);
		add(lblSinThoai);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(527, 240, 297, 33);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(134, 183, 211, 33);
		add(textField_3);
		
		lblaCh = new JLabel("Tiền Đặt Cọc:");
		lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblaCh.setBounds(884, 237, 114, 35);
		add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1018, 240, 302, 33);
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
		lblNgySinh.setBounds(373, 180, 124, 35);
		add(lblNgySinh);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(507, 183, 239, 33);
		add(textField_5);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_2.setBounds(779, 180, 45, 35);
		add(lblNewLabel_2);
		
		String[] columnNames1 = { "Mã Nhân Viên", "Tên Nhân Viên"};
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 777, 144);
		add(scrollPane_1);
		
		table_1 = new JTable(data,columnNames1);
		scrollPane_1.setViewportView(table_1);
		
		btnNewButton_8 = new JButton("Tìm theo mã");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_8.setBounds(1206, 119, 114, 35);
		add(btnNewButton_8);
		
		lblNgySinh_1 = new JLabel("Ngày kết thúc:");
		lblNgySinh_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgySinh_1.setBounds(884, 180, 124, 35);
		add(lblNgySinh_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(1018, 183, 250, 33);
		add(textField_6);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(1278, 180, 45, 35);
		add(lblNewLabel_5);
		
		lblNewLabel_3 = new JLabel("Mã Nhân Viên:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 238, 114, 35);
		add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(134, 240, 211, 33);
		add(textField_7);
		
		separator = new JSeparator();
		separator.setBounds(0, 164, 1330, 6);
		add(separator);
		
		
	
	}

}
