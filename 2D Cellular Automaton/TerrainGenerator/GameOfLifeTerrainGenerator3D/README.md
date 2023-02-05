# Game of Life Terrain Generator

`The Game of Life as a 3D terrain`

This program utilizes Conway's Game of Life to create a small chunk of 3D terrain. This could also be done with larger 
chunks as well. 

    TOP:
    hh8888BBooBB##BBZZWWLL8888BBLLLL??LL00//  ""IIBBBBWWWWBBvvvvoohh
    BB88hhBBZZBB00BBhhBB##88BBLLLLLLLLLL00JJ  ""__~~BBBB88||vv))bb##
    ##88JJBBWWBBBBhhBBBBBBBBLLLLLLLLLLzzYYYYzz""__~~IIBBzzffvvvv  WW
    BBBBBB88BBhhhhbbBBBBBB  ||zzzzJJYYffYY//vvnn::bb    JJrrvvvvzz""
    """">>>>LLoo{{__~~  //||||::LLnnzzYYYY[[vvoooobbppJJYYYYJJZZ00LL
    ""  ~~>>{{))[[{{!!rrnnrr[[JJYYJJrrYYbbhhhhbbhhhhooBB00YY0000JJLL
      II::  WWWW~~[[::rrnnffffYYYYYYrrhhZZBBbb00hhhhBBBBBB000000ZZ~~
    __  WW########[[[[[[??ffff||YY##BBBB88BBWWhhhhBBBB##BBBBYYZZYY[[
    ~~>>############WW[[??~~rrJJ88BBBB88##BBhhhhYYbbBBBBBBZZrrJJ""??
    IIooWWBBppWWWWBB##88WWppbbBBBBWW##BBBBWW00oo##bbbbBBbbhhppIIIIII
    //hhBBBBBBhhhhBBBBwwBB88bbwwBBBBppYYZZ00ooooooBBBBbbbbbbZZww||||
    ooBBhh88##oopphhWWWWBBBBBBwwwwwwzz[[||))))ooBBBBBBbbbbhhLLww00||
    nnBBBBooWW88ppWWWWWWWW88wwwwwwpprrnn>>__))BBWWBBWWBBJJ00LLLLLL{{
    BB##[[WWbbWWWWhhWW//rrrrppZZ88zzzz00____??BBWWBBWWBBYYYYvvLLZZww
    BB__BB88BBBBBB88rrrrrrzzvvBBBBBBLLppwwpp[[??BBBBBBhhYYYYff00BB88
    BBooBB88ZZBBBB~~>>>>rrrrzz##88##hhhhwwhhbbbbbbBBbbbbYYYYvvBBoopp
    ##WW::  ""__~~II~~>>~~nnWW####WWhhhhhhoobbbbZZzzbbhhppYYYYBBBBbb
      ::::::::>>>>II  II!!oohhWWhhooppJJBBBBbbbbhhwwwwwwYYBBBBBBbbnn
    [[::  ::  !!!!""IIIIII""hhhhhhoowwWWBBBBbbnnppwwwwwwBB88BBbbbb??
    ::::::>>~~!!  !!IIIIII!!ooBBhh####ZZ##BB88nnnnvvwwBBBBWWBBBBbbbb
    hh    >>~~>>""""""IIII  BB88BB######hhWW{{))nnwwZZBBooJJBBoobbbb
    """"::  ""{{vvYY[[??  ||BB88BBbb######~~~~JJ00ZZBBBBWWBBBBbbbbbb
    """"  """"LL00LLzz||????))))WW######hhBBBBLLYYnnwwBB88BBZZbbbb""
    ""  ""[[bbppJJJJBBBB))??))))??####hhhhBB88zzBBLLZZ00BB00wwZZoohh
      """"BBBBBB||BBBB88##))ppbbppzz####ZZ##BBBBBBBB||LL00YYzzhhoo00
      ""BBWWWWBBBB##BB8888BBhhbbww00WWBBBB####BB88hhBB00nnzzzzzzYY""
    ))[[BBWWWWBBBB####BBBBWWBB##LLffvvBBBBvv##ooooBB##wwwwzzzzzz""||
    {{~~??BBBBhhhh####pp##WWBBBB##JJrrBBBBWW##oooooobbZZZZJJJJYY////
    ))""__##BBhhhhooppBBBBWWBBoowwYYJJrrnn>>!!oooo00bbbbBBBBBB!!??||
    [[BBBBJJBBBB??ppBB888888oooo##YY{{!![[)){{##oo88WWZZBBBBBBIIII??
    hh8888WWBBBBBB00888888##BBoo##{{{{{{{{||{{))BBBBBB88hh##WWBB~~oo
    BB8888oohhBBhhBBooBBhh88BBYYYYJJ{{{{ff))//""BBBBBBhhhh88BBzzbbhh

    FRONT:
    BBWWWWoo88BB88BBWWBB##bbBBoo00rr[[oooowwppbbBBBBBBZZWWWWBB88vv  
    nnBBBBoo88BBbbBB88BB88BBBB0000))[[hhoowwwwpp88BBbb88WWBBBB88vvrr
    rrvvBB8888BBrrBB88BBWWBBoo00ZZvvbbhhhhoowwffbbBB8888WWBBBBvvvvrr
    vvvv888888BBhhBBooBBooBBvvhh88wwbbbbhhbbooWW88pp8888WWBB88vvvvrr
    vvvv88BB##BBhhBBBBBBhhBBBB88WWLLppbbhhbb))##WW88BB00WWBBLLLLpp88
    888888hhBB##BBooBBBBBBBBBB88WWLLvvbbhhbb[[ooWW88BBBBBB8800ppppBB
    888888BBhh88##BBBBbb88888888LL00vvbbhhbbYYoo##88BBBBBB))  ppBB88
    888888BBooBBBBBBBBBBWWWWWWWWWWLL00bbhhbbnnoo##WW88BB88)){{ppBBBB
    8888BBBBhhBBBBWWBBBB####WWWW##LL00bbhhbb  vv##oo888888WWwwppppBB
    8888BBbboooo88hhBB##WWhhWWWWbbLLLLbbbbbbYYvvooWWWWWWWWWWwwwwwwBB
    BBBB//bbooBBhh88bbWW####88hhbbbbLLppbbbbYYvvooWW88oo88##wwLLZZpp
    BB88WWffBBoo8888BB88BBBBBBzzhhJJJJLLbbbbzzhhoo##WW8888//##wwpppp
    ""BBBB888888BBbb88BB##8888##ppBB##JJppbbppbboo####WW88oo88JJpppp
      BBBB88888888BB))88BB88ooBBBBWWJJJJppppppbbpp####BBWWWWBBoobbrr
      ""BB88BB88BBBBZZ||BBrr##BBWW##JJwwoopphhppwwoo##BBBB88BBBB00nn
      //BB88BBhhBBbbww||BB8888BB####hhhhoohhhhpphhooooBBBB##BBBBnnnn
    //||//BBBBhhBBbbwwBBBB##WWBB##oobbbb##hhhhbbhhhhhhWWBB##88ZZzzzz
    nnff//BBBBBBBBppBBrrBBBBBBBBoooo####oohhbbbbLLoobb##BB88BBZZzzzz
    rrff::BB88BBhhBBff88rr88BBBBWWooooooBBhhbbYYoooohh####BBBBZZYYzz
    rrff::BBBBBBhhBBBB88ffffBBWWWWoobbooBBbbBBhhhhoohh##BBBBBBYYoooo
    rrff""::BBbbbb88BBZZ__88BBWW##oohhoo||88BBwwhhhhhh####BBwwYYoo##
    ##ffBB  BB88bbrrBBWW88BB##WW##oohhoohhBBBB88bb##pp##BBwwBBwwoo##
    ooff::BBBBppBBrrBBWW88BBBBBB88BBBBBBBBBB8888##bb##oooo88wwww00##
    WWhhffBBwwBB8888BB##ooBB88pp88BBoohhBB{{88WWbbbbwwBB88BBwwZZoohh
    WWffBBWW88BBWWooBBWWWWBBppwwwwBBBBBB88WW88##bbppww##BBBBww88##WW
    YYrrBBBB8888##BBoo88BBww##ww0088BBBB88WWWWWWpppp??BBBBBBBBBB0088
    oooo##BB888888888888BB####wwZZ8888##88WWWW##88wwBB##BBffBBBB8888
    WWooooBB8888BBBB8888BB##oohhppwwBBbbBBWWooWW88BB||BB##00BBBB88WW
    ##ffhhooBBBBooZZ8888##oohhhhppww888888LL##8888BB||BB##0000BB88WW
    ooffffooooBB88ooBBBB##oohhbbZZwwWW88WWoo##WW88WWBBBBBB8888BB88##
    JJJJ00hhooooBBBBBBoobb##hhZZppoooo88WWBB##88##BBBBBBBB8888WWBB##
    BBBBBBBBBBBB88hhBB88888888BBBB8888BBBBBBBBBBBBBBBBBBooBBBBBB88BB

    SIDE:
    $$##BB##WW8888WWppffLLLLJJrrrr!!$$$$$$BBBB88WWzzvvff??  $$WW$$WW
    BBBB88ZZWW8888WWppffJJLL//rrrr!!$$$$$$BBWW88bbYYnnff??  $$BB$$BB
    888888ZZ008888bbwwYYJJJJJJnnJJBB88$$$$BBWWWW88pp88##    $$BBBB88
    oo8888WWbb8888ppwwzzYYJJJJrr  $$88$$$$88##pp8888WW??    $$$$BBWW
    WW8888####WW88ppvvvvvvJJLLzz00$$$$$$WWBB$$##BB88##ff[[oo##$$BBBB
    ##$$BBoo##WW88WWnnnnnn$$JJLLLL$$$$WWWWBBBBBB88WW##nnff))##$$BB$$
    WW$$BBhhooWWWWWW##nnzzYYYYJJLL$$$$$$WW88BB88WWWWvv//rr{{oo$$BBBB
    WW$$bbhh####WWWW##!!vvzzYYJJJJJJ$$$$WW888888WW##ffnnrr))oooo$$BB
    88$$bbwwoo####WW##[[vvzzYYJJJJYY$$$$WWWWWW88WW##nnnnrr))  ##$$BB
    88$$ppww##hhWWWW##>>{{zzYYJJJJrr##$$WW0088WWWWYYnnrrff))  ##BB88
    $$BBbbZZ####WW##oohh))vvzzYYJJffffWWLL8888WW##YYnnff//))oooo$$$$
    $$BB88##oo######oooo))nnzzYYJJYY//##WW8888WWwwoohhff||##WWBB$$$$
    BB88WWZZoo####oooohh||[[vvYYYYYYvv##WW8888WWoooovv//JJ??WW88BB$$
    BBWW##YYoo####oohhhhbb[[vvzzYYnnYYYYWW8888ppoohhYYJJJJnnWW88BBBB
    88WWZZZZLL####bbhhhhbb~~vvzzzzzzLL00##8888hhooYYrrYYJJvv##WW88BB
    88WWZZZZLLoo##bbbbbbhh~~//zzzz//LLLLLLBBBB##ooYYzz))JJYY##WW8888
    WWWWww00JJoooooobboohh))||vvzz00LLJJJJ$$BB##hhzzffZZZZYYzzWW8888
    WW##ppLLJJoooobboooohh))))||zzvv$$ppBB88$$oohhLLvvwwwwzzrrWW8888
    WW##bbLLJJoooo//oooo{{??))vvvvzz))$$BB$$$$oohhJJ00wwwwvvvvWW8888
    WWbbbbJJYYhhoo))oohh{{LLJJ>>zz||zz$$BBBB$$$$hhJJLLwwwwZZzzYY8888
    ##bbppJJppppoohhoobb00LLJJYYvvvvzz$$BBBB$$oohhJJJJwwwwZZLLJJWWBB
    88oopp$$ww$$oohhhhhhLLLLYYYYvvvvzz$$BBBB$$oonnJJJJwwooooLLJJ8888
    WWhhwwww$$$$hhoo##ppooLLYYzzvv||##bb$$$$oohhZZooooww####ffJJ8888
    WWhh$$hh$$BBhhbbWWooooYY))$$YYvvooWWBBBBhhhhbbhhoooo##oorrLLJJBB
    88##$$$$$$88WWWW##oohhYY//$$YYYY$$$$$$WWhhbb00hhhhooooooJJLLBB##
    88####8888WWWW####oopp||ff$$YYoo##BB8888bb##00hh$$00ooooJJJJBB88
    WW##hh88$$$$88####bbzz####zzYYoooo$$8888####oo$$hhhh88pppp888888
    WW##$$##$$8888####bb00WWWWzzoowwoo88$$$$oo##ooBBbbbb8888WWWWWWWW
    ####ww$$$$88WW##oobbLLWWWWoooowwww88$$ZZoooo88$$$$bb88WW########
    oooooohh$$WWWW##ppppbbWWWWoooo$$bb##BB$$$$$$$$$$bbBB88WW##oooooo
    hhhhhhhh##WWoo##bbhh88rr$$$$BB$$WWppBB$$BB$$$$JJ$$8888WWhhBBhhhh
    $$$$$$BBBBBBBBBB$$$$$$##$$BB8888$$$$BBhh$$BBBBBB$$88$$$$BB$$WW$$


As of right now, rendering is unimpressive as I am currently stuck with only orthographic views of the chunk. However, I would like to get
the chunk rendered in ascii colors and able to turn to a specified angle.
