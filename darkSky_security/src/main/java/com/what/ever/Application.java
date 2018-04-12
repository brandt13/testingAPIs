package com.what.ever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
Caden:
A few general project comments:

It would be good to separate each project in the folder into their own intellij
projects and their own Github repos. This is generally a good thing to do for organization. If you want
to try to add a feature or something, make a new branch, make those changes and then you can merge afterwards
or just keep them on separate branches both of which can be on Github.

The project looks awesome. From here it would be good to go through and clean up any
code you have commented out and no longer need or any files you aren't using. It looks like
you are using api key auth instead of the bCryptPasswordEncoder so that would be something you
can eliminate. Just general cleaning up.

I added a new package in the resources package for DB dumps. Its nice to have for anyone
that wants to use the the program. The dumps you gave me have some data which is nice but you don't
want to include that you can just dump the db structure as well.

It looks like you took out the code that added the lat/long api info in your database. It looks like you
were on your way so id like too see that integrated because then your application would be using a db
for authentication and for storing data from an api call. You could then do interesting things with the
data or integrate more than one third party api.

Get started on those and then Ill take another look. Nice job!


 */

@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

//    @Override
//    protected SpringApplicationBuilder configure (SpringApplicationBuilder application){
//        return application.sources(Application.class);
//    }
}
