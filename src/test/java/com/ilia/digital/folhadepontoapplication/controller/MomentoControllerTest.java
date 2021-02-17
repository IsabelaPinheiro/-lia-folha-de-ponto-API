package com.ilia.digital.folhadepontoapplication.controller;
/*
*
import com.ilia.digital.folhadepontoapplication.dto.MessageResponseDTO;
import com.ilia.digital.folhadepontoapplication.dto.MomentoDTO;
import lombok.SneakyThrows;
import org.hamcrest.core.Is;
import org.hibernate.jdbc.Expectation;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static com.ilia.digital.folhadepontoapplication.utils.MomentoUtils.asJsonString;
import static com.ilia.digital.folhadepontoapplication.utils.MomentoUtils.createFakeMomentoDTO;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
*
*/
import com.ilia.digital.folhadepontoapplication.service.MomentoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)

public class MomentoControllerTest {

    private MockMvc mockMvc;

    @Mock
    private MomentoService momentoService;

    @InjectMocks
    private MomentoController momentoController;

    //@SneakyThrows
    @BeforeEach
    void setUp() throws Exception {

        mockMvc = MockMvcBuilders.standaloneSetup(momentoController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((viewName, locale) -> new MappingJackson2JsonView())
                .build();

/*
        @Test
        void testWhenPOSTisCalledThenAMomentShouldBeCreated() throws Exception {
            MomentoDTO momentoDTO = createFakeMomentoDTO();
            MessageResponseDTO expectedMessageResponse = MessageResponseDTO.builder()
                    .message("Momento da batida do ponto registrado.")
                    .build();

            when(momentoService.create(momentoDTO)).thenReturn(expectedMessageResponse);

                mockMvc.perform(post("v1/batidas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(momentoDTO)))
                        .andExpect(status().isOk())
                        .andExpect(MockMvcResultMatchers.jsonPath("$.message", Is.is(expectedMessageResponse.getMessage())));

        }

        @Test
        void testWhenPOSTwithInvalidDateTimeIsCalledThenBadRequestShouldBeReturned() throws Exception{
            MomentoDTO momentoDTO = createFakeMomentoDTO();
            momentoDTO.setDataHora("Data e hora inválidos.");

            mockMvc.perform(post("v1/batidas")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(asJsonString(momentoDTO)))
                    .andExpect(status().isBadRequest());
        }
*/
    }

}

