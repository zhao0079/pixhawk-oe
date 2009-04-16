

do_compile () {
    cd glow_src
    make 
    ln -s libglow.a.1.0.2 libglow.a

}

