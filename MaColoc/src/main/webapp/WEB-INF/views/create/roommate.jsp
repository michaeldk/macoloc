<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="wide-content">
	<div class="box-style3">
		<h2 class="title">Créer un compte</h2>
		<div class="entry">
		
			<form:form method="post" action="create" modelAttribute="createForm">
				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<form:label path="firstName">Prénom</form:label>
				<br/>
				<form:input path="firstName" />
				<br/><br/>
				<form:label path="lastName">Nom</form:label>
				<br/>
				<form:input path="lastName" />
				<br/><br/>
				<form:label path="email">Email</form:label>
				<br/>
				<form:input path="email" />
				<br/><br/>
				<form:label path="confirmEmail">Email (confirmation)</form:label>
				<br/>
				<form:input path="confirmEmail" />
				<br/><br/>
				<form:label path="password">Mot de passe</form:label>
				<br/>
				<form:password path="password" />
				<br/><br/>
				<form:label path="confirmPassword">Mot de passe (confirmation)</form:label>
				<br/>
				<form:password path="confirmPassword" />
				<br/><br/>
				<input type="submit" value="Continuer"/>
			</form:form>
		</div>
	</div>
</div>