<html>
    <head>
        <style>
             html{
                background:url("C:\\Users\\dell\\Pictures\\Saved Pictures\\crm.jpg") no-repeat center center fixed;
                -webkit-background-size:cover;
                -moz-background-size:cover;
                -o-background-size:cover;
                background-size: cover;
            }
            h1{
                text-align: center;
                color:Black;
                margin: 50px 50px 50px 80px;
            }
            .login{
                margin: 100px 1000px 100px 400px;
                padding:60px;
                background-color:lightgray;
                width: 500px;

            }
            label{
                font-size: 60x;
                color:black;
                font-weight: 600;
                font-style: normal;
            }
            input[type=submit]{
                color: black;
                font-weight: 600;
                font-family: arial;
        
                background-color:burlywood;
                border-radius: 3px;
                border: 1px;;
                font-size:20px ;
                margin-top:20px;
            }
            input[type=text]
            {
                padding: 5px;

            }
            input[type=password]
            {
                padding: 5px;

            }
            input[type=select]
            {
                padding: 5px;
            }
#sub:hover{
    opacity: 0.7;

}
            
            </style>
    </head>
        <body>
            <h1>Login Here</h1>
            <div class="Login">
           
            <form action="verify" method="GET">
              
                 <label>   Email  </label> <br> 
                  <input type="text" name="email"  placeholder="abc@gmail.com"/> <br>
 
                  <label>   password </label><br>
                  <input type="password" name="pass" placeholder="enter password"/><br>
                 
                  
                 
                           <input type="submit" id="sub" value="Login"/>
                 </form>
           </div>
           
            </body>
            </html>