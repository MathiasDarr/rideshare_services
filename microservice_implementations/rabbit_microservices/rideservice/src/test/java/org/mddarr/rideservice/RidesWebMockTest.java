package org.mddarr.rideservice;


import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;


import org.mddarr.rideservice.controllers.RidesController;
import org.mddarr.rideservice.services.rides.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@WebMvcTest(RidesController.class)
public class RidesWebMockTest {
    /*
    Spring will inject the service which the controller is dependent upon
     */

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RideService rideService;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/rides")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ride")));
    }

    @Test
    public void shouldReturnRideRequests() throws Exception {

        ResultActions actions =  this.mockMvc.perform(get("/rides/requests")).andExpect(status().isOk());

    }

}
