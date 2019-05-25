/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.*;
import Models.BaseData;
import java.text.Normalizer;

/**
 *
 * @author chrisloops
 */
public class RoboCareController {

    ArrayList<BaseData> data = new ArrayList<BaseData>();

    ArrayList<String> default_answers = new ArrayList<String>(Arrays.asList(new String[]{
        "Lo siento no he logrado comprender tu pregunta, podrías intentarlo con nuevas palabras.",
        "Esa es una muy buena pregunta tanto que no puedo responderla, pero puedes contactarte con un experto con gusto te ayudara.",
        "Me temo que no tengo conocimiento en esa area lo siento.",
        "No logre entender :(, puede que no sepa tanto como creí pero alguien alguien con más experiencia podrá ayudarte con guste te ayudara.",
        "Ese es un gran misterio de la vida o bueno para mi lo es."
    }));

    public RoboCareController() {
        
        //SEGURO ESTAFA
        this.data.add(new BaseData(new String[][]{{"cuanto", "cuesta", "precio", "valor", "costo", "vale"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"estafas","fraude", "dinero"}}, new String[]{"El seguro a viajeros en caso de fraude tiene un costo de $100.00 y puedes agregar servicios extras al mismo en nuestro call center te brindaremos más información."}));
        this.data.add(new BaseData(new String[][]{{"que", "como", "es"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"estafas","fraude", "dinero"}}, new String[]{"El seguro a viajeros por estafa funciona de la siguiente forma al momento que lo contratas se te dara un carne provisional que tiene validez una semana antes y despúes del final de tu viaje, durante ese tiempo si alguien te estafa nosotros te respaldaremos con un cierto porcentaje que puede variar desde al 10 al 50% según el caso."}));
        this.data.add(new BaseData(new String[][]{{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"estafas","fraude", "dinero"}}, new String[]{"El seguro a viajeros por estafa funciona de la siguiente forma al momento que lo contratas se te dara un carne provisional que tiene validez una semana antes y despúes del final de tu viaje, durante ese tiempo si alguien te estafa nosotros te respaldaremos con un cierto porcentaje que puede variar desde al 10 al 50% según el caso."}));
        this.data.add(new BaseData(new String[][]{{"estafas","fraude", "dinero"}}, new String[]{"El seguro a viajeros por estafa funciona de la siguiente forma al momento que lo contratas se te dara un carne provisional que tiene validez una semana antes y despúes del final de tu viaje, durante ese tiempo si alguien te estafa nosotros te respaldaremos con un cierto porcentaje que puede variar desde al 10 al 50% según el caso."}));

        //SEGURO EXTRAVIO
        this.data.add(new BaseData(new String[][]{{"cuanto", "cuesta", "precio", "valor", "costo", "vale"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"extravio","perdida", "olvide", "cayo"}}, new String[]{"El seguro a viajeros en caso de extravío tiene un costo de $300.00, es muy recomdable si sientes que al lugar al que vas es muy disperso o inseguro."}));
        this.data.add(new BaseData(new String[][]{{"que", "como", "es"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"extravio", "olvide", "cayo"}}, new String[]{"El seguro a viajeros en caso de extravío funciona de la sigiuente forma: al momento que adquieras el seguro nosotros te brindaremos una pulsera la cual contiene un gps si en dado momento te llegas a extraviar solamente debes presional el botón de SOS y nuestros agentes te ayudarán a regresar a tu punto."}));
        this.data.add(new BaseData(new String[][]{{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"extravio", "olvide", "cayo"}}, new String[]{"El seguro a viajeros en caso de extravío funciona de la sigiuente forma: al momento que adquieras el seguro nosotros te brindaremos una pulsera la cual contiene un gps si en dado momento te llegas a extraviar solamente debes presional el botón de SOS y nuestros agentes te ayudarán a regresar a tu punto."}));
        this.data.add(new BaseData(new String[][]{{"extravio", "olvide", "cayo"}}, new String[]{"El seguro a viajeros en caso de extravío funciona de la sigiuente forma: al momento que adquieras el seguro nosotros te brindaremos una pulsera la cual contiene un gps si en dado momento te llegas a extraviar solamente debes presional el botón de SOS y nuestros agentes te ayudarán a regresar a tu punto."}));


        //SEGURO RAPTO O SECUESTRO
        this.data.add(new BaseData(new String[][]{{"cuanto", "cuesta", "precio", "valor", "costo", "vale"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"rapto","secuestro", "raptaron", "secuestro"}}, new String[]{"El seguro de raptos y secuestros en caso de extravío tiene un costo de $200.00, es muy util."}));
        this.data.add(new BaseData(new String[][]{{"que", "como", "es"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"rapto","secuestro", "raptaron", "secuestro"}}, new String[]{"El seguro por rapto o secuentro brinda la seguridad necesaria al momento de secuestro. Busca siempre tu confortabilidad y seguridad.."}));
        this.data.add(new BaseData(new String[][]{{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"rapto","secuestro", "raptaron", "secuestro"}}, new String[]{"El seguro por rapto o secuentro brinda la seguridad necesaria al momento de secuestro. Busca siempre tu confortabilidad y seguridad."}));
        this.data.add(new BaseData(new String[][]{{"rapto","secuestro", "raptaron", "secuestro"}}, new String[]{"El seguro por rapto o secuentro brinda la seguridad necesaria al momento de secuestro. Busca siempre tu confortabilidad y seguridad."}));

        

        //SEGURO DE PERDIDA DE VUELO
        this.data.add(new BaseData(new String[][]{{"cuanto", "cuesta", "precio", "valor", "costo", "vale"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"vuelo","perdida", "perdi", "perder"}}, new String[]{"El seguro de raptos y secuestros en caso de extravío tiene un costo de $200.00, es muy util."}));
        this.data.add(new BaseData(new String[][]{{"que", "como", "es"},{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"vuelo","perdida", "perdi", "perder"}}, new String[]{"El seguro de perdida de vuelo te ayuda al momento que no llegues a tiempo a el aeropuerto y pierdas tu vuelo. Nosotros en ese momento haremos todo lo posible por conseguirte un viaje en menos de 12 horas depende del caso te cubriremos del 80 al 100%."}));
        this.data.add(new BaseData(new String[][]{{"seguro", "seguros" , "poliza", "polizas", "viajeros"},{"vuelo","perdida", "perdi", "perder"}}, new String[]{"El seguro de perdida de vuelo te ayuda al momento que no llegues a tiempo a el aeropuerto y pierdas tu vuelo. Nosotros en ese momento haremos todo lo posible por conseguirte un viaje en menos de 12 horas depende del caso te cubriremos del 80 al 100%."}));
        this.data.add(new BaseData(new String[][]{{"vuelo","perdida", "perdi", "perder"}}, new String[]{"El seguro de perdida de vuelo te ayuda al momento que no llegues a tiempo a el aeropuerto y pierdas tu vuelo. Nosotros en ese momento haremos todo lo posible por conseguirte un viaje en menos de 12 horas depende del caso te cubriremos del 80 al 100%."}));

          //GENERALES
        this.data.add(new BaseData(new String[][]{{"hola", "hi", "estas alli"}}, new String[]{"Hola ¿Como estas?", "¿Como esta todo?", "¿Como has estado estos dias?", "Hola :), Dime como puedo ayudarte.", "¿Que tal todo por alli? Si necesitas ayuda dime aqui estoy."}));
        this.data.add(new BaseData(new String[][]{{"para", "por", "como", "que", "porque"}, {"existes","funcionas","trabajas", "ofreces", "ofrece", "existe", "funciona", "trabaja", "sirve", "sirves"}}, new String[]{"Hola soy RoboCare y mi función es ayudarte y mostrarte los servicios que prestamos.", "Tenemos algunos seguros que pueden te interesen.", "Somos una empresa que nos dedicamos a ofrecer seguros a los viajeros que vienen a Guatemala, nuestro mayor objetivo es ayudar."}));

        
        this.data.add(new BaseData(new String[][]{
                {"eres", "sos", "que"},
                {"humano", "boot", "chatbot", "robot", "persona", "real"}
        },
        new String[]{"Soy RoboCare lo importante no es que soy, si no cuanto puedo aydarte. Realmente espero hacerlo :).", "Solamente soy yo mi principal objetivo es orientarte y brindarte información acerca de nuestros servicios.", "Soy tan real como Siri o un poco menos jajaja. Yo te puedo ayudar con seguros."}));

this.data.add(new BaseData(new String[][]{
    {"cual", "como", "tienes"},
    {"nombre", "llamas", "llama"}
},
new String[]{"Soy RoboCare :) es un gusto hablar contigo.", "Mi nombre es RoboCare me puedes llamar Robotio.", "Si tengo nombre :) es RoboCare."}));

this.data.add(new BaseData(new String[][]{
    {"como", "que", "tal", "bien" , "mal","triste","emocionado","contento","alegre","enojado","furioso"},
    {"estas", "sientes", "esta", "siente"}
},
new String[]{"Pues estoy normal como siempre, supongo que no tengo muchas emociones.", "De hecho hoy estoy algo nervioso.", "Slow and steady.", "Hoy es un día anormal estoy emocionado.", "De repente me dan ganas de ir con algún viajero, pero luego recuerdo que tengo que hablar contigo y se me pasa.", "No mal gracias por preguntar.", "Supongo que un robot siempre se siente igual, espera dije robot mm humm quiero decir humano."}));

this.data.add(new BaseData(new String[][]{
    {"gusta", "gustas", "parece", "bonito", "bonita"}
},
new String[]{"No lo se dejame pensarlo un poco más.", "De hecho no.", "Claro que si acaso a tí no?.", "Si es lo mejor que hay.", "Como es que alguien le gusta eso.", "Porque preguntas eso?.", "No quiero responder ahora, vuelve a intentar de nuevo."}));


//GUATEMALA THINGS
this.data.add(new BaseData(new String[][]{
    {"que", "cual", "recomienda", "recomiendas", "donde", "recomendarias", "recomendas"},
    {"lugar", "turistico", "famoso", "puedo", "podemos", "visitar", "mirar", "pasar", "puedo", "ir"},
    {"Guatemala", "aqui", "ir"}
},
new String[]{
    "Hola viajero puedes visitar Antigua Guatemala alli hay muchos lugares interesantes en los que puedes pasar un excelente día. Te recomiendo el Cerro de la Cruz.",
    "Hola puedes visitar el Gran Jaguar en Peten conoceras muchos acerca de la cultura maya.",
    "La cuidad capital tiene lugares historicos los cuales puedes visitar si vienes en Semana Santa puedes ver muchas procesiones y aprender un poco más de esta cultura.",
    "En la capital en la zona 7 hay un lugar que se llama Kaminal Juyu puedes ir aprender mas acerca de la cultura maya.",
    "En Chimaltenango se encuentra Iximche es un muy bonito lugar, nunca he estado alli pero tu sabes hay que intentar.",
    "Ve a Solola allá esta el lado de Atitlan a pesar de lo que le ha pasado puedes observar su parcial belleza.",
    "Si la adrenalina es lo tuyo puedes ir a Xetulul y Xocomil en Retalhuleu te divertiras mucho.",
    "En la capital se encuentra Mundo Petapa es un muy buen parque de diversiones deberias considerlo.",
    "En Izabal se encuentra el castillo de San Felipe es un lugar sumamente hermoso.",
    "Puedes ir al biotopo del quetzal y ver en vivo a estas hermosas aves. Por cierto no te has preguntado porque no hay un pokemón basado en el quetzal o ¿será que es Articuno?.",
    "Xemuc es 'Semuc Champey (donde el río se esconde bajo las piedras), es un enclave natural localizado próximo al municipio guatemalteco de Lanquín (12 km aprox. al sur de Lanquín), en el departamento de Alta Verapaz, Guatemala. ' según Wikipedia.",
    "Playa Blanca izabal es un verdadero paraíso. Es una playa tranquila con arena blanca que se encuentra en el departamento de Izabal, a pocos minutos en lancha desde Río Dulce.",
    "Xela es la segunda ciudad más grande the Guatemala. Esta ciudad metropolitana está llena de vida nocturna, hoteles, escuelas de español y restaurantes, haciéndola un lugar excelente para pasar un tiempo aprendiendo español o usándolo como una base para aventurarse a sus alrededores.",
    "El Volcán de Ipala es famoso por tener una hermosa laguna en su cráter. La laguna que se abastece principalmente con el agua de las lluvias estacionales y que está rodeada de un exuberante bosque nuboso; permite observar variedad de especies de flora y fauna de la región. El ascenso al volcán es fácil, cómodo y seguro.",
    "La Basílica de Esquipulas es un templo de estilo barroco que esta ubicado en el municipio de Esquipulas, Departamento de Chiquimula, y que alberga a la venerada imagen del Cristo Negro de Esquipulas.Es la capital de la fe en centroamerica pero puede que si vas en Enero sea muy dificil entrar :(.",
    "Punta de Manabique es un importante humedal costero marino que forma una península que separa la Bahía de Amatique del Golfo de Honduras."
}));

this.data.add(new BaseData(new String[][]{
    {"como","que", "cual"},
    {"cultura", "actividades", "actividad", "comportamiento", "tradiciones"},
    {"Guatemala", "aqui", "es"}
},
new String[]{
    "Nuestra cultura es bastante especial es algo dificil de resumir sin embargo es muy problabe que nos sonriamos aunque no te conozcamos.",
        "Muchas personas dicen que nos pasamos de amables he inclusive los llega a molestar ¿que raro no?.",
        "Aqui tenemos muchas tradiciones podriamos decir que estamos activos todo el año y es algo bueno o eso creo.",
        "Creo que todos nos conocen a nivel mundial por nuestras actividades en Semana Santa.¿Alguna vez has visto una procesión?",
        "Somos un país multicultural tenemos al rededor de 25 idiomas diferentes, imaginate eso.",
        "Principalmente nos dividimos en 4 etnias: Ladino, Gariuna, Maya y Xinca. Tienes que conocernos a todos.",
        "Basicamente hablamos español pero tenemos nuestra propia forma de comunicarnos asi que si no entiendes algo preguntanos no nos enojaremos.",
        "¿Sabes que es chilero?. Es uno de nuestros tantos guatemaltequismos signifa que algo esta muy bien.",
        "Somos Centroamericanos.",
}));


this.data.add(new BaseData(new String[][]{
    {"cual", "que", "hay"},
    {"hotel", "hostel", "residencias", "lugares"}
},
new String[]{
    "Los mejores hoteles en Guatemla son: <br>"
            + "1. Hyatt Centric Guatemala City en zona 10.<br>"
            + "2. Courtyard en Guatemela City.<br>"
            + "3. La Inmaculada Hotel. <br>"
            + "4. Hotel Clarion Suites Guatemala. <br>"
            + "5. Hotel Real Continental. <br>"
            + "6. Hotel San Carlos. <br>"
            + "7. Barcelo Guatemala. <br>"
            + "8. Meraky Boutique Hotel. <br>"
            + "9. Central 10 Boutique Hostel. <br>"
            + "10. Holiday Inn Guatemala. <br>"
            + "11. Westing Camino Real Guatemala. <br>"
            + "12. Hotel Casa Veranda <br>"
            + "Puedes visitar sus paginas oficiales esperamos tengas una gran experiencia.",
}));



this.data.add(new BaseData(new String[][]{
    {"tengo", "necesito", "necesario", "obligatorio", "cual"},
    {"visa", "permisos", "pasporte", "requisito"}
},
new String[]{
    "Solo ciudadanos de algunos países deben tramitar visa de turismo para viajar a Guatemala.Entre los países que no deben tramitar visa de turismo, figuran los que hacen parte de la Unión Europea, Estados Unidos, Canadá, Australia y los siguientes países americanos: Argentina, Bahamas, Barbados, Belice, Brasil, Chile, Costa Rica, Colombia, Costa Rica, El Salvador, Honduras, México, Nicaragua, Panamá, Paraguay, Perú, San Cristóbal y Nevis, San Vicente y Granadinas, Santa Lucía, Trinidad y Tobago, Uruguay y Venezuela.",
}));

this.data.add(new BaseData(new String[][]{
    {"cual", "que", "hay"},
    {"moneda", "billete", "dinero"}
},
new String[]{
    "En Guatemala usamos Quetzales usualmante un Dólar en promedio vale Q7.50.",
}));

this.data.add(new BaseData(new String[][]{
    {"cuales","que", "cuantos", "cuales"},
    {"servicios", "seguros", "seguro", "servicios", "son"},
    {"ofrece", "ofreces", "tienes", "tiene", "cuenta", "cuentas", "son"}
},
new String[]{
    "Ofrecemos 4 servicios los cuales son : 1.Seguros por fraude, 2. Seguros por extravío, 3. Seguros por rapto o secuestro, 4. Seguros por perdida de vuelo."
}));

this.data.add(new BaseData(new String[][]{
    {"acaso","los", "seran", "son", "tienen", "valor", "cuentan"},
    {"servicios", "seguros", "seguro", "servicios"},
    {"internacionales", "internacional", "extranjero"}
},
new String[]{
    "Nuestros servicios si eres extranjero solamente tienen validez en Guatemala. Sin embargo si eres un guatemalteco que viaja constantemente y llegas a estar en una de estas situaciones podremos ayudarte desde aquí."
}));

this.data.add(new BaseData(new String[][]{
    {"cual","cuanto", "son", "tiene", "valor", "cuenta"},
    {"servicios", "seguros", "seguro", "servicios"},
    {"internacionales", "internacional", "extranjero"}
},
new String[]{
    "Nuestros servicios si eres extranjero solamente tienen validez en Guatemala. Sin embargo si eres un guatemalteco que viaja constantemente y llegas a estar en una de estas situaciones podremos ayudarte desde aquí."
}));

//Eliminar
this.data.add(new BaseData(new String[][]{
    {"puedo", "acaso", "sera"},
    {"cancelar", "eliminar", "salirme", "dejar", "de","pagar", "dejo de pagar", "darme"},
    {"servicios", "seguros", "seguro", "servicios", "baja"}
},
new String[]{
    "Si claro no hay problema con gusto te ayudaremos.",
    "Claro que si no te preocupes no hay ningun problema.",
    "Estamos seguros que despues de vivir la experiencia de estar a salvo no te querras ir, pero si aún quisieras hacerlo claro que puedes :)."
}));

this.data.add(new BaseData(new String[][]{
    {"como", "acaso", "sera" },
    {"cancelar", "eliminar", "salirme", "dejar", "de","pagar", "dejo de pagar", "darme", "doy"},
    {"servicios", "seguros", "seguro", "servicios", "baja", "los", "me"}
},
new String[]{
    "Para cancelar el servicio debes de hacerlo antes que tu viaje inicie. Despues de esto no podremos ayudarte ya que es parte de nuestras politicas."
}));

//Restricciones
this.data.add(new BaseData(new String[][]{
    {"cuales","tienen", "existe", "hay"},
    {"terminos", "condiciones"}
},
new String[]{
    "Nuestros servicios son propiedad de RoboCare SA nos dedicamos a brindar servicios a viajeros y solventar sus necesidades basicas por lo que el objetivo principal es brindar seguros temporales de viajes y eliminar el riesgo posible en estos eventos.Los seguros unicamente son validos hasta una semana despues del viaje es decir despues de esta fecha no se puede reclamar ningún deducible o similares.    Si deseas cancelar un seguro debe ser antes de que el viaje inicie."
}));

//Terminos y condiciones
this.data.add(new BaseData(new String[][]{
    {"cuales","tienen", "existe", "hay"},
    {"terminos", "uso"}
},
new String[]{
    "Para poder apoyarte y brindarte nuestro mejor servicio necesitamos evaluar la situación y los motivos por los cuales se dio es muy poco probable que no tu situación no aplique asi que no te sientas preopado con gusto te ayudaremos.",
}));

//Terminos de uso
this.data.add(new BaseData(new String[][]{
    {"cuales","tienen", "existe", "hay"},
    {"restriccion"}
},
new String[]{
    "Los seguros unicamente son validos hasta una semana despues del viaje es decir despues de esta fecha no se puede reclamar ningún deducible o similares.    Si deseas cancelar un seguro debe ser antes de que el viaje inicie.",
}));

    }

    public String bringAnAnswer(String input) {
        input = this.limpiarAcentos(input);

        input = input.toLowerCase();
        for (BaseData item : this.data) {
            if (item.matchesWithMyOwnKeywords(input)) {
                return item.getRandomAnswer();
            }
        }
        

        
        return this.getRandomDefaultAnswer();
    }

    public String getRandomDefaultAnswer() {
        int index = this.getRandomIntegerBetweenRange(0, (this.default_answers.size() - 1));
        return this.default_answers.get(index);
    }

    private int getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return (int) x;
    }

    
    public static String limpiarAcentos(String cadena) {
    String limpio =null;
    if (cadena !=null) {
        String valor = cadena;
        valor = valor.toUpperCase();
        // Normalizar texto para eliminar acentos, dieresis, cedillas y tildes
        limpio = Normalizer.normalize(valor, Normalizer.Form.NFD);
        // Quitar caracteres no ASCII excepto la enie, interrogacion que abre, exclamacion que abre, grados, U con dieresis.
        limpio = limpio.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");
        // Regresar a la forma compuesta, para poder comparar la enie con la tabla de valores
        limpio = Normalizer.normalize(limpio, Normalizer.Form.NFC);
    }
    return limpio;
}
}
