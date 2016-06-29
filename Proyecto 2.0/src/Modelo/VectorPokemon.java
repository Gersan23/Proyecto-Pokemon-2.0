/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import imagenes.DevuelveImagen;
import Modelo.Pokemon;


/**
 *
 * @author llasu
 */
public class VectorPokemon {
    private Pokemon vectorPoke[];
    DevuelveImagen imagen= new DevuelveImagen();
    Pokemon poke1,poke2,poke3,poke4,poke5,poke6,poke7,poke8,poke9,poke10,poke11,poke12,poke13,poke14,poke15,poke16,poke17,poke18,poke19,
            poke20,poke21,poke22,poke23,poke24,poke25,poke26,poke27,poke28,poke29,poke30,poke31,poke32,poke33,poke34,poke35,poke36,poke37,poke38,poke39,
            poke40,poke41,poke42,poke43,poke44,poke45,poke46,poke47,poke48,poke49,poke50,poke51,poke52,poke53,poke54,poke55,poke56,poke57,poke58,poke59,
            poke60,poke61,poke62,poke63,poke64,poke65,poke66,poke67,poke68,poke69,poke70,poke71,poke72,poke73,poke74,poke75,poke76,poke77,poke78,poke79,
            poke80,poke81,poke82,poke83,poke84,poke85,poke86,poke87,poke88,poke89,poke90,poke91,poke92,poke93,poke94,poke95,poke96,poke97,poke98,poke99,
            poke100,poke101,poke102,poke103,poke104,poke105,poke106,poke107,poke108,poke109,poke110,poke111,poke112,poke113,poke114,poke115,poke116,poke117,poke118,poke119,
            poke120,poke121,poke122,poke123,poke124,poke125,poke126,poke127,poke128,poke129,poke130,poke131,poke132,poke133,poke134,poke135,poke136,poke137,poke138,poke139,
            poke140,poke141,poke142,poke143,poke144,poke145,poke146,poke147,poke148,poke149,poke150,poke151;
            
    public VectorPokemon(){
        vectorPoke= new Pokemon[151];
        inicializarPokemon();
    }
    public Pokemon poke(int posicion){
        return vectorPoke[posicion];
    }
    
    public void inicializarPokemon(){//buscar metodo 
        poke1 = new Pokemon("Bulbasaur",0,"1",imagen.inicializarPokemon(1),"Tipo:\nA Bulbasaur es fácil verle echándose una siesta al sol. La semilla que\ntiene en el lomo va creciendo cada vez más a medida que absorbe\n los rayos del sol.");
        vectorPoke[0]=poke1; 
        poke2 = new Pokemon("Ivysaur",0,"2",imagen.inicializarPokemon(2),"Tipo: \nEste Pokémon lleva un bulbo en el lomo y, para poder con su\n peso, tiene unas patas y un tronco gruesos y fuertes. Si empieza a pasar\n más tiempo al sol, será porque el bulbo está a punto de hacerse\n una flor grande.");
        vectorPoke[1]=poke2;
        poke3 = new Pokemon("Venusaur",0,"3",imagen.inicializarPokemon(3),"Tipo: \nVenusaur tiene una flor enorme en el lomo que, según parece, \n adquiere unos colores muy vivos si está bien nutrido y le da mucho el sol. \n El aroma delicado de la flor tiene un efecto relajante en el ánimo de las\n personas.");
        vectorPoke[2]=poke3; 
        poke4 = new Pokemon("Charmander",0,"4",imagen.inicializarPokemon(4),"Tipo: \nLa llama que tiene en la punta de la cola arde según sus \n sentimientos. Llamea levemente cuando está alegre y arde\n vigorosamente cuando está enfadado.");
        vectorPoke[3]=poke4;
        poke5 = new Pokemon("Charmeleon",0,"5",imagen.inicializarPokemon(5),"Tipo: \nCharmeleon no tiene reparo en acabar con su rival usando las\n afiladas garras que tiene. Si su enemigo es fuerte, se vuelve agresivo, y\n la llama que tiene en el extremo de la cola empieza a arder con mayor\n intensidad tornándose azulada.");
        vectorPoke[4]=poke5;
        poke6= new Pokemon("Charizard",0,"6",imagen.inicializarPokemon(6),"Tipo: \nCharizard se dedica a volar por los cielos en busca de oponentes\n fuertes. Echa fuego por la boca y es capaz de derretir cualquier cosa. \n No obstante, si su rival es más débil que él, no usará\n este ataque.");
        vectorPoke[5]=poke6;
        poke7 = new Pokemon("Squirtle",0,"7",imagen.inicializarPokemon(7),"Tipo: \nEl caparazón de Squirtle no le sirve de protección únicamente. \n Su forma redondeada y las hendiduras que tiene le ayudan a deslizarse\n en el agua y le permiten nadar a gran velocidad.");
        vectorPoke[6]=poke7;
        poke8 = new Pokemon("Wartortle",0,"8",imagen.inicializarPokemon(8),"Tipo: \nTiene una cola larga y cubierta de un pelo abundante y grueso\n que se torna más oscuro a medida que crece. Los arañazos que tiene en\n el caparazón dan fe de lo buen guerrero que es.");
        vectorPoke[7]=poke8;
        poke9 = new Pokemon("Blastoise",0,"9",imagen.inicializarPokemon(9),"Tipo: \nBlastoise lanza chorros de agua con gran precisión por los tubos\n que le salen del caparazón que tiene en la espalda. Puede\n disparar chorros de agua con tanta puntería que no fallaría al tirar contra \n una lata pequeña a 50 m.");
        vectorPoke[8]=poke9;
        poke10 = new Pokemon("Caterpie",0,"10",imagen.inicializarPokemon(10),"Tipo: \nCaterpie tiene un apetito voraz. Es capaz de devorar hojas que \n superen su tamaño en un abrir y cerrar de ojos. \n Atención a la antena que tiene: libera un hedor realmente fuerte.");
        vectorPoke[9]=poke10;
        poke11= new Pokemon("Metapood",0,"11",imagen.inicializarPokemon(11),"Tipo: \nLa capa que recubre el cuerpo de este Pokémon es tan dura\n como una plancha de hierro. Metapod apenas se mueve. Permanece\n inmóvil para que las vísceras evolucionen dentro de la coraza que le \n rodea.");
        vectorPoke[10]=poke11;
        poke12 = new Pokemon("Buterfree",0,"12",imagen.inicializarPokemon(12),"Tipo: \nButterfree tiene una habilidad especial para encontrar delicioso\n polen en las flores. Puede localizar, extraer y transportar polen de flores\n que estén floreciendo a 10 km de distancia de su nido."); 
        vectorPoke[11]=poke12;
        poke13= new Pokemon("Weedle",0,"13",imagen.inicializarPokemon(13),"Tipo: \nWeedle tiene un finísimo sentido del olfato. Es capaz de distinguir\n las hojas que le gustan de las que no le gustan\n olisqueando un poco con la gran nariz que tiene.");
        vectorPoke[12]=poke13;
        poke14= new Pokemon("Kakuna",0,"14",imagen.inicializarPokemon(14),"Tipo: \nKakuna permanece prácticamente inmóvil al encaramarse a \n los árboles, aunque la actividad interna de su organismo tiene\n un ritmo frenético, pues se prepara para su evolución. Prueba de esto\n es la alta temperatura de su caparazón.");
        vectorPoke[13]=poke14; 
        poke15 = new Pokemon("Beedrill",0,"15",imagen.inicializarPokemon(15),"Tipo: \nLos Beedrill defienden su territorio a toda costa. No es\n conveniente acercarse a su colmena, por seguridad. \n Si se les molesta, todo un enjambre atacará ferozmente.");
        vectorPoke[14]=poke15; 
        poke16 = new Pokemon("Pidgey",0,"16",imagen.inicializarPokemon(16),"Tipo: \nPidgey tiene un sentido de la orientación muy desarrollado. \n Es capaz de regresar a su nido, por lejos\n que se encuentre de las zonas que le resultan familiares.");
        vectorPoke[15]=poke16; 
        poke17 = new Pokemon("Pidgeotto",0,"17",imagen.inicializarPokemon(17),"Tipo: \nPidgeotto se apodera de una zona muy vasta como su\n territorio y la sobrevuela para controlarla. Si alguien invade\n su espacio vital, no tendrá ningún reparo en\n castigarlo con sus afiladas garras.");
        vectorPoke[16]=poke17; 
        poke18 = new Pokemon("Pidgeot",0,"18",imagen.inicializarPokemon(18),"Tipo: \nEl plumaje de este Pokémon es bonito e hipnótico. Muchos\n Entrenadores se quedan embobados ante la belleza impactante de las\n plumas que tiene en la cabeza; lo que les lleva a elegir a Pidgeot como\n su Pokémon.");
        vectorPoke[17]=poke18; 
        poke19 = new Pokemon("Rattata",0,"19",imagen.inicializarPokemon(19),"Tipo: \nRattata es cauto como él solo. Hasta cuando duerme mueve las\n orejas para oír todos los ruidos. No es nada delicado a la hora de elegir \n su hábitat. Cualquier sitio es bueno para\n cavar su madriguera.");
        vectorPoke[18]=poke19; 
        poke20 = new Pokemon("Raticate",0,"20",imagen.inicializarPokemon(20),"Tipo: \nA Raticate le crecen los incisivos firmes y fuertes. Para\n mantenerlos afilados roe troncos y rocas, \n e incluso las paredes de las casas.");
        vectorPoke[19]=poke20; 
        poke21 = new Pokemon("Spearow",0,"21",imagen.inicializarPokemon(21),"Tipo: \nSpearow pía con tanta fuerza que se le puede oír a 1 km de\n distancia. Si al agudo chillido le sigue una especie de eco, estaremos\n oyendo la respuesta de otros Spearow que contestan ante el aviso de\n peligro.");
        vectorPoke[20]=poke21; 
        poke22 = new Pokemon("Fearow",0,"22",imagen.inicializarPokemon(22),"Tipo: \nA Fearow se le reconoce por tener un pescuezo y un pico largos\n que le permiten cazar en tierra\n y agua. Tiene una gran habilidad moviendo el\n fino pico para atrapar a sus presas.");
        vectorPoke[21]=poke22; 
        poke23 = new Pokemon("Ekans",0,"23",imagen.inicializarPokemon(23),"Tipo: \nEkans se enrosca para descansar. Adoptando\n esta posición puede responder rápidamente a cualquier\n amenaza que le aceche desde cualquier lugar, levantando la\n cabeza con una feroz mirada.");
        vectorPoke[22]=poke23; 
        poke24 = new Pokemon("Arbok",0,"24",imagen.inicializarPokemon(24),"Tipo: \nEste Pokémon es tremendamente fuerte, puede\n oprimir cualquier cosa con su cuerpo y hasta es capaz de estrujar\n un barril de acero. Una vez que Arbok se enrosca a su víctima, no\n hay forma de escapar de su asfixiante abrazo.");
        vectorPoke[23]=poke24; 
        poke25 = new Pokemon("Pikachu",0,"25",imagen.inicializarPokemon(25),"Tipo: \nCada vez que un Pikachu se encuentra con algo\n nuevo, le lanza una descarga eléctrica. Cuando se ve alguna\n baya chamuscada, es muy probable que sea obra de un Pikachu, \n ya que a veces no controlan la intensidad de la descarga");
        vectorPoke[24]=poke25;
        poke26 = new Pokemon("Raichu",0,"26",imagen.inicializarPokemon(26),"Tipo: \nSi las bolsas de los mofletes se le cargan demasiado, Raichu\n planta la cola en el suelo para liberar electricidad. Es común encontrar\n zonas chamuscadas cerca de la madriguera de este Pokémon.");
        vectorPoke[25]=poke26;
        poke27 = new Pokemon("Sandshrew",0,"27",imagen.inicializarPokemon(27),"Tipo: \nSandshrew es capaz de absorber agua y no perder ni una gota, \n algo que le permite sobrevivir en el desierto. Este Pokémon se enrosca \n para defenderse de los enemigos.");
        vectorPoke[26]=poke27;
        poke28 = new Pokemon("Sandslash",0,"28",imagen.inicializarPokemon(28),"Tipo: \nSandslash está recubierto de duras púas que son partes\n endurecidas de la piel. Suele mudarlas una vez al año; debajo de las\n viejas púas crecen unas nuevas que las sustituyen.");
        vectorPoke[27]=poke28;
        poke29 = new Pokemon("Nidoran",0,"29",imagen.inicializarPokemon(29),"Tipo: \nNidoran? tiene púas que segregan un veneno muy potente. \n Se piensa que las desarrolló como protección del cuerpo tan pequeño\n que tiene. Cuando se enfada, libera una horrible sustancia tóxica por\n el cuerno.");
        vectorPoke[28]=poke29;
        poke30 = new Pokemon("Nidorina",0,"30",imagen.inicializarPokemon(30),"Tipo: \nCuando están en familia o con sus amigos, esconden las\n púas para evitar accidentes. Según parece, se alteran bastante si se\n separan del grupo.");
        vectorPoke[29]=poke30;
        poke31 = new Pokemon("Nidoqueen",0,"31",imagen.inicializarPokemon(31),"Tipo: \nNidoqueen tiene el cuerpo totalmente recubierto de escamas\n durísimas. Suele lanzar por los aires a sus rivales de\n los violentos golpes que les propina. Cuando se trata de\n defender a sus crías, alcanza su nivel máximo de fuerza.");
        vectorPoke[30]=poke31;
        poke32 = new Pokemon("Nidoran",0,"32",imagen.inicializarPokemon(32),"Tipo: \nNidoran? ha desarrollado músculos para mover las orejas y \n orientarlas en cualquier dirección. De este modo, es capaz de captar\n hasta el sonido más leve.");
        vectorPoke[31]=poke32;
        poke33 = new Pokemon("Nidorino",0,"33",imagen.inicializarPokemon(33),"Tipo: \nNidorino tiene un cuerno de dureza superior a la del diamante. \n Si siente una presencia hostil, se le erizan las púas del lomo enseguida y\n carga contra el enemigo con todas sus fuerzas.");
        vectorPoke[32]=poke33;
        poke34 = new Pokemon("Nidoking",0,"34",imagen.inicializarPokemon(34),"Tipo: \nLa gruesa cola de Nidoking encierra una fuerza realmente\n destructora. Con una vez que la agite, es capaz de tumbar una torre\n metálica de transmisión. Una vez que este\n Pokémon se desboca, no hay quien lo pare.");
        vectorPoke[33]=poke34;
        poke35 = new Pokemon("Clefairy",0,"35",imagen.inicializarPokemon(35),"Tipo: \nSiempre que hay luna llena, salen en grupo para jugar. \n Al amanecer, los Clefairy, agotados, regresan a sus\n refugios de montaña para dormir\n acurrucados unos con otros.");
        vectorPoke[34]=poke35;
        poke36 = new Pokemon("Clefable",0,"36",imagen.inicializarPokemon(36),"Tipo: \nClefable se mueve dando saltitos como si fuera haciendo\n uso de las alas. Estos pequeños brincos le permiten caminar\n por el agua. De todos es sabido que le encanta darse paseos\n por los lagos en tranquilas noches de luna llena.");
        vectorPoke[35]=poke36;
        poke37= new Pokemon("Vulpix",0,"37",imagen.inicializarPokemon(37),"Tipo: \nAl nacer, Vulpix tiene una cola blanca que se divide\n en seis si recibe cariño por parte de su Entrenador. \n Las seis colas se le rizan de \n forma majestuosa.");
        vectorPoke[36]=poke37;
        poke38 = new Pokemon("Ninetales",0,"38",imagen.inicializarPokemon(38),"Tipo: \nNinetales emite una siniestra luz a través de los brillantes ojos\n rojos que tiene, para conseguir controlar del todo la mente de su rival. \n Dicen que este Pokémon llega a vivir mil años.");
        vectorPoke[37]=poke38;
        poke39 = new Pokemon("Jigglypuff",0,"39",imagen.inicializarPokemon(39),"Tipo: \nJigglypuff tiene unas cuerdas vocales que ajustan sin problema la\n longitud de onda de su voz. Este Pokémon usa la habilidad que tiene para\n cantar con la longitud de onda necesaria para \n adormecer a su rival.");
        vectorPoke[38]=poke39;
        poke40 = new Pokemon("Wigglytuff",0,"40",imagen.inicializarPokemon(40),"Tipo: \nWigglytuff tiene unos ojos enormes con forma de platillo, \n que siempre están cubiertos de lágrimas. \n Si se le metiera algo en el ojo, enseguida\n se le saldría solo.");
        vectorPoke[39]=poke40;
        poke41 = new Pokemon("Zubat",0,"41",imagen.inicializarPokemon(41),"Tipo: \nDurante el día, Zubat permanece inmóvil y a oscuras. \n Si este Pokémon pasara mucho tiempo expuesto al sol, \n correría el peligro de sufrir quemaduras.");
        vectorPoke[40]=poke41;
        poke42 =new Pokemon("Golbat",0,"42",imagen.inicializarPokemon(42),"Tipo: \nA Golbat le encanta chuparles la sangre a los seres vivos. \n Este Pokémon es más activo en la oscuridad de la noche. \n Es al caer la noche cuando sale a \n revolotear y a buscar sangre fresca.");
        vectorPoke[41]=poke42;
        poke43 =new Pokemon("Oddish",0,"43",imagen.inicializarPokemon(43),"Tipo: \nDurante el día, Oddish se entierra en el suelo para \n absorber nutrientes valiéndose de todo el cuerpo. Cuanto \n más fértil sea el suelo, mayor brillo \n tendrá en las hojas.");  
        vectorPoke[42]=poke43;
        poke44 =new Pokemon("Gloom",0,"44",imagen.inicializarPokemon(44),"Tipo: \nGloom libera un fétido olor por el pistilo de la flor. Cuando está\n en peligro, el hedor se intensifica. Si este Pokémon\n está tranquilo y no se siente amenazado, \n no libera el desagradable olor.");
        vectorPoke[43]=poke44;
        poke45 =new Pokemon("Vileplume",0,"45",imagen.inicializarPokemon(45),"Tipo: \nEl polen que contienen las esporas tóxicas de Vileplume\n causa unos ataques de alergia muy agudos. \n Por eso, no es aconsejable acercarse a ninguna flor selvática, \n por muy bonita que sea.");
        vectorPoke[44]=poke45;
        poke46 =new Pokemon("Paras",0,"46",imagen.inicializarPokemon(46),"Tipo: \nParas lleva dos setas parásitas a cuestas llamadas tochukaso. \n Estas crecen alimentándose de los nutrientes de este Pokémon de tipo \n Bicho y Planta que les sirve de huésped. Las setas se usan\n como elixir de vida.");
        vectorPoke[45]=poke46;
        poke47 =new Pokemon("Parasect",0,"47",imagen.inicializarPokemon(47),"Tipo: \nParasect es conocido por destruir en plaga grandes árboles, \n absorbiendo los nutrientes que tienen en la parte baja\n del tronco y las raíces. Cuando un árbol azotado por la plaga muere, \n los Parasect van a por el\n siguiente al instante.");
        vectorPoke[46]=poke47;
        poke48 =new Pokemon("Venonat",0,"48",imagen.inicializarPokemon(48),"Tipo: \nDicen que durante su evolución Venonat desarrolló una fina\n capa de espeso pelo alrededor de todo el cuerpo para\n protegerse. Tiene unos ojos tan grandes que no hay presa\n que le pase desapercibida.");
        vectorPoke[47]=poke48;
        poke49 =new Pokemon("Venomoth",0,"49",imagen.inicializarPokemon(49),"Tipo: \nVenomoth es nocturno, solo actúa en la oscuridad. Su alimento\n preferido son los pequeños insectos que se concentran cerca de los\n focos de luz en la oscuridad de la noche.");
        vectorPoke[48]=poke49;
        poke50 =new Pokemon("Diglett",0,"50",imagen.inicializarPokemon(50),"Tipo: \nEn la mayoría de las granjas se suelen criar Diglett por\n la sencilla razón de que, excaven donde excaven, dejan la\n tierra perfectamente labrada para sembrar. El terreno queda listo\n para plantar ricas verduras.");
        vectorPoke[49]=poke50;
        poke51 =new Pokemon("Dugtrio",0,"51",imagen.inicializarPokemon(51),"Tipo: \nLos Dugtrio son trillizos que se originaron a partir de un solo\n cuerpo, por eso piensan de la misma forma. A la hora de excavar, \n trabajan en equipo y sin descanso.");
        vectorPoke[50]=poke51;
        poke52 =new Pokemon("Meowth",0,"52",imagen.inicializarPokemon(52),"Tipo: \nMeowth retrae las afiladas uñas de sus zarpas para\n caminar a hurtadillas, dando sigilosos pasos para pasar inadvertido. \n No se sabe muy bien por qué, pero este Pokémon adora las monedas\n brillantes que resplandecen con la luz.");
        vectorPoke[51]=poke52;
        poke53 =new Pokemon("Persian",0,"53",imagen.inicializarPokemon(53),"Tipo: \nPersian tiene seis llamativos bigotes que le dan un aspecto\n feroz. Además, le sirven para detectar el movimiento del aire, \n delator de la presencia cercana de algún Pokémon. \n Si se le agarra por los bigotes, se vuelve dócil.");
        vectorPoke[52]=poke53;
        poke54 =new Pokemon("Psyduck",0,"54",imagen.inicializarPokemon(54),"Tipo: \nPsyduck tiene un extraño poder, que consiste en\n generar ondas cerebrales iguales a las que se generan cuando se está\n dormido. Este descubrimiento levantó una\n gran polémica entre eruditos.");
        vectorPoke[53]=poke54;
        poke55 =new Pokemon("Golduck",0,"55",imagen.inicializarPokemon(55),"Tipo: \nGolduck alcanza una velocidad de vértigo gracias a las\n aletas palmípedas de las extremidades y a la forma aerodinámica\n de su cuerpo. Realmente, la velocidad de este Pokémon supera\n la de cualquier nadador.");
        vectorPoke[54]=poke55;
        poke56 =new Pokemon("Mankey",0,"56",imagen.inicializarPokemon(56),"Tipo: \nCuando Mankey empieza a temblar y a respirar\n con más intensidad, seguro que va a enfadarse. Aunque prever\n su enfado no sirve de nada porque alcanza un \n estado de rabia tan rápido que no hay escapatoria.");
        vectorPoke[55]=poke56;
        poke57 =new Pokemon("Primeape",0,"57",imagen.inicializarPokemon(57),"Tipo: \nCuando Primeape se enfada, se le acelera el ritmo cardíaco y se\n le fortalecen los músculos. Con todo, pierde en inteligencia.");
        vectorPoke[56]=poke57;
        poke58 =new Pokemon("Growlithe",0,"58",imagen.inicializarPokemon(58),"Tipo: \nGrowlithe tiene un sentido del olfato excepcional y una\n memoria sensitiva tremenda, nunca olvida una esencia. Este Pokémon\n saca provecho de este don para identificar las sensaciones \n que tienen otros seres vivos.");
        vectorPoke[57]=poke58;
        poke59 =new Pokemon("Arcanine",0,"59",imagen.inicializarPokemon(59),"Tipo: \nArcanine es conocido por lo veloz que es. Dicen que es capaz\n de correr 10 000 km en 24 horas. El fuego que arde con vigor en el\n interior de este Pokémon \n constituye su fuente de energía.");
        vectorPoke[58]=poke59;
        poke60 =new Pokemon("Poliwag",0,"60",imagen.inicializarPokemon(60),"Tipo: \nPoliwag tiene una piel muy fina. Tanto que es posible\n entrever a través de la misma las vísceras en espiral que tiene. \n La piel, aunque fina, tiene la ventaja de ser flexible y hacer rebotar\n hasta los colmillos más afilados.");
        vectorPoke[59]=poke60;
        poke61 =new Pokemon("Poliwhirl",0,"61",imagen.inicializarPokemon(61),"Tipo: \nLa piel de Poliwhirl está siempre húmeda y lubricada con\n un fluido viscoso. Gracias a esta película resbaladiza, puede escapar\n de las garras del enemigo, \n resbalándosele de las zarpas en pleno combate.");
        vectorPoke[60]=poke61;
        poke62 =new Pokemon("Poliwrath",0,"62",imagen.inicializarPokemon(62),"Tipo: \nPoliwrath tiene unos músculos fornidos y muy desarrollados, \n por lo que nunca se agota. Es tan fuerte e incansable\n que cruzar el océano a nado no le\n supone ningún esfuerzo.");
        vectorPoke[61]=poke62;
        poke63 =new Pokemon("Abra",0,"63",imagen.inicializarPokemon(63),"Tipo: \nAbra duerme 18 horas al día, pero puede detectar a\n cualquier enemigo que se le acerque mientras duerme. En una\n situación así, usa Teletransporte para protegerse.");
        vectorPoke[62]=poke63;
        poke64 =new Pokemon("Kadabra",0,"64",imagen.inicializarPokemon(64),"Tipo: \nKadabra emite unas ondas alfa muy particulares que provocan\n dolores de cabeza a los demás. Solo aquellos que\n tengan gran poder mental podrán optar a ser\n Entrenador de este Pokémon.");
        vectorPoke[63]=poke64;
        poke65 =new Pokemon("Alakazam",0,"65",imagen.inicializarPokemon(65),"Tipo: \nEl cerebro de Alakazam nunca deja de crecer y por eso\n al cuello le cuesta sostener el peso de la cabeza. Este\n Pokémon usa sus poderes psicoquinéticos\n para mantener en alto la cabeza.");
        vectorPoke[64]=poke65;
        poke66 =new Pokemon("Machop",0,"66",imagen.inicializarPokemon(66),"Tipo: \nGracias a su portentosa musculatura, Machop no se\n agota por mucho esfuerzo que haga. Este Pokémon es tan fuerte\n que puede derrotar a cien personas\n adultas de una sola vez.");
        vectorPoke[65]=poke66;
        poke67 =new Pokemon("Machoke",0,"67",imagen.inicializarPokemon(67),"Tipo: \nLos entrenados músculos de Machoke son tan fuertes\n como el acero. Este Pokémon es tan fuerte que puede levantar con un\n solo dedo a un luchador de sumo.");
        vectorPoke[66]=poke67;
        poke68 =new Pokemon("Machamp",0,"68",imagen.inicializarPokemon(68),"Tipo: \nMachamp es tan fuerte que puede derribar lo que quiera. \n Sin embargo, cuando tiene que realizar una tarea que\n requiere delicadeza y destreza, se le enredan los brazos. \n Este Pokémon pasa a la acción sin pensar.");
        vectorPoke[67]=poke68;
        poke69 =new Pokemon("Bellsprout",0,"69",imagen.inicializarPokemon(69),"Tipo: \nBellsprout tiene un cuerpo delgado y flexible que le permite\n inclinarse y balancearse para esquivar los ataques. Este Pokémon\n escupe por la boca un fluido corrosivo capaz de hacer que se derrita\n hasta el hierro.");
        vectorPoke[68]=poke69;
        poke70 =new Pokemon("Weepinbell",0,"70",imagen.inicializarPokemon(70),"Tipo: \nWeepinbell tiene un gancho a modo de extremidad superior\n trasera, que usa por la noche para colgarse de una rama y echarse a\n dormir. Si se mueve mientras duerme, puede acabar en el suelo.");
        vectorPoke[69]=poke70;
        poke71 =new Pokemon("Victrebel",0,"71",imagen.inicializarPokemon(71),"Tipo: \nVictreebel tiene una enredadera que le sale de la cabeza y que\n agita a modo de señuelo para atraer a sus presas y así engullirlas por \n sorpresa cuando estas se aproximan incautas.");
        vectorPoke[70]=poke71;
        poke72 =new Pokemon("Tentacool",0,"72",imagen.inicializarPokemon(72),"Tipo: \nTentacool está compuesto en su mayor parte por agua. Si se le\n saca del mar, se secará y se quedará acartonado. Si este Pokémon se \n deshidrata, hay que echarlo inmediatamente de vuelta al mar.");
        vectorPoke[71]=poke72;
        poke73 =new Pokemon("Tentacruel",0,"73",imagen.inicializarPokemon(73),"Tipo: \nTentacruel tiene unas enormes esferas rojas en la cabeza, que\n brillan antes de lanzar una descarga ultrasónica a lo que le rodea. Este\n estallido crea unas olas tremendas a su alrededor.");
        vectorPoke[72]=poke73;
        poke74 =new Pokemon("Geodude",0,"74",imagen.inicializarPokemon(74),"Tipo: \nCuanto más larga es la vida de Geodude, mayor es el desgaste y\n la erosión que sufre, y más redondeada la forma que va adquiriendo. \n Sin embargo, el corazón permanece siempre duro, rocoso y tosco.");
        vectorPoke[73]=poke74;
        poke75 =new Pokemon("Graveler",0,"75",imagen.inicializarPokemon(75),"Tipo: \nGraveler crece alimentándose a base de piedras. Y, según\n parece, las prefiere cubiertas de musgo. Cada día se abre camino\n comiéndose una tonelada de rocas.");
        vectorPoke[74]=poke75;
        poke76 =new Pokemon("Golem",0,"76",imagen.inicializarPokemon(76),"Tipo: \nGolem vive en las montañas. Si se produce un gran terremoto, \n estos Pokémon descienden rodando en masa por las laderas.");
        vectorPoke[75]=poke76;
        poke77 =new Pokemon("Ponyta",0,"77",imagen.inicializarPokemon(77),"Tipo: \nAl nacer, Ponyta es muy débil y apenas puede ponerse en pie. \n Con todo, se va haciendo más fuerte al tropezarse y caerse en su intento\n por seguir a sus progenitores.");
        vectorPoke[76]=poke77;
        poke78 =new Pokemon("Rapidash",0,"78",imagen.inicializarPokemon(78),"Tipo: \nA Rapidash se le suele ver trotando sin rumbo fijo por los campos\n y llanos. Cuando tiene que ir a algún sitio en concreto, se le aviva el fuego\n de las melenas y emprende\n el galope llameante llegando a los 240 km/h.");
        vectorPoke[77]=poke78;
        poke79 =new Pokemon("Slowpoke",0,"79",imagen.inicializarPokemon(79),"Tipo: \nSlowpoke usa la cola para atrapar a sus presas metiéndola bajo\n el agua en las riberas de los ríos. Con todo, es olvidadizo, se le puede \n pasar lo que estaba haciendo y quedarse días enteros \n holgazaneando en la orilla.");
        vectorPoke[78]=poke79;
        poke80 =new Pokemon("Slowbro",0,"80",imagen.inicializarPokemon(80),"Tipo: \nSlowbro lleva en la cola un Shellder enganchado, sujeto por los\n dientes. Como Slowbro no puede usar la cola para pescar, se mete en el\n agua de mala gana en busca de sus presas.");
        vectorPoke[79]=poke80;
        poke81 =new Pokemon("Magnemite",0,"81",imagen.inicializarPokemon(81),"Tipo: \nMagnemite se engancha a las líneas de tensión para nutrirse\n de electricidad. Cuando se producen apagones en las casas, es\n aconsejable revisar el automático y comprobar que no hay\n Pokémon de este tipo colgados de la caja de fusibles.");
        vectorPoke[80]=poke81;
        poke82 =new Pokemon("Magneton",0,"82",imagen.inicializarPokemon(82),"Tipo: \nMagneton emite una fuerte energía magnética que causa\n estragos en los instrumentos mecánicos. Por ello, en las\n ciudades se avisa con sirenas cuando hay \n concentraciones de estos Pokémon.");
        vectorPoke[81]=poke82;
        poke83 =new Pokemon("Farfetch´d",0,"83",imagen.inicializarPokemon(83),"Tipo: \nAl parecer, entre los puerros que suelen llevar los Farfetch'd, \n los hay mejores y peores. A estos Pokémon se les ha visto luchar\n entre ellos por los mejores puerros.");
        vectorPoke[82]=poke83;
        poke84 =new Pokemon("Doduo",0,"84",imagen.inicializarPokemon(84),"Tipo: \nLas dos cabezas de Doduo duermen de forma\n independiente, siempre por turnos. Mientras una duerme, la otra hace\n de centinela por si aparecen enemigos.");
        vectorPoke[83]=poke84;
        poke85 =new Pokemon("Dodrio",0,"85",imagen.inicializarPokemon(85),"Tipo: \nSegún parece, las cabezas no son las únicas partes del\n cuerpo que tiene triplicadas. Dodrio también tiene tres corazones y tres\n pares de pulmones. Con esta constitución, \n puede correr largas distancias sin cansarse.");
        vectorPoke[84]=poke85;
        poke86 =new Pokemon("Seel",0,"86",imagen.inicializarPokemon(86),"Tipo: \nSeel busca a sus presas en aguas heladas, bajo las\n capas de hielo. Cuando necesita respirar, abre un agujerito en el\n hielo con la afilada protuberancia\n que tiene encima de la cabeza.");
        vectorPoke[85]=poke86;
        poke87 =new Pokemon("Dewgong",0,"87",imagen.inicializarPokemon(87),"Tipo: \nA Dewgong le encanta dormitar sobre la frialdad\n del hielo. Antiguamente, algún que otro marino lo confundió \n con una sirena al verlo dormido \n sobre un glaciar.");
        vectorPoke[86]=poke87;
        poke88 =new Pokemon("Grimer",0,"88",imagen.inicializarPokemon(88),"Tipo: \nEl elástico cuerpo de lodo de Grimer le permite colarse\n por cualquier orificio, sea del tamaño que sea. Este Pokémon entra\n en los bajantes de las cloacas para beberse el agua sucia.");
        vectorPoke[87]=poke88;
        poke89 =new Pokemon("Muk",0,"89",imagen.inicializarPokemon(89),"Tipo: \nMuk emana por todo el cuerpo un fluido maloliente que\n obliga a taparse la nariz. Con solo una gota de la sustancia que \n exuda este Pokémon, se podría contaminar un estanque.");
        vectorPoke[88]=poke89;
        poke90 =new Pokemon("Shellder",0,"90",imagen.inicializarPokemon(90),"Tipo: \nPor la noche, este Pokémon usa la ancha lengua que tiene \n para hacer un agujero en el fondo del mar y echarse a \n dormir. Mientras duerme, Shellder cierra la concha, \n pero deja la lengua por fuera.");
        vectorPoke[89]=poke90;
        poke91 =new Pokemon("Cloyster",0,"91",imagen.inicializarPokemon(91),"Tipo: \nCloyster es capaz de nadar por el mar. Su técnica\n consiste en tragar agua y expulsarla por el conducto que tiene en la\n parte trasera. Este mismo sistema es el que usa para lanzar \n los pinchos que tiene alrededor de la concha.");
        vectorPoke[90]=poke91;
        poke92 =new Pokemon("Gastly",0,"92",imagen.inicializarPokemon(92),"Tipo: \nGastly está compuesto en gran medida de materia gaseosa. \n Cuando hay viento, el aire arrastra parte de esta materia y el Pokémon\n mengua. Suelen agruparse bajo los aleros de las casas para \n resguardarse del viento.");
        vectorPoke[91]=poke92;
        poke93 =new Pokemon("Haunter",0,"93",imagen.inicializarPokemon(93),"Tipo: \nHaunter es un Pokémon peligroso. Si se ve alguno flotando \n en la oscuridad y haciendo señas, conviene no acercarse. Este \n Pokémon intentará robarle la energía a \n su presa a base de lametazos.");
        vectorPoke[92]=poke93;
        poke94 =new Pokemon("Gengar",0,"94",imagen.inicializarPokemon(94),"Tipo: \nSi alguien ve que su sombra le adelanta de repente en una noche\n oscura, es muy probable que lo que esté viendo no sea su sombra, sino a\n un Gengar haciéndose pasar por la misma.");
        vectorPoke[93]=poke94;
        poke95 =new Pokemon("Onix",0,"95",imagen.inicializarPokemon(95),"Tipo: \nOnix tiene un imán en el cerebro, que actúa como una brújula\n para no perder la orientación cuando está cavando túneles. A medida\n que crece, se le redondea y suaviza el cuerpo.");
        vectorPoke[94]=poke95;
        poke96 =new Pokemon("Drowzee",0,"96",imagen.inicializarPokemon(96),"Tipo: \nSi a alguien le pica la nariz mientras duerme, seguro que es\n porque tiene a uno de estos Pokémon cerca de la almohada intentando\n sacarle los sueños por la nariz para comérselos.");
        vectorPoke[95]=poke96;
        poke97 =new Pokemon("Hypno",0,"97",imagen.inicializarPokemon(97),"Tipo: \nHypno lleva un péndulo en la mano. El balanceo y el brillo que\n tiene sumen al rival en un estado de hipnosis profundo. Mientras busca\n a su presa, saca brillo al péndulo.");
        vectorPoke[96]=poke97;
        poke98 =new Pokemon("Krabby",0,"98",imagen.inicializarPokemon(98),"Tipo: \nKrabby vive en la playa, enterrado en agujeros en la arena. \n Cuando en las playas de arena fina escasea la comida, es común ver\n a estos Pokémon echando un pulso panza contra panza en\n defensa de su territorio.");
        vectorPoke[97]=poke98;
        poke99 =new Pokemon("Kingler",0,"99",imagen.inicializarPokemon(99),"Tipo: \nKingler tiene una pinza enorme y descomunal que usa agitándola\n en el aire para comunicarse con otros. Lo malo\n es que, al pesarle tanto, se cansa enseguida.");
        vectorPoke[98]=poke99;
        poke100 =new Pokemon("Voltorb",0,"100",imagen.inicializarPokemon(100),"Tipo: \nVoltorb fue visto por primera vez en una empresa encargada de\ncomercializar Poké Balls. La conexión que existe entre aquella\nprimera vez que se le vio y el hecho de que se parece mucho a una Poké\nBall sigue siendo un misterio.");
        vectorPoke[99]=poke100;
        poke101=new Pokemon("Electrode",0,"101",imagen.inicializarPokemon(101),"Tipo: \nLos Electrode se alimentan de la electricidad de la atmósfera. \n En días de tormenta con rayos, es fácil verlos explotando por todos\n lados tras haber consumido demasiada electricidad.");
        vectorPoke[100]=poke101;
        poke102=new Pokemon("Exeggcute",0,"102",imagen.inicializarPokemon(102),"Tipo: \nEste Pokémon está compuesto de seis huevos que forman\n una tupida piña que va girando. Cuando se empiezan a resquebrajar\n las cáscaras, no hay duda de que\n Exeggcute está a punto de evolucionar.");
        vectorPoke[101]=poke102;
        poke103=new Pokemon("Exeggutor",0,"103",imagen.inicializarPokemon(103),"Tipo: \nExeggutor es originario del trópico. Cuando se expone a un sol\n intenso, le empiezan a crecer las cabezas. Hay quien dice que, cuando\n las cabezas caen al suelo, se unen para formar un Exeggcute.");
        vectorPoke[102]=poke103;
        poke104=new Pokemon("Cubone",0,"104",imagen.inicializarPokemon(104),"Tipo: \nA Cubone le ahoga la pena porque no volverá a ver jamás a su\n madre. La luna le recuerda a veces a ella, y se pone a llorar. Los\n churretes que tiene en el cráneo que lleva puesto son debidos a las\n lágrimas que derrama.");
        vectorPoke[103]=poke104;
        poke105=new Pokemon("Marowak",0,"105",imagen.inicializarPokemon(105),"Tipo: \nMarowak es la forma evolucionada de Cubone. Es más fuerte\n porque ha superado la pena por la pérdida de su madre. El ánimo de este\n Pokémon, ya curtido y fortalecido, no es muy\n fácil de alterar.");
        vectorPoke[104]=poke105;
        poke106=new Pokemon("Hitmonlee",0,"106",imagen.inicializarPokemon(106),"Tipo: \nHitmonlee tiene la facilidad de encoger y estirar las patas. Con\n extremidades tan flexibles, propina unas patadas demoledoras. Tras la\n lucha, se masajea las piernas y relaja los músculos para descansar.");
        vectorPoke[105]=poke106;
        poke107=new Pokemon("Hitmonchan",0,"107",imagen.inicializarPokemon(107),"Tipo: \nDicen que Hitmonchan tiene el mismo ímpetu que un boxeador\n entrenándose para un campeonato mundial. Este Pokémon tiene un\n espíritu indomable que nunca se doblega ante la adversidad.");
        vectorPoke[106]=poke107;
        poke108=new Pokemon("Lickitung",0,"108",imagen.inicializarPokemon(108),"Tipo: \nCada vez que Lickitung se encuentra con algo que no conoce, \n le da un lametazo. Es la forma que tiene de memorizar las cosas, por\n la textura y el sabor. No soporta los sabores ácidos.");
        vectorPoke[107]=poke108;
        poke109=new Pokemon("Koffing",0,"109",imagen.inicializarPokemon(109),"Tipo: \nSi Koffing se pone nervioso, aumenta el nivel de toxicidad de\n los gases que tiene y los expulsa por todo el cuerpo. También suele\n hincharse mucho hasta llegar a explotar.");
        vectorPoke[108]=poke109;
        poke110=new Pokemon("Weezing",0,"110",imagen.inicializarPokemon(110),"Tipo: \nA Weezing le encantan los gases que emanan de los\n desperdicios que quedan en la cocina. Este Pokémon busca casas\n sucias y descuidadas para crear su hogar. De noche, cuando los\n habitantes de la casa duermen, va a por la basura.");
        vectorPoke[109]=poke110;
        poke111=new Pokemon("Rhyhorn",0,"111",imagen.inicializarPokemon(111),"Tipo: \nRhyhorn corre en línea recta arrasando todo lo que encuentra\n en su camino. Aun estrellándose de cabeza contra un bloque de acero, \n no se vería afectado; a lo sumo, notaría algo de dolor al día siguiente.");
        vectorPoke[110]=poke111;
        poke112=new Pokemon("Rhydon",0,"112",imagen.inicializarPokemon(112),"Tipo: \nRhydon tiene un cuerno capaz de horadar hasta un diamante\n en bruto y con una sacudida de la cola puede derribar un edificio. La piel\n de este Pokémon es muy fuerte; ni los disparos\n de un cañón le arañarían.");
        vectorPoke[111]=poke112;
        poke113=new Pokemon("Chansey",0,"113",imagen.inicializarPokemon(113),"Tipo: \nChansey pone a diario huevos con un valor nutritivo altísimo. \n Están tan ricos que hasta quien no tenga hambre se los comerá en un\n abrir y cerrar de ojos.");
        vectorPoke[112]=poke113;
        poke114=new Pokemon("Tangela",0,"114",imagen.inicializarPokemon(114),"Tipo: \nA Tangela se le desprenden los tentáculos con facilidad en cuanto\n se los agarras. Y no solo no le duele, sino que le resulta muy útil para escapar\n rápido. Además, al día siguiente le crecen otros.");
        vectorPoke[113]=poke114;
        poke115=new Pokemon("Kangaskhan",0,"115",imagen.inicializarPokemon(115),"Tipo: \nNo es recomendable molestar ni intentar atrapar a crías de\n Kangaskhan mientras estén jugando, ya que seguro que su madre\n anda cerca y reaccionará con enfado y violencia.");
        vectorPoke[114]=poke115;
        poke116=new Pokemon("Horsea",0,"116",imagen.inicializarPokemon(116),"Tipo: \nHorsea come insectos pequeños y el musgo de las rocas. Si las \n corrientes del océano cobran fuerza, este \nPokémon se anclará con la cola a rocas o corales\n para evitar que las aguas lo arrastren.");
        vectorPoke[115]=poke116;
        poke117=new Pokemon("Seadra",0,"117",imagen.inicializarPokemon(117),"Tipo: \nSeadra se echa a dormir tras abrirse un hueco entre las ramas de\n los corales. Los pescadores de coral suelen pincharse con las púas \n venenosas de estos Pokémon si no los ven.");
        vectorPoke[116]=poke117;
        poke118=new Pokemon("Goldeen",0,"118",imagen.inicializarPokemon(118),"Tipo: \nGoldeen es un bello Pokémon que mueve con elegancia las\n aletas en el agua. Con todo, no hay que bajar la guardia, en cualquier\n momento puede embestir con el cuerno.");
        vectorPoke[117]=poke118;
        poke119=new Pokemon("Seaking",0,"119",imagen.inicializarPokemon(119),"Tipo: \nEn otoño, se ven ejemplares de Seaking macho danzando en las\n riberas de los ríos para cortejar a las hembras. En esta \n época, la coloración de este Pokémon alcanza sus niveles máximos de belleza.");
        vectorPoke[118]=poke119;
        poke120=new Pokemon("Staryu",0,"120",imagen.inicializarPokemon(120),"Tipo: \nStaryu posee un órgano central, conocido como su núcleo, \n que brilla con una luz roja. A finales de verano, pueden verse en la playa\n los núcleos de estos \n Pokémon brillando como las estrellas del cielo.");
        vectorPoke[119]=poke120;
        poke121=new Pokemon("Starmie",0,"121",imagen.inicializarPokemon(121),"Tipo: \nLa parte central de Starmie, el núcleo brillante, resplandece \n con siete colores distintos. Debido a su naturaleza luminosa, \n a este Pokémon se le ha dado el apelativo de la Gema del Mar.");
        vectorPoke[120]=poke121;
        poke122=new Pokemon("Mr.Mine",0,"122",imagen.inicializarPokemon(122),"Tipo: \nMr. Mime es un experto en pantomima. Con sus\n gestos y movimientos es capaz de convencer a sus espectadores\n de que algo existe, cuando en realidad no es así. Pero, cuando el\n público se lo cree, las ilusiones se hacen realidad.");
        vectorPoke[121]=poke122;
        poke123=new Pokemon("Scyther",0,"123",imagen.inicializarPokemon(124),"Tipo: \nEs espectacular ver lo rápido que es Scyther. Su increíble \n velocidad refuerza el efecto del par de guadañas que tiene en los brazos, \n que ya son de por sí contundentes; rebanan gruesos troncos de un tajo.");
        vectorPoke[122]=poke123;
        poke124=new Pokemon("Jynx",0,"124",imagen.inicializarPokemon(124),"Tipo: \nJynx camina con ritmo, balanceándose y moviendo\n las caderas como si estuviera bailando. Realiza unos movimientos\n tan vistosos y atractivos que no hay quien\n pueda resistirse a mover las caderas.");
        vectorPoke[123]=poke124;
        poke125=new Pokemon("Electabuzz",0,"125",imagen.inicializarPokemon(125),"Tipo: \nAl desatarse una tormenta, bandadas de estos Pokémon se\n enfrentan entre sí para ver quién alcanza antes sitios altos en los que\n suelan caer rayos. Hay ciudades que usan Electabuzz en lugar de\n pararrayos.");
        vectorPoke[124]=poke125;
        poke126=new Pokemon("Magmar",0,"126",imagen.inicializarPokemon(126),"Tipo: \nAl luchar, Magmar expulsa violentas llamas por todo el cuerpo\n para intimidar a su rival. Estos estallidos de fuego crean ondas de calor\n que abrasan la hierba y los árboles que haya en las proximidades.");
        vectorPoke[125]=poke126;
        poke127=new Pokemon("Pinsir",0,"127",imagen.inicializarPokemon(127),"Tipo: \nPinsir es sorprendentemente fuerte. Puede agarrar con los\n cuernos a un rival que pese el doble que él y levantarlo por los aires. \n En zonas frías, los movimientos de este\n Pokémon se vuelven lentos.");
        vectorPoke[126]=poke127;
        poke128=new Pokemon("Tauros",0,"128",imagen.inicializarPokemon(128),"Tipo: \nEste Pokémon no está contento a menos que esté continuamente \n de aquí para allá. Si no hay rival que luche contra Tauros, se estampa \n contra árboles grandes para calmarse y los embiste para echarlos \n abajo.");
        vectorPoke[127]=poke128;
        poke129=new Pokemon("Magikarp",0,"129",imagen.inicializarPokemon(129),"Tipo: \nMagikarp es el triste ejemplo de un Pokémon capaz\n únicamente de saltar y salpicar. Esta conducta llevó a científicos a\n estudiarlo en profundidad.");
        vectorPoke[128]=poke129;
        poke130=new Pokemon("Gyarados",0,"130",imagen.inicializarPokemon(130),"Tipo: \nCuando Magikarp evoluciona y se convierte en Gyarados, \n sufre un cambio estructural en las células del cerebro. \n Dicen que esa transformación es la causa de la \n naturaleza violenta y salvaje de este Pokémon.");
        vectorPoke[129]=poke130;
        poke131=new Pokemon("Lapras",0,"131",imagen.inicializarPokemon(131),"Tipo: \nPor culpa de la gente, Lapras está casi en extinción. \n Dicen que, al anochecer, se pone a cantar quejicoso mientras\n busca a los miembros de su especie\n que puedan quedar.");
        vectorPoke[130]=poke131;
        poke132=new Pokemon("Ditto",0,"132",imagen.inicializarPokemon(132),"Tipo: \nDitto reorganiza la estructura de sus células para adoptar\n otras formas. Pero, como intente transformarse en algo guiándose\n por los datos que tenga almacenados en la memoria, habrá\n detalles que se le escapen.");
        vectorPoke[131]=poke132;
        poke133=new Pokemon("Eevee",0,"133",imagen.inicializarPokemon(133),"Tipo: \nLa configuración genética de Eevee le permite mutar y adaptarse\n enseguida a cualquier medio en el que viva. La evolución de \n este Pokémon suele ser posible gracias a las radiaciones emitidas por \n varias piedras.");
        vectorPoke[132]=poke133;
        poke134=new Pokemon("Vaporeon",0,"134",imagen.inicializarPokemon(134),"Tipo: \nVaporeon sufrió una mutación repentina y desarrolló aletas y \n branquias que le permiten vivir bajo el agua. Asimismo, este Pokémon \n tiene la habilidad de controlar las aguas.");
        vectorPoke[133]=poke134;
        poke135=new Pokemon("Jolteon",0,"135",imagen.inicializarPokemon(135),"Tipo: \nLas células de Jolteon generan un nivel bajo de electricidad, cuya \n intensidad aumenta con la electricidad estática que acumula en un pelaje\n formado por agujas cargadas de electricidad. Esta característica \n le permite lanzar rayos.");
        vectorPoke[134]=poke135;
        poke136=new Pokemon("Flareon",0,"136",imagen.inicializarPokemon(136),"Tipo: \nLa suavidad del pelaje de Flareon tiene una función clara: libera\n calor para que el Pokémon no se asfixie. La temperatura corporal de este\n Pokémon puede alcanzar los 900 °C.");
        vectorPoke[135]=poke136;
        poke137=new Pokemon("Porygon",0,"137",imagen.inicializarPokemon(137),"Tipo: \nPorygon es capaz de convertirse otra vez en datos informáticos y\n de entrar en el ciberespacio. Tiene protección anticopia, así que es \n imposible duplicarlo.");
        vectorPoke[136]=poke137;
        poke138=new Pokemon("Omanyte",0,"138",imagen.inicializarPokemon(138),"Tipo: \nOmanyte es uno de esos Pokémon ancestrales que se \n extinguieron hace muchísimo tiempo y que la gente ha recuperado\n a partir de fósiles. Si un enemigo le ataca, se esconderá\n dentro de la dura concha que tiene.");
        vectorPoke[137]=poke138;
        poke139=new Pokemon("Omastar",0,"139",imagen.inicializarPokemon(139),"Tipo: \nOmastar usa los tentáculos para atrapar a su presa. Se cree\n que el motivo de su extinción fue el tamaño y el peso que llegó a\n alcanzar la concha que lleva a cuestas, lo que le entorpeció\n y ralentizó los movimientos.");
        vectorPoke[138]=poke139;
        poke140=new Pokemon("Kabuto",0,"140",imagen.inicializarPokemon(140),"Tipo: \nKabuto es un Pokémon regenerado a partir de un fósil, aunque, \n en raras ocasiones, se han encontrado casos de ejemplares vivos en es\n tado salvaje. En 300 millones de años, este Pokémon no ha \n cambiado en nada.");
        vectorPoke[139]=poke140;
        poke141=new Pokemon("Kabutops",0,"141",imagen.inicializarPokemon(141),"Tipo: \nHace mucho tiempo, Kabutops buceaba para atrapar a sus\n presas. Parece ser que en algún momento cambió de hábitat y se\n adaptó a vivir en tierra firme. La transformación que se aprecia en \n las patas y branquias así lo confirma.");
        vectorPoke[140]=poke141;
        poke142=new Pokemon("Aerodactyl",0,"142",imagen.inicializarPokemon(142),"Tipo: \nLos orígenes de Aerodactyl datan de la era de los dinosaurios. \n Se regeneró a partir de material genético contenido en ámbar. \n Se supone que fue el amo de los\n cielos en épocas pasadas.");
        vectorPoke[141]=poke142;
        poke143=new Pokemon("Snorlax",0,"143",imagen.inicializarPokemon(143),"Tipo: \nUn día cualquiera en la vida de Snorlax consiste en comer y\n dormir. Es un Pokémon tan dócil que es fácil ver niños usando la gran\n panza que tiene como lugar de juegos.");
        vectorPoke[142]=poke143;
        poke144=new Pokemon("Articuno",0,"144",imagen.inicializarPokemon(144),"Tipo: \nArticuno es un Pokémon pájaro legendario que puede controlar el\n hielo. El batir de sus alas congela el aire. Dicen \n que consigue hacer que nieve cuando vuela.");
        vectorPoke[143]=poke144;
        poke145=new Pokemon("Zapdos",0,"145",imagen.inicializarPokemon(145),"Tipo: \nZapdos es un Pokémon pájaro legendario que tiene la\n habilidad de controlar la electricidad. Suele vivir en nubarrones. \n Este Pokémon gana mucha fuerza\n si le alcanzan los rayos.");
        vectorPoke[144]=poke145;
        poke146=new Pokemon("Moltres",0,"146",imagen.inicializarPokemon(146),"Tipo: \nMoltres es un Pokémon pájaro legendario que tiene la\n habilidad de controlar el fuego. Dicen que, si resulta herido, \n se sumerge en el líquido magma de un\n volcán para arder y curarse.");
        vectorPoke[145]=poke146;
        poke147=new Pokemon("Dratini",0,"147",imagen.inicializarPokemon(147),"Tipo: \nDratini muda y se despoja de la vieja piel continuamente. \n Es algo que necesita hacer porque la energía que\n tiene en su interior no para de \n alcanzar niveles incontrolables.");
        vectorPoke[146]=poke147;
        poke148=new Pokemon("Dragonair",0,"148",imagen.inicializarPokemon(148),"Tipo: \nDragonair acumula grandes cantidades de energía dentro\n de sí. Dicen que altera el clima de la zona en la que está descargando\n energía a través de las esferas de cristal que tiene \n en el cuello y en la cola.");
        vectorPoke[147]=poke148;
        poke149=new Pokemon("Dragonite",0,"149",imagen.inicializarPokemon(149),"Tipo: \nDragonite es capaz de dar la vuelta al mundo en solo 16 horas. \n Es un Pokémon de buen corazón que guía hasta tierra a los barcos\n que se encuentran perdidos en plena\n tormenta y a punto de zozobrar.");
        vectorPoke[148]=poke149;
        poke150=new Pokemon("Mewtwo",0,"150",imagen.inicializarPokemon(150),"Tipo: \nMewtwo fue creado por manipulación genética. Pero, a pesar\n de que el hombre creó su cuerpo, dotar a Mewtwo de un corazón\n compasivo quedó en el olvido.");
        vectorPoke[149]=poke150;
        poke151=new Pokemon("Mew",0,"151",imagen.inicializarPokemon(151),"Tipo: \nDicen que Mew posee el mapa genético de todos los Pokémon. \n Puede hacerse invisible cuando quiere, así que pasa desapercibido \n cada vez que se le acerca alguien.");
        vectorPoke[150]=poke151;
        
    }
    
    public int getTamano(){
        return vectorPoke.length;
    }
    
    
}//Fin de la class
