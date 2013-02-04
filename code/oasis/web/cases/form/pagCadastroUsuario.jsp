<%-- 
    Document   : pagCadastroUsuario
    Created on : 29/01/2013, 19:43:07
    Author     : Gabriel Quézid
--%>

<%@page import="oasis.controleinterno.cdp.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario u = null;
    u = (Usuario) session.getAttribute("user");

    if (u != null) {
        response.sendRedirect("../../system.jsp");
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
                    <a class="brand" href="../../system.jsp">Oasis</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="../../system.jsp">Principal</a>
                            </li>
                            <li class="">
                                <a href="../etc/pagSobre.jsp">Sobre a Organização</a>
                            </li>
                            <li class="">
                                <a href="../etc/pagContato.jsp">Contato</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="jumbotron masthead">
            <div class="container">
                <h1>Oasis</h1>
                <p>O sistema Oasis visa transformar a organização de peladas em uma tarefa simples, de modo interativo e atraente.</p>
            </div>
        </div>

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

            <div class="marketing">
                <p class="marketing-byline">No Oasis você pode se conectar e organizar grupos de amigos, agendar peladas e participar de torneios de maneira simples e intuitiva. Compartilhe com seus amigos, pois o Oasis é gartuito e sempre será.</p>
            </div>

            <form name="pagCadastroUsuario" id="pagCadastroUsuario" class="" method="post" action="../../CtrlPrincipal">
                <input type="hidden" name="index" id="index" value="1">

                <div align="center">
                    <table>
                        <tr>
                            <td rowspan="6">
                                <div class="row-fluid">
                                    <ul class="thumbnails example-sites">
                                        <li class="span10" >
                                            <a target="_blank">
                                                <img src="../../img/banner/04.png">
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </td>
                            <td style="width: 150px;"><strong>Nome: </strong></td>
                            <td><input name="nome" id="nome" type="text" class="input" placeholder="nome" autofocus required></td>
                        </tr>
                        <tr>
                            <td><strong>Sobrenome: </strong></td>
                            <td><input name="sobrenome" id="sobrenome" type="text" class="input" placeholder="sobrenome" value=""></td>
                        </tr>
                        <tr>
                            <td><strong>e-Mail: </strong></td>
                            <td><input name="mail" id="mail" type="email" class="input" placeholder="e-mail" required></td>
                        </tr>
                        <% if (u == null) {%>
                        <tr>
                            <td><strong>Senha: </strong></td>
                            <td><input name="senha1" id="senha1" type="password" class="input" placeholder="senha" required></td>
                        </tr>
                        <tr>
                            <td><strong>Reescreva a senha: </strong></td>
                            <td><input name="senha2" id="senha2" type="password" class="input" placeholder="reescreva sua senha"  required></td>
                        </tr>
                        <% } else {%>
                        <input type="hidden" name="index" id="index" value="5">
                        
                        <tr>
                            <td><strong>Senha Anterior: </strong></td>
                            <td><input name="senha3" id="senha3" type="password" class="input" placeholder="senha"></td>
                        </tr>
                        <tr>
                            <td><strong>Nova Senha: </strong></td>
                            <td><input name="senha4" id="senha4" type="password" class="input" placeholder="reescreva sua senha"></td>
                        </tr>
                        <%}%>
                    </table>

                    <table align="center">
                        <tr>
                            <td align="center"><input id="limpar" type="reset" class="btn btn-warning" value="Limpar"></td>
                            <td align="left"><input id="confirmar" type="submit" class="btn btn-primary" value="Confirmar"></td>
                        </tr>
                    </table>
                </div>
            </form>

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
        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
        <script src="http://code.jquery.com/jquery-migrate-1.0.0.min.js"></script>

        <script src="js/bootstrap.js"></script>
        <script src="js/holder/holder.js"></script>

        <!-- Analytics
        ================================================== -->

    </body>
</html>
