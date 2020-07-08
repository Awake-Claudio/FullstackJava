<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<!-- Navbars Brand and toggle inverse-->
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
      </button>
      <a class="navbar-brand">SirKlaude</a>
    </div>

    <!-- Coleccion de links -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li role="presentation" th:classappend="(${#httpServletRequest.requestURI}=='/admin/')? 'active':''">
		<a th:href=@{/admin/}>Inicio</a></li>
	<li role="presentation" th:classappend="(${#httpServletRequest.requestURI}=='/admin/categoria')? 'active':''">
		<a th:href=@{/admin/categoria}>Usuarios</a></li>
	<li role="presentation" th:classappend="(${#httpServletRequest.requestURI}=='/admin/publicacion')? 'active':''">
	<a th:href=@{/admin/publicacion}>Crear Usuarios</a></li>
	<li role="presentation" th:classappend="(${#httpServletRequest.requestURI}=='/admin/comentario')? 'active':''">
	<a th:href=@{/admin/comentario}>Administrar</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
</nav>