<%--
    Document   : index
    Created on : Oct 2, 2018, 10:00:50 PM
    Author     : chrisloops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="layouts/header.jsp"/>

    <body>



<main>

    <div id="fullpage">

        <div data-anchor="home" id="main" class="section background-image home_background">
           
            <div class="row">
                <div class="small-12 columns small-top top">
                    <h3 class="text-center font-Candara">Bienvenido a mi mundo soy Robo Care</h3>
                </div>
            </div>

             <div class="row  small-middle" data-equalizer>


                <div class="center_abs small-11 medium-6 columns">
                    <img class="center_abs" src="./images/logo.gif" width="300">
                </div>
            </div>
            
            <div class="row bottom text-center">
                <h5 class="text-center font-Candara">Utiliza tu scroll para comenzar el viaje.</h5>

                <div class="ptop-20">
                    <a href="#about"><span class="icon icon-section_link"></span></a>
                </div>
            </div>
        </div>
        <!--HOME-->

        <div data-anchor="about" id="us" class="section background-image main_about_background">

            <div class="row">
                <div class="small-12 medium-7  columns small-xbottom  background-image background-gray">
                    <h1 class="pbottom-25">Acerca de mi</h1>

                    <p>Bienvenido estoy diseñado para ayudar y brindar información acerca de los seguros que ofrecemos, los cuales son especificamente para personas que les gusta viajar posiblemente como tú.</p>

                    <p>Trataré de darte la mayor información posible y guiarte en este aventura en Guatemala.</p>
                </div>

                <div class="row bottom text-center">
                    <a href="#benefits"><span class="icon icon-section_link"></span></a>
                </div>
            </div>
        </div>

        <!--GALLERY-->
        <div data-anchor="benefits" id="resources" class="section background-image main_benefits_background">

            <div class="row">
                <div class="small-12 medium-7 medium-offset-5 columns small-xbottom background-image background-gray">
                    <h1 class="pbottom-25">Beneficios</h1>

                    <p>Algunos de los beneficios que ofrecemos son darte un respaldo al momento que personas inescrupulosas quieran estafarte, algo que es comun cuando estas viajando.</p>

                    <p>De igual forma te ayudaremos si te pierdes o si te pasa algo esstando en nuestras fronteras.</p>
                </div>
            </div>

            <div class="row bottom text-center">
                <a href="#chat"><span class="icon icon-section_link"></span></a>
            </div>
        </div>

        <div data-anchor="chat" id="bot" class="section background-image main_chat_background">

            <div class="row small-xbottom">
                <div class="small-12 medium-7 columns  background-image background-gray">
                    <h1 class="pbottom-25">Chat</h1>


                    <p>¡Bienvenido! si necesitas mas información aqui estoy, solamente oprime el botón y con gusto te atenderé :).</p>
                    
                    
                    <div class="small-12 columns text-center">
                        
                        <a href="javascript:void(0)" class="button secondary cta cta-button" data-reveal-id="roboCare"><img src="./images/robo_head.png" width="50"/> Robo Care</a>
                        
                    </div>
                </div>
            </div>


          
        </div>
        <!--CONTACT-->
    </div>
</main>

        
        
        <div id="roboCare" class="reveal-modal" data-reveal aria-labelledby="roboCare" aria-hidden="true" role="dialog" style="background-color: aliceblue;">

    <div class="row">
        <div class="small-12 columns">
            
            
            <div class="row">
                <div class="small-12 columns pbottom-15">
                <div class="small-4 columns text-right">
                    <img src="./images/RoboRise.png" width="75"/>
                </div>
                <div class="small-8 columns">
                    <h1 class="font-Candara" style="text-transform: none; color: #282560;">Robo Care</h1>
                </div>
                </div>
                
                
                <div class="small-12 columns chat-content">

                </div>
            </div>
            

            <form method="POST" action="./robocare" data-abide="ajax" novalidate>
                <div class="row ptop-15">
                    <div class="small-10 medium-11 columns padding0">
                        <label>
                            <input type="text" name="message" placeholder="Escribe un mensaje..."  required/>
                        </label>
                    </div>
                    <div class="small-2  medium-1 columns padding0">
                        <button class="primary button" style="padding: 10px; border-radius: 100%; float: right;"><span class="icon-compass"></span></button>
                    </div>
                </div>
            </form>
        </div>


    </div>
    <a class="close-reveal-modal" aria-label="Close">&#215;</a>
</div>
        
    </body>

    <jsp:include page="layouts/footer.jsp" />

</html>
