//package br.com.projeto.dimotociclo.infraestructure.jpa.repository.impl;
//
//import br.com.projeto.dimotociclo.domain.model.AcessoUsuarioTelaModel;
//import br.com.projeto.dimotociclo.infraestructure.jpa.entity.AcessoUsuarioTelaEntity;
//import br.com.projeto.dimotociclo.infraestructure.jpa.mappers.AcessoUsuarioTelaMapper;
//import br.com.projeto.dimotociclo.infraestructure.jpa.repository.AcessoUsuarioTelaRepositoryJPA;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//class AcessoUsuarioTelaRepositoryJPAImplTest {
//
//  @InjectMocks private AcessoUsuarioTelaRepositoryJPAImpl usuarioTelaRepositoryJPA;
//
//  @Mock private AcessoUsuarioTelaRepositoryJPA acessoUsuarioTelaRepositoryJPA;
//  @Mock private AcessoUsuarioTelaMapper acessoUsuarioTelaMapper;
//
//  @Test
//  void teste_salvarUsuario() {
//
//    Mockito.when(
//            acessoUsuarioTelaRepositoryJPA.isExistPermissao(Mockito.anyString(), Mockito.anyLong()))
//        .thenReturn(AcessoUsuarioTelaEntity.builder().build());
//
//    this.usuarioTelaRepositoryJPA.salvarAcessoTela(AcessoUsuarioTelaModel.builder().codigoUsuario(1L).nomeTela("login").build());
//  }
//}
