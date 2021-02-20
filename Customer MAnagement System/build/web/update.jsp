<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    ::-webkit-scrollbar {
  width: 10px;
}

/* Track */
::-webkit-scrollbar-track {
  background: #f1f1f1; 
}
 
/* Handle */
::-webkit-scrollbar-thumb {
  background: #888; 
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
  background: #555; 
}
    *{
        margin:0;
        padding: 0;

    }
    h1{
        text-align:center;
        padding: 10px;
        color:black;
    }
        .register{
        background:graytext;
        width: 500px;
        margin: 0px 0px 0px 400px;
        color:white;
        font-size: 18px;
        padding: 15px;
        border-radius: 10px;
        padding-bottom: 20px;;


    }
    #register{
        margin-left:50px ;
    }
    label{
        color:white;
        font-size: 12px;
        font-family: sans-serif;

    }
    #name{
        width:300px;
        border: none;
        border-radius: 3px;
        outline: 0;
        padding: 3px;
    }
    #ph{
        width: 65px;
        padding: 3px;
        border:none;
        border-radius: 3px;
        outline:0;
    }
    body{

        background-image: url("img/crm2.jpg");
        background-size: 100% 700px;
        background-repeat: no-repeat;
    }
    #sub{
        width: 230px;
        padding: 3px;
        border:none;
        border-radius: 3px;
        outline:0;}

        #sub{
        width: 200px;
        padding: 3px;
        border:none;
        border-radius: 3px;
        outline:0;
        font-size: 16px;
        font-family: sans-serif;
        font-weight: 600;

        }
        #sub:hover{
            opacity:0.7;
        }

       input[type=text]
            {
                padding:4px;
            }
input[type=email],input[type=password],input[type=select]
            {
                padding:7px;
            }
            

    </style>

</head>
<body>
    <h1>Update Record</h1>
    <div class="register">
     
        <form action="update" method="get" id="register">
            <label>Customer ID</label><br>
            <input type="text" name="empid" placeholder="Enter name here"><br><br>
            
            <label>Customer Name</label><br>
            <input type="text" name="name" placeholder="Enter name here"><br><br>
            <label>Age</label><br>
            <input type="text" name="Age" placeholder="Enter age here"><br><br>
            <label>Email </label><br>
            <input type="email" name="email" placeholder="Enter email"><br><br>
        
            <label>Phone Number</label><br>
            <select id="ph">
                <option>+91</option>
                <option>+92</option>
                <option>+93</option>
                </select>
            <input type="number" name="phone" placeholder="Enter Mobile Number"><br><br>
            <label>Address</label><br>
<input type="text" name="addr" placeholder="Enter Adress"><br><br>

<label>Gender</label><br>
<select id="gender" name="gender">
    <option>Male</option>
    <option>Female</option>
    </select><br><br>
    <label>Adhar no.</label><br>
    <input type="text" name="Adhar" placeholder="Enter adhar card number "><br><br>

           
            <label>Password</label><br>
            <input type="password" name="pass" placeholder="Enter password"><br><br>

            
            <input type="submit" value="Save" id="sub"name="submit">
            </form>
            </div>

</body>+











