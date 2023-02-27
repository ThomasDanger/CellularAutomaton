# Chou-Reggia Loop

`Self-Replicating Loop`

## Example Outputs

#### Starting

    BB 
    GYB

#### Turn 1

    BY 
    BGM

#### Turn 16 (This output is edited slightly but represents the expected output without wrapping)

     Y
    BB BY 
    GY BGM

#### Turn 200

    BB BY YG GB BB BY YG GB BB BY YG        BB GB YG BY BB GB YG BY 
    GY BG BB YB GY BG BB YB GY BG BB        GY YB BB BG GY YB BB BG 

    BY YG GB BB BY YG GB BB  C              BY BB GB YG BY BB GB YG 
    BG BB YB GY BG BB YB GYBBGC             BG GY YB BB BG GY YB BB 
                             C              GM                      
    YG GB BB BY YG GB BB  C                 YG BY BB GB YG BY BB GB 
    BB YB GY BG BB YB GYBBGC                BB BG GY YB BB BG GY YB 
                          C                 B  GM                   
                 C CCC                         YG BY BB GB YG BY    
                CG CBC                         BB BG GY YB BB BGM   
          BY YG GB BB                          B  GM                
        C BG BB YB GY CCC                         YG BY BB GB YG BY 
       CGC            CBC                         BB BG GY YB BB BG 
       GB BB BY YG GB BB                          B  GM             
       YB GY BG BB YB GY CCC                         YG BY BB GB YG 
     B                   CBC                         BB BG GY YB BB 
    BY YG GB BB BY YG GB BB                          B  G           
    BG BB YB GY BG BB YB GY CCC                         M           
                            CBC                                     
    BB BY YG GB BB BY YG GB BB                MGB YG BY BB GB YG BY 
    GY BG BB YB GY BG BB YB GY CCC             YB BB BG GY YB BB BG 
                               CBC                                  
    GB BB BY YG GB BB BY YG GB BB          MGB YG BY BB GB YG BY BB 
    YB GY BG BB YB GY BG BB YB GY CCC       YB BB BG GY YB BB BG GY 
                                  CBC                               
    YG GB BB BY YG GB BB BY YG GB BB    MGB YG BY BB GB YG BY BB GB 
    BB YB GY BG BB YB GY BG BB YB GY     YB BB BG GY YB BB BG GY YB 

    BY YG GB BB BY YG GB BB BY YG GB       YBY BB GB YG BY BB GB YG 
    BG BB YB GY BG BB YB GY BG BB YB        BG GY YB BB BG GY YB BB 
