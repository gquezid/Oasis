<%-- 
    Document   : system
    Created on : 31/01/2013, 00:52:54
    Author     : Gabriel Quézid
--%>

<%@page import="oasis.controleinterno.cdp.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario u = null;
    u = (Usuario) session.getAttribute("userS2teamoases");

    if (u == null) {
        response.sendRedirect("index.jsp");
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
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap-responsive.css" rel="stylesheet">
        <link href="css/docs.css" rel="stylesheet">
        <link href="css/prettify.css" rel="stylesheet">

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

        <div id="fb-root"></div>
        <script>(function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/pt_BR/all.js#xfbml=1";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));</script>

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
                    <a class="brand" href="./system.jsp">Oasis</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="./system.jsp">Principal</a>
                            </li>
                            <li class="">
                                <a href="cases/etc/pagSobre.jsp">Sobre a Organização</a>
                            </li>
                            <li class="">
                                <a href="cases/event/pagEventoGrupo.jsp">Controle de Grupo(s)</a>
                            </li>
                            <li class="">
                                <a href="cases/event/pagEventoPelada.jsp">Controle de Pelada(s)</a>
                            </li>
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="cases/event/pagEventoUsuario.jsp">Visualize Perfil</a>
                                <ul class="dropdown-menu">
                                    <li><a href="cases/event/pagEventoUsuario.jsp">Acessar aos Dados</a></li>
                                    <li><a href="#" onclick="realizarLogoff();" >Sair (Logoff)</a></li>
                                </ul>
                            </li>
                            <li class="">
                                <a href="cases/etc/pagContato.jsp">Contato</a>
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
                <h1>Oasis</h1>
                <p class="lead">Seja Bem vindo ao único sistema gerenciador de peladas que você nunca mais vai esquecer.</p>
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

        <div class="container">
            <div class="marketing">
                <form>
                    <table class="table">
                        <tr>
                            <td rowspan="5"><div class="fb-like-box" data-href="https://www.facebook.com/pages/F%C3%A3s-de-Oasis/333828600056211" data-width="300" data-height="260" data-show-faces="true" data-stream="false" data-header="true"></div><td>
                            <td colspan="2"></td>
                        <tr>
                        <tr style="height: 100px;">
                            <td colspan="2">
                                <p class="marketing-byline" align=”Justify”> Este sistema foi desenvolvido por alunos de graduação do curso de Sistemas de Informação. </p>
                                <p class="marketing-byline" align=”Justify”> </p>
                            </td>
                        </tr>
                    </table>
                </form>
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
        <script>
        function realizarLogoff(){
            
        }
        </script>
        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
        <script src="http://code.jquery.com/jquery-migrate-1.0.0.min.js"></script>

        <script src="js/bootstrap.js"></script>
        <script src="js/holder/holder.js"></script>

        <!-- Analytics
        ================================================== -->

    </body>
</html>
