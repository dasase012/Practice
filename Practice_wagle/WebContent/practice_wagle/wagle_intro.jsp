<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-colors-metro.css">
 --><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Insert title here</title>
	<style>
		body{
			margin:0;
			padding:0;
		}
		section{
			height: 100vh;
        	overflow: hidden;
        	background-attachment: fixed;
        	background-size: cover;

		}
		.top{
			background-image: url(img/wagle.jpg);
		}
		.work_exp{
			background-color: white;
		}
		.research_exp{
			background-color: lightgrey;
		}
		.web_proj{
			background-color: white;
		}
		.contact{
			background-image: url(img/wagle.jpg);
		}
		header{
			color: white;
       		max-width: 50%;
        	position: relative;
        	left: 50%;
        	top: 50%;
        	transform: translateX(-50%) translateY(-50%);
        /*글,내용을 가운데에 놓기위한 css3값*/
        	font-size: 1.5rem;
        	text-align: center;
		}
		.top header{
			color: white;
			font-size: 2.4rem;
		}

		a:link{
			text-decoration:none;
			color: black;
		}
		a:visited{
			text-decoration:none;
			color: black;
		}
	</style>
 <style>

 .w3-bar{
 box-shadow:0 5px 7px 0 rgba(0,0,0,0.16), 0 10px 8px 0 rgba(0,0,0,0.12);
 }

 
</style>

</head>
<body>

<div class="w3-top">
<div class="w3-bar w3-white">
  <a href="" class="w3-bar-item w3-button w3-metro-yellow  w3-large w3-hover-white" title="wagle"><i class="fa fa-play w3-margin-right"></i>Wagle</a>
<a href="" class="w3-bar-item w3-button w3-metro-yellow  w3-large w3-right w3-hover-white" title="Login">
  <i class="fa fa-user-circle w3-margin-right" alt="Login"></i>Login</a>
  <a href="list" class="w3-bar-item w3-button w3-hide-small  w3-metro-yellow w3-right w3-large w3-hover-white" title="Userlist">
  <i class="fa fa-home w3-margin-right"></i>Userlist </a>
     <a href="myPage" class="w3-bar-item w3-button w3-hide-small w3-light-grey  w3-right w3-large w3-hover-white" title="My Page">  
  <i class="fa fa-home w3-margin-right"></i>My page</a> 
  <div class="w3-dropdown-hover w3-right">
    <button class="w3-button w3-metro-yellow  w3-large w3-hover-white"><i class="fa fa-user-circle w3-margin-right"></i><i style="color:black;">My account</i></button>
    <div class="w3-dropdown-content w3-bar-block w3-border">
      <a href="updateForm1" class="w3-bar-item w3-button w3-large">Main Info</a>
      <a href="etcInfoForm" class="w3-bar-item w3-button w3-large">Etc Info</a>
    </div>
  </div>


</div> </div>



	<section class="top">
		<header>
			<h1>welcome to Wagle!!</h1>
				<br></br>
			Want to know more about us?
		</header>
	</section>
	<section class="work_exp">
		<header>
			<h2 style="color:black;">와글와글은 이런이런 곳이랍니다. 소개글</h2>
		</header>
	</section>
	<section class="research_exp">
		<header>
			<h2 style="color:black;">wordcloud
				<%@include file="/practice_wagle/wordCloud/aweSomeCloudBase.jsp" %>
			</h2>
		</header>
	</section>
	<section class="web_proj">
		<header>
		<h2 style="color:black;">개설된 와글 이미지 슬라이드 삽입</h2>
		</header>
	</section>
	<section class="contact">
		<header>
			<h2>Contact us!</h2>
			<h1>wagle@gmail.com</h1>
		</header>
	</section>
</body>
</html>
