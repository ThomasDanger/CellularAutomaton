# Byl's Loop
`Self Replicating Automaton`

## Background

Byl simplified Langton's loop by removing the inner sheath. The result is a more efficient (but less impressive looking) self-replicating loop. This program is a modified version of my Langton Loop project with a different ruleset.

## Problems Faced

The greatest problem faced was the lack of documentation regarding Byl's loop. What little information there was, was either incomplete or useless. Working with incomplete information, I was ultimately able to complete the information using trial and error.

## Example Output

#### Start
       RR 
      RGBR
      RGYR
       RM 

#### After 220 turns

      RR  MRR  MRR  MRR  MRR  MRR   RR       RRRRYRR   RR   RR   RR  
     RGBR GGGR GYGR GBYR GGBR GGGR RYGR GB  RGGBYGGBR RBYR RYGR RGGR 
     RGYG RYBR RBGR RGGR RGYR RYBR RBGGYBGGR  BG RGYR RGGG RBGG RYBG 
      RRM  RR   RR   RR   RR   RR   RRYRRRR       RR   RRM  RRM  RRM 

      RR   GGR  BGR                                    RR   RR   RR  
     RGGR   BR   GR                                   RGBR RBYR RYGR 
     RYBR  RYY  RBY  RR                               RGYG RGGG RBGG 
     YBR  RYGR RBYR RGBR                               RRM  RRM  RRM 
     RG   RBGR RGGR  BYR                                             
     RG    RR   RR    GR                               RR   RR   RR  
     RY               GR                              RGGR RGBR RBYR 
     RB   MRR  MRR   RBY  RR                          RYBR RGYG RGGG 
       BR GGGR GYGR RBYR RGBR                         YBR   RRM  RRM 
       YR RYBR RBGR RGGR  BYR                         RG             
       GR  RR   RR   RR    GR                         RG    RR   RR  
       GR                  GR                         RYB  RGGR RGBR 
      RBY MRR  MRR  MRR   RBY  RR                     RBGR RYBR RGYR 
     RBYR GGBR GGGR GYGR RBYR RGBR                     RR  YBR  YYR  
     RGGR RGYR RYBR RBGR RGGR  BYR                         RG   RB   
      RR   RR   RR   RR   RR    GR                         RGB  RGG  
                                GR                                   
      RR  MRR  MRR  MRR  MRR   RBY           RRRRYRR   RR   RR   RR  
     RYGR GBYR GGBR GGGR GYGR RBYR          RBYGGBYGR RGGR RGBR RBYR 
     RBGR RGGR RGYR RYBR RBGR RGGR          RGB  RBGR RYBR RGYR RGGR 
     MGR   RR   RR   RR   RR   RR            R    RR  MGR  MGR  MGR  

      RR  MRR  MRR  MRR  MRR  MRR       RRRRYRR   RR   RR   RR   RR  
     RGGR GYGR GBYR GGBR GGGR GYGR     RBYGGBYGR RGGR RGBR RBYR RYGR 
     RYBR RBGR RGGR RGYR RYBR RBGR     RGB  RBGR RYBR RGYR RGGR RBGR 
     MGR   RR   RR   RR   RR   RR       R    RR  MGR  MGR  MGR  MGR  
