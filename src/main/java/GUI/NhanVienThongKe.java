package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class NhanVienThongKe extends JPanel{
	private JScrollPane scrollPaneTop;
	private JTable table;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton;
	private JButton btnInThngK;
	private JButton btnThngKLng;
	private JButton btnXemTrongExcel;
	private JTable table1;
	private JButton btnThngKTng_1;
	private JButton btnThngKTng;
	private JButton btnThngKTng_2;
	private JButton btnTngGiTng;
	private JLabel lblThngThngK;
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public NhanVienThongKe() {
		setLayout(null);
		setSize(1330,722);
		setBackground(new Color(204, 204, 204));
		
		scrollPaneTop = new JScrollPane();
		scrollPaneTop.setBounds(10, 0, 1316, 468);
		add(scrollPaneTop);
		
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
		String[] columnNames = { "Mã Nhân Viên", "Tên Nhân Viên","Lương", "Tổng Ngày Vắng","Tổng Giờ Tăng Ca"};
		
		table1 = new JTable(data,columnNames);
		table1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPaneTop.setViewportView(table1);
		
		btnNewButton_4 = new JButton("<");
		btnNewButton_4.setBounds(566, 478, 85, 21);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("<<");
		btnNewButton_5.setBounds(484, 478, 85, 21);
		add(btnNewButton_5);
		
		btnNewButton_6 = new JButton(">");
		btnNewButton_6.setBounds(649, 478, 85, 21);
		add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(">>");
		btnNewButton_7.setBounds(730, 478, 85, 21);
		add(btnNewButton_7);
		
		btnNewButton = new JButton("Lương giảm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(438, 606, 201, 41);
		add(btnNewButton);
		
		
		
		btnInThngK = new JButton("In Thống Kê");
		btnInThngK.setBackground(new Color(153, 255, 255));
		btnInThngK.setBounds(1161, 478, 134, 41);
		add(btnInThngK);
		
		btnThngKLng = new JButton("Lương tăng");
		btnThngKLng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThngKLng.setBounds(667, 606, 186, 41);
		add(btnThngKLng);
		
		btnXemTrongExcel = new JButton("Xem Trong Excel");
		btnXemTrongExcel.setBackground(new Color(153, 255, 255));
		btnXemTrongExcel.setBounds(1017, 478, 134, 41);
		add(btnXemTrongExcel);
		
		btnThngKTng_1 = new JButton("Tổng vắng tăng");
		btnThngKTng_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThngKTng_1.setBounds(665, 555, 188, 41);
		add(btnThngKTng_1);
		
		btnThngKTng = new JButton("Tổng vắng giảm");
		btnThngKTng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThngKTng.setBounds(438, 555, 201, 41);
		add(btnThngKTng);
		
		btnThngKTng_2 = new JButton("Tổng giờ tăng ca giảm");
		btnThngKTng_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnThngKTng_2.setBounds(438, 657, 201, 41);
		add(btnThngKTng_2);
		
		btnTngGiTng = new JButton("Tổng giờ tăng ca giảm");
		btnTngGiTng.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTngGiTng.setBounds(667, 657, 186, 41);
		add(btnTngGiTng);
		
		lblThngThngK = new JLabel("Tháng thống kê:");
		lblThngThngK.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblThngThngK.setBounds(341, 509, 134, 35);
		add(lblThngThngK);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(204, 204, 204));
		textField.setBounds(485, 512, 301, 33);
		add(textField);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(808, 510, 45, 35);
		add(lblNewLabel);
		
	}
}
