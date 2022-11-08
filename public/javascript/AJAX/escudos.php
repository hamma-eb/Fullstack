<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $escudos=$_GET['escudos'];

    
    ?>
    <img src="<?php echo $escudos;?>.png" alt="">
    

<!--
if($escudo == 'rmadrid') 
{
echo ('<img src="realmadrid.png">');
}
if($escudo == 'atmadrid') 
{
echo ('<img src="atmadrid.png">');
}
if($escudo == 'valencia') 
{
echo ('<img src="valencia.png">');
}
if($escudo == 'sevilla') 
{
echo ('<img src=sevilla.png">');
}-->
</body>
</html>