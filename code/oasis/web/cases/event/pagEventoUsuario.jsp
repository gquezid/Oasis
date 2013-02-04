<%-- 
    Document   : pagEventoUsuario
    Created on : 29/01/2013, 19:44:10
    Author     : Gabriel Quézid
--%>

<%@page import="oasis.controleinterno.cdp.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario u = null;
    u = (Usuario) session.getAttribute("userS2teamoases");

    if (u == null) {
        response.sendRedirect("../../index.jsp");
    }
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Oasis</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Le styles -->
        <link href="../../css/bootstrap.css" rel="stylesheet">
        <link href="../../css/bootstrap-responsive.css" rel="stylesheet">
        <link href="../../css/docs.css" rel="stylesheet">
        <link href="../../css/prettify.css" rel="stylesheet">

        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
          <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <!-- Le fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="assets/ico/favicon.png">

    </head>

    <body data-spy="scroll" data-target=".bs-docs-sidebar">

        <!-- Navbar
        ================================================== -->
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="../../index.jsp">Oasis</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="../../system.jsp">Principal</a>
                            </li>
                            <li class="">
                                <a href="../etc/pagSobre.jsp">Sobre a Organização</a>
                            </li>
                            <li class="">
                                <a href="./pagEventoGrupo.jsp">Controle de Grupo(s)</a>
                            </li>
                            <li class="">
                                <a href="./pagEventoPelada.jsp">Controle de Pelada(s)</a>
                            </li>
                            <li class="">
                                <a href="./pagEventoUsuario.jsp">Visualize Perfil</a>
                            </li>
                            <li class="">
                                <a href="../etc/pagContato.jsp">Contato</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- Subhead
================================================== -->
        <header class="jumbotron subhead" id="overview">
            <div class="container">
                <h1>Eventos de Usuário</h1>
                <p class="lead">Compartilhe seus dados conosco! Você também pode ler a nossa <a href="" >politica de privacidade</a>.</p>
            </div>
        </header>

        <div class="bs-docs-social">
            <div class="container">
                <ul class="bs-docs-social-buttons">
                    <li>
                        <iframe class="github-btn" src="http://ghbtns.com/github-btn.html?user=twitter&repo=bootstrap&type=watch&count=true" allowtransparency="true" frameborder="0" scrolling="0" width="100px" height="20px"></iframe>
                    </li>
                    <li>
                        <iframe class="github-btn" src="http://ghbtns.com/github-btn.html?user=twitter&repo=bootstrap&type=fork&count=true" allowtransparency="true" frameborder="0" scrolling="0" width="102px" height="20px"></iframe>
                    </li>
                    <li class="follow-btn">
                        <a href="https://twitter.com/S2teamoasis" class="twitter-follow-button" data-link-color="#0069D6" data-show-count="true">Follow @S2teamoasis</a>
                    </li>
                    <li class="tweet-btn">
                        <a href="https://twitter.com/share" class="twitter-share-button" data-url="" data-count="horizontal" data-via="S2teamoasis" data-related="mdo:Creator of Twitter S2teamoasis">Tweet</a>
                    </li>
                </ul>
            </div>
        </div>

        <br/>

        <div class="container">
            <table class="table table-bordered table-striped">
                <colgroup>
                    <col class="span7">
                    <col class="span1">
                </colgroup>
                <thead>
                    <tr>
                        <th colspan="2">Dados do Perfil</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><strong>Nome: </strong></td>
                        <td><% if (u != null) {
                                out.println(u.getNome());
                            }%></td>
                    </tr>
                    <tr>

                        <td><strong>E-Mail: </strong></td>
                        <td><% if (u != null) {
                                out.println(u.getEmail());
                            }%></td>
                    </tr>
                </tbody>
            </table>

            <hr class="soften">

            <div align="center">
                <table>
                    <tr>
                        <td>
                            <form class="form-signin" name="login" id="off" method="post" action="../../CtrlPrincipal">
                                <input type="hidden" name="index" id="index" value="3">
                                <input class="btn btn-inverse" type="submit" value="Sair"/>
                            </form>
                        </td>
                        <td>
                            <form class="form">
                                <input type="hidden" name="index" id="index" value="4">
                                <input class="btn btn-info" onclick="redirecionar('cadastrarUsuario')" value="Alterar Dados" />
                            </form>
                        </td>
                    </tr>
                </table>
            </div>
        </div>

        <!-- Footer
        ================================================== -->
        <footer class="footer">
            <div class="container">
                <p>Designed and built with all the love in the world by <a href="https://pt-br.facebook.com/quezid" target="_blank">Gabriel Quézid</a>.</p>
                <p>Code licensed under <a href="http://www.apache.org/licenses/LICENSE-2.0" target="_blank">Apache License</a>, documentation under <a href="http://creativecommons.org/licenses/by/3.0/">CC BY 3.0</a>.</p>
                <p><a href="http://glyphicons.com">Glyphicons Free</a> licensed under <a href="http://creativecommons.org/licenses/by/3.0/">CC BY 3.0</a>.</p>
            </div>
        </footer>



        <!-- Le javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->

        <script type="text/javascript">
            function redirecionar(aux){
                switch(aux){
                    case "cadastrarUsuario":
                        window.location = 'http://localhost:8080/Oasis/cases/form/pagCadastroUsuario.jsp';
                        break;
                }
            }
        </script>

        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
        <script src="http://code.jquery.com/jquery-migrate-1.0.0.min.js"></script>

        <script src="../../js/bootstrap.js"></script>
        <script src="../../js/holder/holder.js"></script>

        <!-- Analytics
        ================================================== -->

    </body>
</html>
