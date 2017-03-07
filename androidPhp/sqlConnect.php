<?php
$serverName="localhost";
$username="root";
$password="123456";
$dbName="AndroidTest";
$conn=new mysqli($serverName, $username, $password ,$dbName);
if($conn->connect_errno){
//echo "Failed to connect to MySQL: (" . 
   // $conn->connect_errno . ") " . $conn->connect_error;    
}else{
   // echo "Successfully connected to DB";
}
?>

