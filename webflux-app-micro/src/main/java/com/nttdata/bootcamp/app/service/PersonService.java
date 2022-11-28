package com.nttdata.bootcamp.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.app.respository.Person;

import reactor.core.publisher.Flux;
@Service
public class PersonService {

	public Flux<Person> allPersons() {
		WebClient webClient = WebClient.create("http://localhost:9880");
		Flux<Person> person1 = webClient.get().uri("/person-list-1").retrieve().bodyToFlux(Person.class);
		Flux<Person> person2 = webClient.get().uri("/person-list-2").retrieve().bodyToFlux(Person.class);
		Flux<Person> person3 = webClient.get().uri("/person-list-3").retrieve().bodyToFlux(Person.class);
		Flux<Person> person4 = webClient.get().uri("/person-list-4").retrieve().bodyToFlux(Person.class);
		
		Flux<Person> AllPerson = Flux.merge(person1,person2,person3, person4);

		return AllPerson;
	}

}
