<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
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
			background-image: url(img/pink_bg.jpg);	
		}
		.education{
			background-image: url(img/whitepaint.jpg);
		}
		.work_exp{
			background-color: white;
		}
		.research_exp{
			background-color: lightyellow;
		}
		.web_proj{
			background-color: gray;			
		}
		.contact{
			background-image: url(img/pink_bg.jpg);
		}
		header{
			color: black;
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
</head>
<body>
	<section class="top">
		<header>
			<h1>Hi,I'm Bohee!</h1>
				<br></br>
			Want to know more about me?
		</header>
	</section>
	<section class="education">
		<header>
			<h1>Education</h1>
			CCD logo
			P5 logo
			<h2>and..</h2>
			NYU logo
			DELF- U of stras
			Java-Sist
		</header>
	</section>
	<section class="work_exp">
		<header>
			<h1 id="worklinks">Work Experiences</h1>
			<a href="https://mini-schools.com/anglais-enfant/" target="_blank">Mini-Schools</a>
			Animator
			<a href="http://www.freeget.net/main.php" target="_blank">KSRPD</a>
			Business Development
			<a href="https://sohostyle.com/" target="_blank">Soho Style</a>
			Sales Associate
			<br></br>
			Etc
			<p>Interpreter</p>
		</header>
	</section>
	<section class="research_exp">
		<header>
			<h1>Research Experiences</h1>
			<p>Flow</p>
			<p>LATI</p>
			<h1>Research Interest</h1>
			Brain and mind study<br>
			AI,Machine Learning<br>
		</header>
	</section>
	<section class="web_proj">
		<header>
			<h2><a href="https://www.scratch.mit.edu" target="_blank">Simple Runner Game</a></h2>
			Scratch
			<h2>Team Project 1</h2>
			<h2>Team Project 2</h2>
		</header>
	</section>
	<section class="contact">
		<header>
			<h2>Contact me!</h2>
			<h1>bohee.lee89@gmail.com</h1>
			for any interest in my research/work experiences!
			<h3>Skype ID</h3>
			<h2>dasase012</h2>
			
		</header>
	</section>
</body>
</html>
