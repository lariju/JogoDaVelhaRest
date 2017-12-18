/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


/**
 *
 * @author 20141D12GR0149
 */
@Path("joguinho")
public class Rest {
    static Main main = new Main();
    
    @GET
    @Path("jogar")
    public String jogar(@QueryParam("jog") String jogada){
        return main.jogar(jogada);
    }
    
    @GET
    @Path("verificar")
    public String verificarGanhador() {
        return main.verificarGanhador();
    }
    
    @GET
    @Path("resetar")
    public String resetar(){
        return main.resetar();
    }
    
}
