<?php 
$servername="localhost";
$username="root";
$password="";
$dbname="QLy_nhansu";
//Tạo kết nối
try{
	$conn=new PDO("mysql:host=$servername;dbname=$dbname", $username, $password,array(PDO::MYSQL_ATTR_INIT_COMMAND=>"SET NAMES UTF8"));
	$conn -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
	$sql="CREATE TABLE `tbl_nhanvien`(
`id` int(12) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`ten` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
`ngaysinh` date NOT NULL,
`gioitinh` int(2) NOT NULL DEFAULT '1',
`dienthoai` int(10) NOT NULL,
`email` varchar(50) NOT NULL,
`diachi` int(30) NOT NULL,
`chuyenmon` varchar(20) NOT NULL,
`hinhanh` varchar(12) NOT NULL,
reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)";
	$conn -> exec($sql);
	echo "Tạo bảng thành công";
}
catch(PDOException $e){
	echo $sql."<br>".$e->getMessage();
}
$conn=null;


 ?>