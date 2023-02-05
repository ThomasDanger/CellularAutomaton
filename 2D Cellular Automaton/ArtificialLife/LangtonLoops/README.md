# LangtonLoops
`self-replicating automata`

This program allows you to view them at any given number of iterations and implements wrapping. 


The starting state is a simple langton loop:


           RRRRRRRR                                                            
          RBC BY BYR                          
          R RRRRRR R                         
          RCR    RBR                
          RBR    RBR                    
          R R    RBR                       
          RCR    RBR         
          RBRRRRRRBRRRRR      
          R CB CB CBBBBBR       
           RRRRRRRRRRRRR      


After ~150 iterations, the loops fully replicate themselves. Eventually, multiple generations are birthed. 


This example below is from iteration 600:

           RRRRRRRR   RRRRRRRR   RRRRRRRR   RRRRRRRBR  RRRRRRRR                                                 RRRRRRRRRRRRR   RRRRRRRG  
          RBBBBBBBBR RRBBBBBBBR RRBC BC BR RY BBBBBCR R BC BC BR                                               RBC BC BC BC BR RC BY BY R 
          RBRRRRRRBR RBRRRRRRBR RBRRRRRRCR RBRRRRRR R RCRRRRRRYR                                                RRRRRCRRRRRRCR RBRRRRRRBR 
          RBR    RBR RBR    RBR RBR    R R R R    RBR RBR    R R                                                    RBR    R R R R    RBR 
          RBR    RBR RBR    RBR RBR    RBR RYR    RCR R R    RBR                                                    R R    RBR RCR    RBR 
          R R    RBR RBR    RBR RBR    RCR RBR    R R RCR    RYR                                                    RCR    RCR RBR    RBR 
          RYR    RBR RBR    RBR RBR    R R R R    RBR RBR    R R                                                    RBR    R R R R    RBR 
          RBRRRRRRBR RBRRRRRRBR RBRRRRRRBR RCRRRRRRCR R RRRRRRBRRRR                                                 RBRRRRRRBR RCRRRRRRCR 
          R YB CBBRR RBBBBBBBBR RBBB YB YR RB CB CB R RCB CBBBBB CBR                                                RBBB YB YR RB CB CB R 
           GRRRRRRR   RRRRRRRR   RRRRRRRR   RRRRRRRR   RRRRRRRRRRRR                                                  RRRRRRRR  R RRRRRRR  
                                                                                                                               RCR        
           RRRRRRRG                                                                                                            RBR        
          RC BY BY R                                                                                                           R R        
          RBRRRRRRBR                                                                                                           RCR        
          R R    RBR                                                                                                           RBR        
          RCR    RBR                                                                                                            R         
          RBR    RBR                                                                                                                      
          R R    RBR                                                                                                                      
          RCRRRRRRCR                                                                                                                      
          RB CB CB R                                                                                                                      
          R RRRRRRR                                                                                                                       
          RCR                                                                                                                             
          RBR                                                                                                                             
          R R                                                                                                                             
          RCR                                                                                                                             
          RBR                                                                                                                             
           R      R                                                                                                                       
                 RBR                                                                                                                      
                 RBR                                                                                                                      
                 RBR                                                                                                                      
                 RBR                                                                                                                      
           RRRRRRRBR                                                                                                                      
          RY BBBBBCR                                                                                                                      
          RBRRRRRR R                                                                                                                      
          R R    RBR                                                                                                                      
          RYR    RCR                                                                                                                      
          RBR    R R                                                                                                                      
          R R    RBR         R                                                                                                            
          RCRRRRRRCR        RBR                                                                                                           
          RB CB CB R        RBR                                                                                                           
           RRRRRRRR         RBR                                                                                                           
                            RBR                                                                                                           
          RRRRRRRRR   RRRRRRRBR                                                                                                       RRRR
          C BC BC BR RY BBBBBCR                                                                                                      RBC B
          RCRRRRRRCR RBRRRRRR R                                                                                                       RRRR
          RBR    R R R R    RBR                                                                                                           
          R R    RBR RYR    RCR                                                                                                           
          RCR    RCR RBR    R R                                                                                                           
          RBR    R R R R    RBR         R                                                                                                 
          RBRRRRRRBR RCRRRRRRCR        RBR                                                                                                
          RBBB YB YR RB CB CB R        RBR                                                                                                
           RRRRRRRR   RRRRRRRR         RBR                                                                                                
                                       RBR                                                                                                
           RRRRRRRG   RRRRRRRR   RRRRRRRBR                                                                                 RRRRRRRRRRRRR  
          RC BY BY R RRBC BC BR RY BBBBBCR                                                                                RBC BC BC BC BR 
          RBRRRRRRBR RBRRRRRRCR RBRRRRRR R                                                                                 RRRRRCRRRRRRCR 
          R R    RBR RBR    R R R R    RBR                                                                                     RBR    R R 
          RCR    RBR RBR    RBR RYR    RCR                                                                                     R R    RBR 
          RBR    RBR RBR    RCR RBR    R R                                                                                     RCR    RCR 
          R R    RBR RBR    R R R R    RBR         R                                                                           RBR    R R 
          RCRRRRRRBR RBRRRRRRBR RCRRRRRRCR        RBR                                                                          RBRRRRRRBR 
          RRBBBBBBBR RBBB YB YR RB CB CB R        RBR                                                                          RBBB YB YR 
           RRRRRRRR   RRRRRRRR   RRRRRRRR         RBR                                                                           RRRRRRRR  
                                                  RBR                                                                                     

Going forward, I would like to create the other self-replicating loops such as Byl's loop, Chou-Reggia Loop, Tempesti Loop, Perrier Loop, Evoloop, and Sexyloop. Each of these loops are either simplified or add extra features to the Langston loops.
