<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="header-wrapper" class="container">
		<div id="header">
			<div id="logo">
				<h1><a href="#">Gérer Ma Coloc</a></h1>
			</div>
			<div id="loginbox">
				<input type="text" name="email" title="Entrez votre e-mail" size="25" value="${test}" />
				<input type="password" name="password" title="Entrez votre mot de passe" size="25" value="${test}" />
			</div>
		</div>
		<div id="menu">
			<ul>
				<li class="submenu"><span>Services</span>
					<ul>
						<li class="first"><a href="#">Sed imperdiet</a></li>
						<li><a href="#">Libero felis dolor</a></li>
						<li class="submenu"><span>Pulvinar duis</span>
							<ul>
								<li class="first"><a href="#">Consequat et magna amet</a></li>
								<li><a href="#">Nullam aliquam ridiculus</a></li>
								<li><a href="#">Sed imperdiet adipiscing lorem</a></li>
								<li><a href="#">Feugiat sed imperdiet</a></li>
								<li class="last"><a href="#">Libero etiam felis dolor</a></li>
							</ul>
						</li>
						<li><a href="#">Cras nulla ridiculus</a></li>
						<li><a href="#">Feugiat imperdiet</a></li>
						<li class="last"><a href="#">Libero felis dolor</a></li>
					</ul>
				</li>
				<li><a href="#">Clients</a></li>
				<li><a href="#">Support</a></li>
				<li><a href="#">Information</a></li>
				<li><a href="#">Case Studies</a></li>
				<li><a href="#">Press Room</a></li>
				<li><a href="#">Careers</a></li>
				<li class="last"><a href="#">Contact</a></li>
			</ul>
			<br class="clearfix" />
		</div>
	</div>