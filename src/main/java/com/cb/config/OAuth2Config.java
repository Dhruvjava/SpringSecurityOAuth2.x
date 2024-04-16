//package com.cb.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class OAuth2Config {
//
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository(){
//        return new InMemoryClientRegistrationRepository(clientRegistration());
//    }
//
//    private ClientRegistration clientRegistration() {
////        return ClientRegistration.withRegistrationId("github")
////                .clientId("Iv1.d9e769c262bc4de0")
////                .clientSecret("f904c3354f40ca2d58abe19460965832f17874dd")
////                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
////                .scope("read")
////                .authorizationUri("https://github.com/login/oauth/authorize")
////                .tokenUri("https://github.com/login/oauth/access_token")
////                .userInfoUri("https://api.github.com/user")
////                .userNameAttributeName("id")
////                .clientName("Code Brains")
////                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
////                .redirectUri("{baseUrl}/login/oauth/code/{registrationId}")
////                .build();
//        return CommonOAuth2Provider.GITHUB.getBuilder("github")
//                .clientId("Iv1.d9e769c262bc4de0")
//                .clientSecret("f904c3354f40ca2d58abe19460965832f17874dd")
//                .build();
//    }
//
////    @Bean
////    public SecurityFilterChain githubSecurity(HttpSecurity http) throws Exception {
////        http.oauth2Login(oauth -> oauth.defaultSuccessUrl("/"));
////        http.authorizeHttpRequests(request-> request.anyRequest().authenticated());
////        return http.build();
////    }
//
//}
