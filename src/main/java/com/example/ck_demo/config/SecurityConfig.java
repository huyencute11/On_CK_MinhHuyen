package com.example.ck_demo.config;

import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    private final DataSource dataSource;
//
//    @Value("${spring.admin.username}")
//    private String adminUserName;
//    @Value("${spring.admin.password}")
//    private String adminPassword;
//    @Value("${spring.queries.users-query}")
//    private String userQuery;
//    @Value("${spring.queries.roles-query}")
//    private String roleQuery;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery(userQuery)
//                .authoritiesByUsernameQuery(roleQuery)
//                .passwordEncoder(new BCryptPasswordEncoder());
//    }
//
//    public SecurityConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf(AbstractHttpConfigurer::disable);
//        http.authorizeHttpRequests(auth ->
//                auth
//                        .requestMatchers("/", "/home", "/index", "/login", "/register").permitAll()
//                        .anyRequest().authenticated()
//        );
//        http.formLogin(Customizer.withDefaults());
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
