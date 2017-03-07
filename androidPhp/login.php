<?php
require "sqlConnect.php";

$user_username=$_POST["user_name"];
$user_pass=$_POST["password"];
$mysqlQuery = "SELECT * from User where username like '$user_username' and password like '$user_pass'";
$result = $conn->query($mysqlQuery);
//$result = mysqli_query($conn, $mysqlQuery);
if($result->num_rows<=0){
    //echo "NOT CONNECTED user";
}else{
      //  echo "User connected: ";
      //  echo "\nHello: $user_username";
    echo "success";

}
?>
