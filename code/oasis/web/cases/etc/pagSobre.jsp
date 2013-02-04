<%-- 
    Document   : pagSobre
    Created on : 31/01/2013, 01:07:07
    Author     : Gabriel Quézid
--%>


<%@page import="oasis.controleinterno.cdp.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <a class="brand" href="../../index.jsp">Oasis</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active">
                                <a href="../../system.jsp">Principal</a>
                            </li>
                            <li class="">
                                <a href="../etc/pagSobre.jsp">Sobre a Organização</a>
                            </li>
                            <%
                                Usuario u = null;
                                u = (Usuario) session.getAttribute("userS2teamoases");

                                if (u != null) {

                            %>
                            <li class="">
                                <a href="../event/pagEventoGrupo.jsp">Controle de Grupo(s)</a>
                            </li>
                            <li class="">
                                <a href="../event/pagEventoPelada.jsp">Controle de Pelada(s)</a>
                            </li>
                            <li class="">
                                <a href="../event/pagEventoUsuario.jsp">Visualize Perfil</a>
                            </li>
                            <% }%>
                            <li class="">
                                <a href="../etc/pagContato.jsp">Contato</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div id="myCarousel" class="carousel slide">
            <div class="carousel-inner">
                <div class="item active">
                    <img src="../../img/slideshow/01.jpg" alt="" style="width: 100%; height: 600px">
                    <div class="carousel-caption">
                        <h4>É GOOOOL!!</h4>
                        <p>Marque vários gols e compare com seus amigos.</p>
                    </div>
                </div>
                <div class="item">
                    <img src="../../img/slideshow/02.jpg" alt="" style="width: 100%; height: 600px">
                    <div class="carousel-caption">
                        <h4>Encontre-se em outras regiões.</h4>
                        <p>Você pode agendar suas partidas em qualquer região.</p>
                    </div>
                </div>
                <div class="item">
                    <img src="../../img/slideshow/03.jpg" alt="" style="width: 100%; height: 600px">
                    <div class="carousel-caption">
                        <h4>Não há mais limites!</h4>
                        <p>Dispute contra outros times e esteja entre os melhores.</p>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div>

        <div class="container">
            <div class="marketing">

                <h1>Introdução ao Oasis</h1>
                <p class="marketing-byline">Este é um trabalho prático desenvolvido por alunos de graduação do curso de Sistemas de Informação. O sistema Oasis visa transformar a organização de peladas em uma tarefa simples e atraente, de modo que a diversão do cliente seja prioridade.<p>
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
        <script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
        <script src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
        <script src="http://code.jquery.com/jquery-migrate-1.0.0.min.js"></script>

        <script src="../../js/bootstrap.js"></script>
        <script src="../../js/holder/holder.js"></script>

        <!-- Analytics
        ================================================== -->

    </body>
</html>
