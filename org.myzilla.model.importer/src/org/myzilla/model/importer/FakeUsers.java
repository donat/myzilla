/*
 * Copyright (c) 2004 - 2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.myzilla.model.importer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.myzilla.MyzillaFactory;
import org.myzilla.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author Eike Stepper
 */
public class FakeUsers
{
  private static final Random RANDOM = new Random();

  private static final Map<String, User> users = new HashMap<String, User>();

  private static int next;

  public static User getUser(EList<EObject> model, String name)
  {
    User user = users.get(name);
    if (user == null)
    {
      if (++next < NAMES.length)
      {
        String fakeName = NAMES[FakeUsers.next];

        user = MyzillaFactory.eINSTANCE.createUser();
        user.setName(fakeName);
        model.add(user);
        users.put(fakeName, user);
      }
      else
      {
        int i = RANDOM.nextInt(NAMES.length);
        user = users.get(NAMES[i]);
      }

      users.put(name, user);
    }

    return user;
  }

  private static final String[] NAMES = { "Bab Necpuv", "Babfoj Sisxur", "Babtip Ret", "Bac Qobmac", "Bag Mec", "Bagcon Kajlan", "Bagper Diw", "Bagpukgev Mimcit", "Bahlip Hingiy", "Bajcir Cetnis", "Bajqat Baksin", "Balkuc Racsic", "Bapcin Xikceg", "Bapfor Wudjom", "Barsen Sokxowwin", "Barwox Kiv", "Bav Wucluk", "Belcus Solsebyoj", "Belwan Loqcahper", "Bemdeh Letqub", "Bemlor Heftam", "Bemvod Nidrapvun", "Benseb Rekrod", "Beqvir Ledrik", "Ber Nuhxat", "Berkog Mejdib", "Beshan Jid", "Bet Tilvif",
      "Bevten Zilsog", "Bew Macbyd", "Bewbed Het", "Bewjef Gosrilluk", "Biccok Delmatran", "Bicdik Cedmol", "Bicsat Najmar", "Bid Cywjabgiq", "Bivboy Fettag", "Biw Vaddar", "Biwmis Vullok", "Bocjiq Mujcaj", "Bodbob Rolpim", "Bodnij Jimjek", "Buqret Rafcen", "Burvez Xis", "Bussonliwned Tenrav", "Butjumcew Serwid", "Butlylfab Kaswef", "Buwlev Bevjol", "Cabket Vekdenbol", "Cacdehmuh Jesfez", "Cadsef Rop", "Caftydhud Topmur", "Cafzic Gipnon", "Cag Hodtit", "Cawwiv Lor", "Cayfeg Jirhem",
      "Cazbet Kil", "Cec Gol", "Cec Jec", "Cecdim Suwlen", "Ceckif Bikjaj", "Cedlaphok Fec", "Cednag Fikhej", "Cedpat Zesdin", "Cefbik Vuvvav", "Cefjok Buhvuc", "Cegzok Relwat", "Cekluk Fullysjuw", "Cekral Yyfgom", "Celwoksek Vel", "Cemjit Bibkaj", "Cemlaw Gekbow", "Cempod Pontensig", "Cewloc Sacway", "Cezcuv Dofzod", "Cid Cecmit", "Cidcir Nicmig", "Cifcoj Gakpyc", "Cifnek Cilpas", "Cihwuc Pif", "Cihxeb Rudhit", "Cijgagram Huhrad", "Cijraq Gubhijnaj", "Cijres Supnit", "Cilneqdaq Ropnoj",
      "Cinpet Bovbeh", "Cinrujkiq Yohrov", "Cipdun Fukyuv", "Cipponnaj Vasdiw", "Ciptev Wecvis", "Cirtun Selban", "Cuh Lipnen", "Cuhlot Bodyis", "Cuhmej Tapbip", "Cujdac Nehgepbaj", "Cujguy Dolsen", "Culdis Jehrew", "Dah Geghec", "Dahlonfas Gatnofwax", "Dakliw Vykxuc", "Dal Cul", "Dalgah Qehwen", "Dalgec Bep", "Dallut Beqtoccod", "Doknod Sam", "Dol Cohbajsyw", "Dongivjim Laf", "Donhyh Pid", "Donjoh Menbek", "Dop Gaxger", "Dujsim Guwkiqyog", "Duk Rykkey", "Dum Mofqytcer", "Dummaqmad Surlem",
      "Dunxewreh Summav", "Dusjiq Hemgod", "Duslob Memvab", "Ed Merks", "Eike Stepper", "Fakgoj Fepseb", "Falxon Laqtoj", "Fam Yepjob", "Famwos Hecfak", "Fancoj Tos", "Fanrod Fuq", "Fanruj Negraz", "Fantoj Tubdap", "Fap Typgaq", "Faq Lol", "Fassuf Pykgehbev", "Fatdit Pod", "Fatpon Pin", "Favlij Jig", "Fedhig Fojkajjiphad", "Fedlam Ril", "Fednel Qektaf", "Fedtik Fobnig", "Fegfyb Nerbep", "Fegryt Jendyp", "Fehgyf Hinkig", "Fehnog Buchag", "Fehyubjig Lemseg", "Fejdyc Cumkel", "Fek Saf",
      "Fekdaf Mactam", "Fel Reg", "Gajvem Kasned", "Gak Lijtit", "Gakdas Nez", "Galjel Nendeb", "Galkirtor Vij", "Gap Todpen", "Gapfeg Kibsaymal", "Gapyel Giqsusqep", "Gasqed Zakboy", "Gavmen Kabmah", "Gaynyd Kirkoj", "Gecbun Qer", "Gectivqir Xin", "Gutlacnip Binfahbaq", "Guz Darzaj", "Guz Mabtax", "Gycqar Sow", "Gyhfuxjabdac Daffoh", "Gyjkif Tel", "Gylbub Manlor", "Gypjog Vac", "Gypwydwal Putmel", "Gyrtig Zelrab", "Hab Gegyud", "Habvar Dusnuk", "Haf Lilhes", "Hughup Niskuv",
      "Huhfyclub Bijhap", "Hukgor Nedmiljilder", "Hulpiw Coh", "Hum Cuflar", "Humloz Mabhut", "Hunjad Palsal", "Hunkepkej Vewkin", "Hunriz Sojmah", "Hup Nynheh", "Hup Sekxuh", "Huqkar Henjej", "Huqrym Fed", "Jiqjim Tunfap", "Jirmel Kuv", "Jirnas Kiczan", "Jirpegfom Wen", "Jis Legfum", "Jisgor Xurhog", "Jitnak Humlut", "Jivhon Kujvaq", "Jiztad Nognosgan", "Jobcap Berduv", "Jocmetbuf Nilduv", "Jocvem Valyeh", "Jodlic Gobwon", "Jodnic Tekbum", "Jodtol Sukxil", "Jofrif Vesvew", "Jogkef Cijsed",
      "Johmad Fev", "Jojdip Kedtas", "Jojrip Capner", "Jollud Dersijqipred", "Jolnyzdoq Boqbog", "Jolsig Dan", "Jom Gohkechen", "Jomnew Duwban", "Kil Wobsyv", "Kilsec Tebnedxud", "Kilten Savnov", "Kiltil Lincys", "Kimvupbeg Yejraghetmoq", "Kinmaj Faknurdel", "Kinpon Vaz", "Kinxarnub Rih", "Kiq Gilbak", "Kirwaw Cegpoc", "Kisdik Rimrep", "Kishow Ped", "Kisrilhaq Ceqqoh", "Kisvapcor Ravzyl", "Kit Geskim", "Kobcad Dek", "Kobgoj Lab", "Kobjos Kim", "Kocmin Pusgix", "Kocnec Collas", "Kummud Damxet",
      "Kumruj Fuplag", "Kun Nac", "Kunbam Puv", "Kup Qenluk", "Kuskejjoytun Ted", "Kutril Jej", "Kuvwej Binjoj", "Kuyzor Tek", "Kuzcev Wiscem", "Kuzmim Hebceh", "Kycwyp Wukgad", "Kydxuh Gijfik", "Kyllol Zigkes", "Kyp Gumcudfev", "Kyrmic Bikduqdoh", "Lab Jev", "Lacwok Lehjuf", "Lacyos Repret", "Lad Cukciy", "Ladfab Cehnel", "Ladmil Nadfid", "Ladnun Bonted", "Ladqegwij Nipjuj", "Lafheq Tickomlek", "Lafxirdimmeh Doskeb", "Locvep Linjyb", "Lof Peh", "Lofdex Hettab", "Lofgeg Bav", "Loflar Litgon",
      "Loflef Liytep", "Lofyis Gihpoqtaq", "Logjivvaz Tusmek", "Loj Cuvhop", "Lojfih Din", "Lokgoh Fajcic", "Loknet Wobkalnix", "Lol Git", "Lol Jiv", "Lovmum Pelpag", "Lowridlap Mufxew", "Loy Kytnyh", "Lucluc Wyznaf", "Ludkas Tensoj", "Luf Yucfar", "Lugdet Ribnom", "Lugpin Cijritlof", "Luhlel Pacjah", "Lujyuk Jovsisdyp", "Luk Valbev", "Luldel Mejvaj", "Lulqorlos Laxlit", "Lumsom Row", "Lumtikrep Kuhlos", "Lunqab Zildabror", "Lunqek Puvgiv", "Lupyep Rabmef", "Met Cengeq", "Metcop Huffim",
      "Metrel Bocsik", "Metwan Vomzek", "Mevhef Hectaq", "Mexfig Fywmensef", "Meyhos Vovkihtej", "Mic Mafhuf", "Micrec Kafjej", "Micvyk Nertet", "Mif Hym", "Mifpun Denhec", "Mifven Rufjik", "Mifwap Losnef", "Mifwul Jevmiw", "Mih Numviswuh", "Mih Vewqep", "Mihjiy Fal", "Mihnom Pot", "Mikfez Nek", "Mikwem Sapsyq", "Minfid Wockis", "Minwaftuk Sonmax", "Minwutzor Fangux", "Mip Sismul", "Mip Wehsol", "Nerfuq Fosyid", "Nes Ladwiq", "Nes Vuvjal", "Nesjon Tunqic", "Nesnaqdin Bek", "Nesnudtej Bij",
      "Netcel Lupnem", "Netlah Ratdiv", "Nevsol Nep", "New Gegqev", "New Joglyhcez", "Newmuv Tahsuj", "Nez Comkeh", "Nez Tebwep", "Nezroc Giq", "Nibpik Tin", "Nibtyn Tok", "Niclisjep Sihlub", "Niczostov Dolxot", "Nidbas Rijwir", "Nifhes Jekdek", "Niflew Gapjak", "Nifqax Wis", "Nigrag Kolben", "Nihdir Haxtahwor", "Nihnit Jijgyp", "Nuwdiq Robful", "Nyqpuknal Tom", "Nyvqud Hotjub", "Pabbom Cas", "Pabhaj Damjep", "Pacmej Tipvig", "Pehgordaqsep Concar", "Pejril Sejtil", "Pelbif Tesgem",
      "Pelfet Wehsyn", "Pen Lejbaw", "Pen Nojjop", "Pikpej Rok", "Pikrahgor Zun", "Pildan Zonkom", "Pilhot Nytkak", "Pilnov Waplohsed", "Pimpastes Fezlyd", "Ramceb Pamrez", "Ramxup Disrap", "Rannac Sehdup", "Raqbat Hiplazsod", "Rargaq Lejvic", "Ras Vadpuz", "Rashon Taw", "Rasjojpux Jalhal", "Ratveg Sukfeh", "Ratzap Serbif", "Rav Numcud", "Rav Pavnuj", "Ravqip Fed", "Rawqeb Caj", "Rawqir Nobyir", "Reb Docnof", "Reccem Jodryw", "Recfep Gonhez", "Reclaj Rinnob", "Recsoq Dyl", "Ron Nyd",
      "Rongas Holgobvop", "Ronmam Fancuw", "Ronnul Kidroj", "Rophil Zellar", "Ropnyqnel Pef", "Roqfiv Venlib", "Roqwykcek Cowcut", "Ror Paqtyk", "Rorlob Tazmaj", "Roslac Fudkid", "Rot Nopxeh", "Rovkaj Bagtig", "Row Zinmat", "Rowpex Honfujdemjyr", "Roz Cuh", "Rozmof Hurfod", "Rublutmum Bus", "Ruc Jas", "Rudsuj Bamboj", "Ruf Guzboq", "Ruglig Mocfeg", "Rugraz Futnel", "Ruhgiv Nel", "Ruhhawdap Gos", "Ruhnir Bihgeh", "Sefded Rifkescah", "Sefmuc Yiyrog", "Sefnas Mehcim", "Sefnop Rifmelcih",
      "Sefrum Kik", "Seg Guhvol", "Sehqeh Fasrow", "Sek Wodjew", "Sekdolreb Lavwoy", "Sekxef Fat", "Sel Leljosrot", "Sel Xemcuf", "Selfyw Hunmej", "Seltav Duv", "Sem Geyhyd", "Sem Jivcihtofjeh", "Semhew Qac", "Sempik Fegjuscax", "Semriz Dirfer", "Senneg Fowrin", "Sensah Qapnyp", "Senwyd Dosgyjsev", "Seqnim Juvveg", "Sercif Xencem", "Serdahjal Zevjof", "Teymus Fenmer", "Tezric Les", "Tib Lyvzob", "Tibgutwij Muhguh", "Ticgib Lon", "Tickaw Ten", "Tidcyl Vus", "Tufpif Goplab", "Tugwal Qewsym",
      "Tuhfidtot Hidweg", "Tuhjun Morgeg", "Tul Dufwur", "Tulkeb Pakmum", "Tumjok Sipniy", "Tumlun Furfin", "Tumser Tajnem", "Tungok Focyal", "Tunhil Lelsat", "Tunmac Vucton", "Tunyop Hebjyr", "Tupvos Pikrevkig", "Tupyep Nilsif", "Turlomqac Kojpulhol", "Tus Tecgey", "Tutdar Nusmog", "Welhog Golvec", "Welvub Godhiy", "Welwut Yundir", "Wemwir Pyvgih", "Wenfek Dykdez", "Wennaq Cufbox", "Wepciwkam Viwcin", "Wepmenloq Xeb", "Weqpac Buwdon", "Werlut Sacnem", "Wes Rew", "Wewniw Bettac",
      "Wicfem Ryhhoj", "Wicgoc Piwtex", "Wickit Fepkuw", "Wictiv Lir", "Wifjor Femfey", "Wigbel Fyvcuc", "Wihgom Lylcen", "Wihjot Qekvaf", "Wijhirtap Bajsos", "Wijqoc Locfop", "Wikzov Powgak", "Wim Sesgem", "Wimbig Cuq", "Wimfij Xoj", "Winkiv Lyqkak", "Wintuw Quclef", "Wip Qitsobdir", "Wipcaclul Pugjix", "Wir Kok", "Zogjeppem Serqal", "Zoqgut Huhzibvaw", "Zot Qognoz", "Zotjid Ginfes", "Zotkut Doscev", "Zotteh Tusrat", "Zuf Ducpon", "Zufmic Ked", "Zuhsakbotjog Cuh", "Zulcom Fiprug",
      "Zummeb Wyf", "Zupzim Rarfok", "Zus Vepmed", "Zutcam Wuddal", "Zutlokbec Kep", "Zuwlavjog Vukbiqtihcef", "Zyldap Napnofhok", };
}
