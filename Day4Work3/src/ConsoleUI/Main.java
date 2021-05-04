package ConsoleUI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;
import Entities.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(2814, "ali.28@ali.com", "1234ali", 2801);
		User user2 = new User(1028, "enes.10@enes.com", "10enes10", 1001);
		User[] users = { user1, user2 };

		Customer customer1 = new Customer(2801, "Alı", "Konar", "58745895177", 1999);
		Customer customer2 = new Customer(1001, "Enes", "Kadumi", "12345678910", 2001);
		Customer[] customers = { customer1, customer2 };

		Game game1 = new Game(71, "Valorant", 0.0);
		Game game2 = new Game(84, "Forza Horizon 4", 92.0);
		Game[] games = { game1, game2 };

		Campaign campaign1 = new Campaign(14, "Valorant VP", 50);
		Campaign campaign2 = new Campaign(28, "Steam Discount", 49);
		Campaign[] campaigns = { campaign1, campaign2 };

		Order order1 = new Order(8547, 2801, 84, 28, LocalDate.now(), LocalTime.now());
		Order order2 = new Order(95478, 1001, 71, 14, LocalDate.now(), LocalTime.now());
		Order[] orders = { order1, order2 };

		System.out.println("     ");
		System.out.println("     ");
		System.out.println("------CustomerManager--------");
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		customerManager.update(customer2);

		System.out.println("     ");
		System.out.println("     ");
		System.out.println("------UserManager------");
		UserManager userManager = new UserManager();
		userManager.signIn(user1);
		userManager.update(user1);
		userManager.delete(user2);

		System.out.println("     ");
		System.out.println("--------OrderManager------");
		OrderManager orderManager = new OrderManager();
		orderManager.add(order1);
		orderManager.delete(order2);
		orderManager.update(order1);

		System.out.println("     ");
		System.out.println("-----GameManager-----");
		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.update(game1);

		System.out.println("     ");
		System.out.println("------CampaignManager-----");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign2);
		campaignManager.delete(campaign1);
		

	}

}
