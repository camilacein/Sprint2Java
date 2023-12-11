package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class HomebankingApplication<accountRepository> {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository){
		return args -> {
			Client cliente1 = new Client ("Melba", "Morel", "melba@mindhub.com");
			Client cliente2 = new Client("Camila", "Cein","ceincamila@gmail.com");
//			System.out.println(cliente1);
			clientRepository.save(cliente1);
		System.out.println(cliente1);
			clientRepository.save(cliente2);
			System.out.println(cliente2);

			Account account1= new Account("VIN001", LocalDate.now(),5000);
			Account account2= new Account("VIN002",LocalDate.now().plusDays(1),7500);
			Account account3= new Account("VIN003", LocalDate.now(), 10000);
			Account account4= new Account("VIN004", LocalDate.now(),5000);
			cliente1.addAccount(account1);
			cliente1.addAccount(account2);
			cliente2.addAccount(account3);
			cliente2.addAccount(account4);

			accountRepository.save(account1);
			accountRepository.save(account2);
			accountRepository.save(account3);
			accountRepository.save(account4);

			System.out.println(account1);
			System.out.println(account2);
			System.out.println(account3);
			System.out.println(account4);
			List<Client> clients= clientRepository.findAll();

		};
	}

}
